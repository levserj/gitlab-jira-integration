package digital.norse.qlearsite.gitlabjiraintegration.controller;

import digital.norse.qlearsite.gitlabjiraintegration.model.GitlabEventType;
import digital.norse.qlearsite.gitlabjiraintegration.model.RequestWithType;
import digital.norse.qlearsite.gitlabjiraintegration.service.GitlabRequestProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Sergiy Levchynskyi.
 */
@RestController()
@RequestMapping("/rest")
public class RestServiceController {
    private static final Logger LOGGER = LogManager.getLogger(RestServiceController.class);
    private static final String GITLAB_EVENT_HEADER = "X-Gitlab-Event";
    private static final String EVENT_PUSH_HEADER = "Push Hook";
    private static final String EVENT_MERGE_HEADER = "Merge Request Hook";

    @Autowired
    private GitlabRequestProcessor processor;

    @RequestMapping(value = "/gitlab", method = RequestMethod.POST)
    public ResponseEntity handleGitlabEvent(@RequestHeader(GITLAB_EVENT_HEADER) String eventHeader,
                                            @RequestBody String body) {
        LOGGER.info("TUC-TUC");
        GitlabEventType eventType = getTypeByHeader(eventHeader);
        RequestWithType wrapper = new RequestWithType(eventType, body);
        processor.processGitlabRequest(wrapper);
        return ResponseEntity.ok("{}");
    }

    private GitlabEventType getTypeByHeader(String requestHeader) {
        GitlabEventType result = null;
        switch (requestHeader) {
            case EVENT_PUSH_HEADER:
                result = GitlabEventType.PUSH;
                break;
            case EVENT_MERGE_HEADER:
                result = GitlabEventType.MERGE;
                break;
        }
        return result;
    }
}
