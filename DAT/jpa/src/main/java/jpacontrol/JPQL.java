package jpacontrol;

import entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "jpaPU" );
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        //NamedQuery
        Query Nquery = em.createNamedQuery("UsersFindBorn"); 
        Nquery.setParameter("userBorn", true); 
        List<User> usersBorn = Nquery.getResultList(); 
        for(User u:usersBorn)
        {
            System.out.println("User: " + u);
        }

        //DynamicQuery1
        Query Dquery1 = em.createQuery("SELECT u FROM User u");
        List<User> usersAll = Dquery1.getResultList();
        for(User u:usersAll)
        {
            System.out.println("User: " + u);
        }

        //DynamicQuery2
        Query DQuery2 = em.createQuery("Select UPPER(u.firstName) from User u");
        List<String> firstnames = DQuery2.getResultList();
        for(String firstname:firstnames)
        {
            System.out.println("User: " + firstname);
        }
        
        //DynamicQuery3
        Query DQuery3 = em.createQuery("Select MAX(u.id) from User u");
        Long maximum = (Long) DQuery3.getSingleResult();
        System.out.println("Max UserID :" + maximum);

        em.getTransaction().commit();        
        em.close();
    }
}
