package jpacontrol;

import entity.Shoe;
import entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManageCascade
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        
        EntityManager em = emf.createEntityManager();
                
        em.getTransaction().begin();
        
        User u = new User("George", true);
        
        Shoe s1 = new Shoe("Running shoes");
        Shoe s2 = new Shoe("Walking shoes");
        
        u.addShoe(s1);
        u.addShoe(s2);
        
        em.persist(u);
        
        //em.remove(u);
        
        em.getTransaction().commit();
        
        em.close();
    }
}