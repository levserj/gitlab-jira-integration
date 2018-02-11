package com.levserj.gitlabjiraintegration.model.generated.merge;

import com.levserj.gitlabjiraintegration.model.generated.GitlabAuthor;

/**
 * @author Sergiy Levchynskyi.
 */
public class GitlabLastCommit {
    private String timestamp;

    private String message;

    private String id;

    private GitlabAuthor author;

    private String url;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public GitlabAuthor getAuthor ()
    {
        return author;
    }

    public void setAuthor (GitlabAuthor author)
    {
        this.author = author;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "GitlabLastCommit [timestamp = "+timestamp+", message = "+message+", id = "+id+", author = "+author+", url = "+url+"]";
    }
}
