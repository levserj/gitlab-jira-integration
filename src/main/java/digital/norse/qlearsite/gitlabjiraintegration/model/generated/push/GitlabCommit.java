package digital.norse.qlearsite.gitlabjiraintegration.model.generated.push;

import digital.norse.qlearsite.gitlabjiraintegration.model.generated.GitlabAuthor;

/**
 * @author Sergiy Levchynskyi.
 */
// Generated
public class GitlabCommit {
    private String timestamp;
    private String message;
    private String id;
    private GitlabAuthor author;
    private String[] added;
    private String[] removed;
    private String url;
    private String[] modified;

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

    public String[] getAdded ()
    {
        return added;
    }

    public void setAdded (String[] added)
    {
        this.added = added;
    }

    public String[] getRemoved ()
    {
        return removed;
    }

    public void setRemoved (String[] removed)
    {
        this.removed = removed;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String[] getModified ()
    {
        return modified;
    }

    public void setModified (String[] modified)
    {
        this.modified = modified;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", message = "+message+", id = "+id+", author = "+author+", added = "+added+", removed = "+removed+", url = "+url+", modified = "+modified+"]";
    }
}
