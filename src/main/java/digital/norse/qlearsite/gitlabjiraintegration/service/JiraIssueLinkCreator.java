package digital.norse.qlearsite.gitlabjiraintegration.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author Sergiy Levchynskyi.
 */
@Service
public class JiraIssueLinkCreator {
    private RestTemplate restTemplate;

    public void addLinkToIssue(Map<String, String> jiraIssues) {

    }
}
