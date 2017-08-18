package digital.norse.qlearsite.gitlabjiraintegration.model.generated.merge;

/**
 * @author Sergiy Levchynskyi.
 */

public class GitlabUser
{
    private String avatar_url;

    private String username;

    private String name;

    public String getAvatar_url ()
    {
        return avatar_url;
    }

    public void setAvatar_url (String avatar_url)
    {
        this.avatar_url = avatar_url;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "GitlabUser [avatar_url = "+avatar_url+", username = "+username+", name = "+name+"]";
    }
}
