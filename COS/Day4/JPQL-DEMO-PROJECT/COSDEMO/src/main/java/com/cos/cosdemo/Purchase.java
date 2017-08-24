/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.cosdemo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bladt
 */
@Entity
@Table(name = "orders")
@NamedQueries({
    @NamedQuery(name = "Purchase.findAll", query = "SELECT p FROM Purchase p")
    , @NamedQuery(name = "Purchase.findByOrderid", query = "SELECT p FROM Purchase p WHERE p.orderid = :orderid")
    , @NamedQuery(name = "Purchase.findByOrderdate", query = "SELECT p FROM Purchase p WHERE p.orderdate = :orderdate")
    , @NamedQuery(name = "Purchase.findByNetamount", query = "SELECT p FROM Purchase p WHERE p.netamount = :netamount")
    , @NamedQuery(name = "Purchase.findByTax", query = "SELECT p FROM Purchase p WHERE p.tax = :tax")
    , @NamedQuery(name = "Purchase.findByTotalamount", query = "SELECT p FROM Purchase p WHERE p.totalamount = :totalamount")})
public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer orderid;
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date orderdate;
    @Basic(optional = false)
    private BigInteger netamount;
    @Basic(optional = false)
    private BigInteger tax;
    @Basic(optional = false)
    private BigInteger totalamount;
    @JoinColumn(name = "customerid", referencedColumnName = "customerid")
    @ManyToOne
    private Customer customer;

    public Purchase() {
    }

    public Purchase(Integer orderid) {
        this.orderid = orderid;
    }

    public Purchase(Integer orderid, Date orderdate, BigInteger netamount, BigInteger tax, BigInteger totalamount) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.netamount = netamount;
        this.tax = tax;
        this.totalamount = totalamount;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public BigInteger getNetamount() {
        return netamount;
    }

    public void setNetamount(BigInteger netamount) {
        this.netamount = netamount;
    }

    public BigInteger getTax() {
        return tax;
    }

    public void setTax(BigInteger tax) {
        this.tax = tax;
    }

    public BigInteger getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigInteger totalamount) {
        this.totalamount = totalamount;
    }

    public Customer getCustomerid() {
        return customer;
    }

    public void setCustomerid(Customer customerid) {
        this.customer = customerid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchase)) {
            return false;
        }
        Purchase other = (Purchase) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cos.cosdemo.Purchase[ orderid=" + orderid + " ]";
    }
    
}
