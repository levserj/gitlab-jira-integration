package digital.norse.qlearsite.gitlabjiraintegration.model.generated.merge;

/**
 * @author Sergiy Levchynskyi.
 */
public class GitlabObjectAttributes {
    private String target_branch;

    private String milestone_id;

    private String work_in_progress;

    private String st_commits;

    private String iid;

    private String state;

    private GitlabAssignee gitlabAssignee;

    private String url;

    private String target_project_id;

    private String id;

    private GitlabLastCommit last_commit;

    private String title;

    private String updated_at;

    private String st_diffs;

    private GitlabSource gitlabSource;

    private String assignee_id;

    private String description;

    private String source_branch;

    private String action;

    private GitlabTarget gitlabTarget;

    private String source_project_id;

    private String created_at;

    private String author_id;

    private String merge_status;

    public String getTarget_branch ()
    {
        return target_branch;
    }

    public void setTarget_branch (String target_branch)
    {
        this.target_branch = target_branch;
    }

    public String getMilestone_id ()
    {
        return milestone_id;
    }

    public void setMilestone_id (String milestone_id)
    {
        this.milestone_id = milestone_id;
    }

    public String getWork_in_progress ()
    {
        return work_in_progress;
    }

    public void setWork_in_progress (String work_in_progress)
    {
        this.work_in_progress = work_in_progress;
    }

    public String getSt_commits ()
    {
        return st_commits;
    }

    public void setSt_commits (String st_commits)
    {
        this.st_commits = st_commits;
    }

    public String getIid ()
    {
        return iid;
    }

    public void setIid (String iid)
    {
        this.iid = iid;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public GitlabAssignee getGitlabAssignee()
    {
        return gitlabAssignee;
    }

    public void setGitlabAssignee(GitlabAssignee gitlabAssignee)
    {
        this.gitlabAssignee = gitlabAssignee;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getTarget_project_id ()
    {
        return target_project_id;
    }

    public void setTarget_project_id (String target_project_id)
    {
        this.target_project_id = target_project_id;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public GitlabLastCommit getLast_commit ()
    {
        return last_commit;
    }

    public void setLast_commit (GitlabLastCommit last_commit)
    {
        this.last_commit = last_commit;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getSt_diffs ()
    {
        return st_diffs;
    }

    public void setSt_diffs (String st_diffs)
    {
        this.st_diffs = st_diffs;
    }

    public GitlabSource getGitlabSource()
    {
        return gitlabSource;
    }

    public void setGitlabSource(GitlabSource gitlabSource)
    {
        this.gitlabSource = gitlabSource;
    }

    public String getAssignee_id ()
    {
        return assignee_id;
    }

    public void setAssignee_id (String assignee_id)
    {
        this.assignee_id = assignee_id;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getSource_branch ()
    {
        return source_branch;
    }

    public void setSource_branch (String source_branch)
    {
        this.source_branch = source_branch;
    }

    public String getAction ()
    {
        return action;
    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public GitlabTarget getGitlabTarget()
    {
        return gitlabTarget;
    }

    public void setGitlabTarget(GitlabTarget gitlabTarget)
    {
        this.gitlabTarget = gitlabTarget;
    }

    public String getSource_project_id ()
    {
        return source_project_id;
    }

    public void setSource_project_id (String source_project_id)
    {
        this.source_project_id = source_project_id;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getAuthor_id ()
    {
        return author_id;
    }

    public void setAuthor_id (String author_id)
    {
        this.author_id = author_id;
    }

    public String getMerge_status ()
    {
        return merge_status;
    }

    public void setMerge_status (String merge_status)
    {
        this.merge_status = merge_status;
    }

    @Override
    public String toString()
    {
        return "GitlabObjectAttributes [target_branch = "+target_branch+", milestone_id = "+milestone_id+", work_in_progress = "+work_in_progress+", st_commits = "+st_commits+", iid = "+iid+", state = "+state+", gitlabAssignee = "+ gitlabAssignee +", url = "+url+", target_project_id = "+target_project_id+", id = "+id+", last_commit = "+last_commit+", title = "+title+", updated_at = "+updated_at+", st_diffs = "+st_diffs+", gitlabSource = "+ gitlabSource +", assignee_id = "+assignee_id+", description = "+description+", source_branch = "+source_branch+", action = "+action+", gitlabTarget = "+ gitlabTarget +", source_project_id = "+source_project_id+", created_at = "+created_at+", author_id = "+author_id+", merge_status = "+merge_status+"]";
    }
}
