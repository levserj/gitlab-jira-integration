package digital.norse.qlearsite.gitlabjiraintegration.model;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Sergiy Levchynskyi.
 */
public class RequestWithType {
    private GitlabEventType type;
    private String body;

    public RequestWithType() {
    }

    public RequestWithType(GitlabEventType type, String body) {
        this.type = type;
        this.body = body;
    }

    public GitlabEventType getType() {
        return type;
    }

    public void setType(GitlabEventType type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
