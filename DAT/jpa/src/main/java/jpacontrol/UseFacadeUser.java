package jpacontrol;

import entity.User;
import facade.FacadeUser;
import javax.persistence.Persistence;

public class UseFacadeUser
{
    public static void main(String[] args)
    {
        FacadeUser fu = new FacadeUser( Persistence.createEntityManagerFactory( "jpaPU" ) );
        
        System.out.println("GetPerson: " + fu.getUser(222l).getFirstName() );
        
        System.out.println("GetPersons: " + fu.getUsers());
        
        System.out.println("AddPerson: " + fu.addUser(new User()));
        
        System.out.println("DeleteCustomer: " + fu.deleteUser(222l));
        
        User u = fu.getUser(223l);
        u.setFirstName("Michael");
        System.out.println("EditUser: " + fu.editUser(u));
        
        System.out.println("GetUsers: " + fu.getUsers() );
    }
}
