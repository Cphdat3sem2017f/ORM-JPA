/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.cosdemo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bladt
 */
@Entity
@Table(name = "customers")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustomerid", query = "SELECT c FROM Customer c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "Customer.findByFirstname", query = "SELECT c FROM Customer c WHERE c.firstname = :firstname")
    , @NamedQuery(name = "Customer.findByLastname", query = "SELECT c FROM Customer c WHERE c.lastname = :lastname")
    , @NamedQuery(name = "Customer.findByAddress1", query = "SELECT c FROM Customer c WHERE c.address1 = :address1")
    , @NamedQuery(name = "Customer.findByAddress2", query = "SELECT c FROM Customer c WHERE c.address2 = :address2")
    , @NamedQuery(name = "Customer.findByCity", query = "SELECT c FROM Customer c WHERE c.city = :city")
    , @NamedQuery(name = "Customer.findByState", query = "SELECT c FROM Customer c WHERE c.state = :state")
    , @NamedQuery(name = "Customer.findByZip", query = "SELECT c FROM Customer c WHERE c.zip = :zip")
    , @NamedQuery(name = "Customer.findByCountry", query = "SELECT c FROM Customer c WHERE c.country = :country")
    , @NamedQuery(name = "Customer.findByRegion", query = "SELECT c FROM Customer c WHERE c.region = :region")
    , @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email")
    , @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone")
    , @NamedQuery(name = "Customer.findByCreditcardtype", query = "SELECT c FROM Customer c WHERE c.creditcardtype = :creditcardtype")
    , @NamedQuery(name = "Customer.findByCreditcard", query = "SELECT c FROM Customer c WHERE c.creditcard = :creditcard")
    , @NamedQuery(name = "Customer.findByCreditcardexpiration", query = "SELECT c FROM Customer c WHERE c.creditcardexpiration = :creditcardexpiration")
    , @NamedQuery(name = "Customer.findByUsername", query = "SELECT c FROM Customer c WHERE c.username = :username")
    , @NamedQuery(name = "Customer.findByPassword", query = "SELECT c FROM Customer c WHERE c.password = :password")
    , @NamedQuery(name = "Customer.findByAge", query = "SELECT c FROM Customer c WHERE c.age = :age")
    , @NamedQuery(name = "Customer.findByIncome", query = "SELECT c FROM Customer c WHERE c.income = :income")
    , @NamedQuery(name = "Customer.findByGender", query = "SELECT c FROM Customer c WHERE c.gender = :gender")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer customerid;
    @Basic(optional = false)
    private String firstname;
    @Basic(optional = false)
    private String lastname;
    @Basic(optional = false)
    private String address1;
    private String address2;
    @Basic(optional = false)
    private String city;
    private String state;
    private String zip;
    @Basic(optional = false)
    private String country;
    @Basic(optional = false)
    private short region;
    private String email;
    private String phone;
    @Basic(optional = false)
    private int creditcardtype;
    @Basic(optional = false)
    private String creditcard;
    @Basic(optional = false)
    private String creditcardexpiration;
    @Basic(optional = false)
    private String username;
    @Basic(optional = false)
    private String password;
    private Short age;
    private Integer income;
    private String gender;
    @OneToMany(mappedBy = "customer")
    private List<Purchase> purchaseList;

    public Customer() {
    }

    public Customer(Integer customerid) {
        this.customerid = customerid;
    }

    public Customer(Integer customerid, String firstname, String lastname, String address1, String city, String country, short region, int creditcardtype, String creditcard, String creditcardexpiration, String username, String password) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address1 = address1;
        this.city = city;
        this.country = country;
        this.region = region;
        this.creditcardtype = creditcardtype;
        this.creditcard = creditcard;
        this.creditcardexpiration = creditcardexpiration;
        this.username = username;
        this.password = password;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public short getRegion() {
        return region;
    }

    public void setRegion(short region) {
        this.region = region;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCreditcardtype() {
        return creditcardtype;
    }

    public void setCreditcardtype(int creditcardtype) {
        this.creditcardtype = creditcardtype;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }

    public String getCreditcardexpiration() {
        return creditcardexpiration;
    }

    public void setCreditcardexpiration(String creditcardexpiration) {
        this.creditcardexpiration = creditcardexpiration;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerid != null ? customerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerid == null && other.customerid != null) || (this.customerid != null && !this.customerid.equals(other.customerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cos.cosdemo.Customer[ customerid=" + customerid + " ]";
    }
    
}
