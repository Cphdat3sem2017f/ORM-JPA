package facade;

import entity.User;
import java.util.List;

public interface FacadeUserInterface
{
    public User getUser(Long id);
    public User addUser(User u);
    public User deleteUser(Long id);
    public User editUser(User u);
    public List<User> getUsers();
}
