/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.cosdemo;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author bladt
 */
public class MainStuffs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.cos_COSDEMO_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT c, SUM(p.totalamount) as tsum FROM Customer c, Purchase p where p.customer = c GROUP BY c ORDER BY tsum desc");
        q.setMaxResults(10);
        List<Object[]> cs = q.getResultList();
        for (Object[] c : cs) {
            Customer cus = (Customer) c[0];
            BigInteger a = (BigInteger) c[1];
            System.out.println(cus.getFirstname() + " " + cus.getIncome() + " " + a);
        }
       
    }
    
}
