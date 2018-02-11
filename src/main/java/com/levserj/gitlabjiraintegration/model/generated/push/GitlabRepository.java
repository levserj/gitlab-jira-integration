package com.levserj.gitlabjiraintegration.model.generated.push;

/**
 * @author Sergiy Levchynskyi.
 */
// Generated
public class GitlabRepository {
    private String git_ssh_url;
    private String visibility_level;
    private String description;
    private String name;
    private String git_http_url;
    private String homepage;
    private String url;

    public String getGit_ssh_url() {
        return git_ssh_url;
    }

    public void setGit_ssh_url(String git_ssh_url) {
        this.git_ssh_url = git_ssh_url;
    }

    public String getVisibility_level() {
        return visibility_level;
    }

    public void setVisibility_level(String visibility_level) {
        this.visibility_level = visibility_level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGit_http_url() {
        return git_http_url;
    }

    public void setGit_http_url(String git_http_url) {
        this.git_http_url = git_http_url;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ClassPojo [git_ssh_url = " + git_ssh_url + ", visibility_level = " + visibility_level + ", description = " + description + ", name = " + name + ", git_http_url = " + git_http_url + ", homepage = " + homepage + ", url = " + url + "]";
    }
}
