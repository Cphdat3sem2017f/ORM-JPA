package jpacontrol;

import entity.Address;
import entity.Shoe;
import entity.User;
import entity.UserBasic;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Populate2
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        
        EntityManager em = emf.createEntityManager();
                
        em.getTransaction().begin();

        User u = new User();
        u.setFirstName("William");
        em.persist(u);
        u.setFirstName("George");
        em.persist(u);
        
        User u1 = new User();
        u1.setFirstName("John");
        u1.setId(222l);
        em.merge(u1);
        u1.setFirstName("Jack");
        em.merge(u1);
        
        User u2 = em.find(User.class, 222l);
        System.out.println("FUNDET: " + u2.getFirstName());
        u2.setFirstName("NoName");
        
        em.merge(u2);
        
        em.remove(u2);
        
        
        
        em.getTransaction().commit();
        
        em.close();
    }
}