package com.levserj.gitlabjiraintegration.model.generated.merge;

/**
 * @author Sergiy Levchynskyi.
 */
public class GitlabMergeEvent
{
    private GitlabObjectAttributes object_attributes;

    private String object_kind;

    private GitlabUser user;

    public GitlabObjectAttributes getObject_attributes ()
    {
        return object_attributes;
    }

    public void setObject_attributes (GitlabObjectAttributes object_attributes)
    {
        this.object_attributes = object_attributes;
    }

    public String getObject_kind ()
    {
        return object_kind;
    }

    public void setObject_kind (String object_kind)
    {
        this.object_kind = object_kind;
    }

    public GitlabUser getGitlabUser()
    {
        return user;
    }

    public void setGitlabUser(GitlabUser gitlabUser)
    {
        this.user = gitlabUser;
    }

    @Override
    public String toString()
    {
        return "GitlabMergeEvent [object_attributes = "+object_attributes+", object_kind = "+object_kind+", gitlabUser = "+ user +"]";
    }
}
