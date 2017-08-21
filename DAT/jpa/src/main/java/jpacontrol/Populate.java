package jpacontrol;

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
        em.persist(u);

        em.getTransaction().commit();
        em.close();
    }
}
