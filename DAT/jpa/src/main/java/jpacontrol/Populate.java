package jpacontrol;

import entity.Address;
import entity.Shoe;
import entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Populate
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        
        EntityManager em = emf.createEntityManager();
                
        em.getTransaction().begin();

        User u = new User();
        u.setFirstName("William");
        
        Address a = new Address("high road 1", "new york");
        u.setAddress(a);
        
        em.persist(a);
        em.persist(u);

        User u2 = new User();
        u2.setFirstName("Bill");
        
        Address a2 = new Address("high road 1", "new york");
        u2.setAddress(a2);
        
        Shoe s1 = new Shoe();
        Shoe s2 = new Shoe();
        
        u.addShoe(s1);
        u.addShoe(s2);
        
        s1.addUser(u);
        s1.addUser(u2);
        
        em.persist(a2);
        em.persist(u2);
        em.persist(s1);
        em.persist(s2);
        
        em.getTransaction().commit();
        
        em.close();
    }
}