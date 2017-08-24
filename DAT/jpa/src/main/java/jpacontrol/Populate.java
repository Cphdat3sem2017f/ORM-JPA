package jpacontrol;

import entity.Address;
import entity.Person;
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

        // Person
        Person p = new Person("mymail@mymail.com");
        p.setIdPerson(1);
        em.persist(p);

        // Addresses
        Address a = new Address("high road 1", "new york");
        Address a2 = new Address("high road 1", "new york");
        em.persist(a);
        em.persist(a2);

        // Users
        User u1 = new User("William", true);
        User u2 = new User("Bill", true);
        User u3 = new User("Johnny", true);
        User u4 = new User("Anthony", true);
        User u5 = new User("Richard", false);
        User u6 = new User("Benjamin", false);
        User u7 = new User("Larry", false);
        u1.setAddress(a);
        u2.setAddress(a2);
        em.persist(u1);
        em.persist(u2);
        em.persist(u3);
        em.persist(u4);
        em.persist(u5);
        em.persist(u6);
        em.persist(u7);
        
        // Shoes
        Shoe s1 = new Shoe("Walking shoes");
        Shoe s2 = new Shoe("Running shoes");
        em.persist(s1);
        em.persist(s2);
        
        // Relationships
        u1.addShoe(s1);
        u1.addShoe(s2);
        s1.addUser(u1);
        s1.addUser(u2);
                       
        em.getTransaction().commit();
        
        em.close();
    }
}