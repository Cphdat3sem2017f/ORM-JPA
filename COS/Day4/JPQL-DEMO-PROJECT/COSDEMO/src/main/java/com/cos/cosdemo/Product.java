/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.cosdemo;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author bladt
 */
@Entity
@Table(name = "products")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProdId", query = "SELECT p FROM Product p WHERE p.prodId = :prodId")
    , @NamedQuery(name = "Product.findByCategory", query = "SELECT p FROM Product p WHERE p.category = :category")
    , @NamedQuery(name = "Product.findByTitle", query = "SELECT p FROM Product p WHERE p.title = :title")
    , @NamedQuery(name = "Product.findByActor", query = "SELECT p FROM Product p WHERE p.actor = :actor")
    , @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price")
    , @NamedQuery(name = "Product.findBySpecial", query = "SELECT p FROM Product p WHERE p.special = :special")
    , @NamedQuery(name = "Product.findByCommonProdId", query = "SELECT p FROM Product p WHERE p.commonProdId = :commonProdId")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prod_id")
    private Integer prodId;
    @Basic(optional = false)
    private short category;
    @Basic(optional = false)
    private String title;
    @Basic(optional = false)
    private String actor;
    @Basic(optional = false)
    private BigInteger price;
    private Short special;
    @Basic(optional = false)
    @Column(name = "common_prod_id")
    private int commonProdId;

    public Product() {
    }

    public Product(Integer prodId) {
        this.prodId = prodId;
    }

    public Product(Integer prodId, short category, String title, String actor, BigInteger price, int commonProdId) {
        this.prodId = prodId;
        this.category = category;
        this.title = title;
        this.actor = actor;
        this.price = price;
        this.commonProdId = commonProdId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public short getCategory() {
        return category;
    }

    public void setCategory(short category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public Short getSpecial() {
        return special;
    }

    public void setSpecial(Short special) {
        this.special = special;
    }

    public int getCommonProdId() {
        return commonProdId;
    }

    public void setCommonProdId(int commonProdId) {
        this.commonProdId = commonProdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodId != null ? prodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.prodId == null && other.prodId != null) || (this.prodId != null && !this.prodId.equals(other.prodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cos.cosdemo.Product[ prodId=" + prodId + " ]";
    }
    
}
