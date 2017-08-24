package com.cos.cosdemo;

import com.cos.cosdemo.Customer;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-08-24T09:51:29")
@StaticMetamodel(Purchase.class)
public class Purchase_ { 

    public static volatile SingularAttribute<Purchase, BigInteger> totalamount;
    public static volatile SingularAttribute<Purchase, Integer> orderid;
    public static volatile SingularAttribute<Purchase, BigInteger> tax;
    public static volatile SingularAttribute<Purchase, Date> orderdate;
    public static volatile SingularAttribute<Purchase, BigInteger> netamount;
    public static volatile SingularAttribute<Purchase, Customer> customer;

}