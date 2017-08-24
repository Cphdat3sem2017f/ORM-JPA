package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person")
@NamedQueries(
{
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
    , @NamedQuery(name = "Person.findByIdPerson", query = "SELECT p FROM Person p WHERE p.idPerson = :idPerson")
    , @NamedQuery(name = "Person.findByMail", query = "SELECT p FROM Person p WHERE p.mail = :mail")
})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPerson")
    private Integer idPerson;
    
    @Size(max = 45)
    @Column(name = "mail")
    private String mail;

    public Person()
    {
    }

    public Person(String mail)
    {
        this.mail = mail;
    }

    public Integer getIdPerson()
    {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson)
    {
        this.idPerson = idPerson;
    }

    public String getMail()
    {
        return mail;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idPerson != null ? idPerson.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person))
        {
            return false;
        }
        Person other = (Person) object;
        if ((this.idPerson == null && other.idPerson != null) || (this.idPerson != null && !this.idPerson.equals(other.idPerson)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entity.Person[ idPerson=" + idPerson + ", mail=" + mail + " ]";
    }

}
