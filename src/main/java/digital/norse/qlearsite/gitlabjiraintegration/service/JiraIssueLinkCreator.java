package digital.norse.qlearsite.gitlabjiraintegration.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author Sergiy Levchynskyi.
 */
@Service
public class JiraIssueLinkCreator {
    private static final Logger LOGGER = LogManager.getLogger(JiraIssueLinkCreator.class);
    private static final String restUrl = "https://support.norse.digital/jira/rest/api/latest/issue/%1$s/remotelink";
    private static final String title = "This issue was mentioned in ";
    private RestTemplate restTemplate = new RestTemplate();

    public void addLinksToIssue(Map<String, String> jiraIssues) {
        JSONObject payload = new JSONObject();

        JSONObject object = new JSONObject();


        for (Map.Entry<String, String> jiraIssue : jiraIssues.entrySet()){
            String issueRestUrl = String.format(restUrl, jiraIssue.getKey());
            object.put("url", String.format(restUrl, jiraIssue.getValue()));
            object.put("title", title);
            payload.put("object", object);
            try {
                ResponseEntity<Void> responseEntity = restTemplate.postForEntity(issueRestUrl, payload, Void.class);
                LOGGER.info(String.format("Added link to gitlab commit to Jira Issue %1$s with response code %2$s",
                        jiraIssue.getKey(), responseEntity.getStatusCode()));
            } catch (Exception e) {
                LOGGER.error(String.format("Failed to create jira issue link due to exception %1$s", e));
            }

        }
    }
}
