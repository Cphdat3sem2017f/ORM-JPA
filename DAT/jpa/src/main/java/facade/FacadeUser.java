package facade;

import entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class FacadeUser implements FacadeUserInterface
{
    private EntityManagerFactory emf;
    
    public FacadeUser(EntityManagerFactory emf)
    {
        this.emf = emf;
    }
    
    @Override
    public User getUser(Long id)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            User user = em.find(User.class, id);
            em.getTransaction().commit();
            return user;
        }
        finally
        {
            em.close();
        }
        
    }

    @Override
    public User addUser(User u)
    {
        EntityManager em = emf.createEntityManager();
       
        try
        {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
            return u;
        }
        finally
        {
            em.close();
        }
    }
    
    @Override
    public User deleteUser(Long id)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            User user = em.find(User.class, id); 
            if( user != null)
            {
                em.remove(user);
            }
            em.getTransaction().commit();
            return user;
        }
        finally
        {
            em.close();
        }
    }
    
    @Override
    public User editUser(User u)
    {
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            User user = em.find(User.class, u.getId());
            if( user != null)
            {
                em.merge(u);
            }
            em.getTransaction().commit();
            return user;
        }
        finally
        {
            em.close();
        }
    }
    
    @Override
    public List<User> getUsers()
    {
        EntityManager em = emf.createEntityManager();

        List<User> users = null;
        
        try
        {
            em.getTransaction().begin();
            users = em.createQuery("Select u from User u").getResultList();
            em.getTransaction().commit();
            return users;
        }
        finally
        {
            em.close();
        }
    }
}