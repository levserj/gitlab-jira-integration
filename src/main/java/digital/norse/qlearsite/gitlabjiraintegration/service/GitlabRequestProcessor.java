package digital.norse.qlearsite.gitlabjiraintegration.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import digital.norse.qlearsite.gitlabjiraintegration.model.RequestWithType;
import digital.norse.qlearsite.gitlabjiraintegration.model.generated.merge.GitlabMergeEvent;
import digital.norse.qlearsite.gitlabjiraintegration.model.generated.push.GitlabCommit;
import digital.norse.qlearsite.gitlabjiraintegration.model.generated.push.GitlabPushEvent;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergiy Levchynskyi.
 */
@Service
public class GitlabRequestProcessor {
    private static final Logger LOGGER = LogManager.getLogger(GitlabRequestProcessor.class);
    private static final String ISSUE_PATTERN = "VENQLEARSITE-";
    private ObjectMapper om = new ObjectMapper();

    @Autowired
    private JiraIssueLinkCreator jiraIssueLinkCreator;

    public void processGitlabRequest(RequestWithType wrapper) {
        String body = wrapper.getBody();
        switch (wrapper.getType()) {
            case MERGE:
                processMergeEvent(body);
                break;
            case PUSH:
                processPushEvent(body);
                break;
        }
    }

    private void processPushEvent(String body) {
        GitlabPushEvent pushEvent = null;
        try {
            pushEvent = om.readValue(body, GitlabPushEvent.class);
        } catch (IOException e) {
            LOGGER.error(String.format("Failed to deserialize Push event body (%1$s) due to exception: %2$s", body, e));
        }
        if (pushEvent == null) {
            return;
        }
        Map<String, String> jiraIssues = new HashMap<>();
        for (GitlabCommit commit : pushEvent.getCommits()) {
            String issue = getJiraIssue(commit.getMessage());
            String commitUrl = commit.getUrl();
            if (StringUtils.isBlank(issue)) {
                continue;
            } else {
                if (StringUtils.isBlank(commitUrl)) {
                    continue;
                }
                jiraIssues.put(issue, commitUrl);
            }
        }
        jiraIssueLinkCreator.addLinksToIssue(jiraIssues);
        LOGGER.info(jiraIssues);
    }

    private void processMergeEvent(String body) {
        GitlabMergeEvent mergeEvent = null;
        try {
            mergeEvent = om.readValue(body, GitlabMergeEvent.class);
        } catch (IOException e) {
            LOGGER.error(String.format("Failed to deserialize Merge event body (%1$s) due to exception: %2$s", body, e));
        }
        LOGGER.info(mergeEvent.getGitlabUser().getName());
    }

    private String getJiraIssue(String message) {
        int indexStart = message.indexOf(ISSUE_PATTERN);
        if (indexStart < 0) {
            return StringUtils.EMPTY;
        }
        int indexEnd = indexStart + ISSUE_PATTERN.length() + 4;
        return message.substring(indexStart, indexEnd);
    }

}
