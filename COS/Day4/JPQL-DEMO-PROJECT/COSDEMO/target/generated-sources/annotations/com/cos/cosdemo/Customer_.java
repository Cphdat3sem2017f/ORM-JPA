package com.cos.cosdemo;

import com.cos.cosdemo.Purchase;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-08-24T09:51:29")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> zip;
    public static volatile SingularAttribute<Customer, Integer> income;
    public static volatile SingularAttribute<Customer, String> country;
    public static volatile SingularAttribute<Customer, String> firstname;
    public static volatile SingularAttribute<Customer, String> gender;
    public static volatile SingularAttribute<Customer, String> address2;
    public static volatile SingularAttribute<Customer, String> city;
    public static volatile SingularAttribute<Customer, String> address1;
    public static volatile SingularAttribute<Customer, String> creditcard;
    public static volatile SingularAttribute<Customer, String> lastname;
    public static volatile ListAttribute<Customer, Purchase> purchaseList;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> creditcardexpiration;
    public static volatile SingularAttribute<Customer, Integer> customerid;
    public static volatile SingularAttribute<Customer, String> state;
    public static volatile SingularAttribute<Customer, Short> region;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, Short> age;
    public static volatile SingularAttribute<Customer, Integer> creditcardtype;
    public static volatile SingularAttribute<Customer, String> username;

}