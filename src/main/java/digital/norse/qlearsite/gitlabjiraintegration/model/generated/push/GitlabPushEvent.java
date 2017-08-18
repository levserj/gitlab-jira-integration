package digital.norse.qlearsite.gitlabjiraintegration.model.generated.push;

import java.util.List;

/**
 * @author Sergiy Levchynskyi.
 */
// Generated
public class GitlabPushEvent {
    private String checkout_sha;
    private String before;
    private String user_email;
    private String after;
    private String message;
    private GitlabProject project;
    private String ref;
    private String user_name;
    private GitlabRepository repository;
    private String project_id;
    private String total_commits_count;
    private List<GitlabCommit> commits;
    private String user_id;
    private String object_kind;
    private String event_name;
    private String user_avatar;

    public String getCheckout_sha() {
        return checkout_sha;
    }

    public void setCheckout_sha(String checkout_sha) {
        this.checkout_sha = checkout_sha;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GitlabProject getProject() {
        return project;
    }

    public void setProject(GitlabProject project) {
        this.project = project;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public GitlabRepository getRepository() {
        return repository;
    }

    public void setRepository(GitlabRepository repository) {
        this.repository = repository;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getTotal_commits_count() {
        return total_commits_count;
    }

    public void setTotal_commits_count(String total_commits_count) {
        this.total_commits_count = total_commits_count;
    }

    public List<GitlabCommit> getCommits() {
        return commits;
    }

    public void setCommits(List<GitlabCommit> commits) {
        this.commits = commits;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getObject_kind() {
        return object_kind;
    }

    public void setObject_kind(String object_kind) {
        this.object_kind = object_kind;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    @Override
    public String toString() {
        return "ClassPojo [checkout_sha = " + checkout_sha + ", before = " + before + ", user_email = " + user_email + ", after = " + after + ", message = " + message + ", project = " + project + ", ref = " + ref + ", user_name = " + user_name + ", repository = " + repository + ", project_id = " + project_id + ", total_commits_count = " + total_commits_count + ", commits = " + commits + ", user_id = " + user_id + ", object_kind = " + object_kind + ", event_name = " + event_name + ", user_avatar = " + user_avatar + "]";
    }
}
