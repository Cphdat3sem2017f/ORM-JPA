package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@NamedQueries(
{
    @NamedQuery(name = "UsersFindBorn", query = "SELECT u FROM User u WHERE u.born = :userBorn")
})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @TableGenerator(name="TG", allocationSize = 30, initialValue = 222)
    @GeneratedValue(strategy = GenerationType.TABLE, generator="TG")
    private Long id;
    
    private String firstName;

    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @Temporal(TemporalType.TIME)
    private Date testDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;
    
    private boolean born;
    
    @Transient
    private String temp;
    
    private Address address;

    @ManyToMany//(cascade=CascadeType.PERSIST)
    private List<Shoe> shoes = new ArrayList<>();

    public User()
    {
    }

    public User(String firstName, boolean born)
    {
        this.firstName = firstName;
        this.born = born;
    }
    
    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public List<Shoe> getShoes()
    {
        return shoes;
    }
    
    public void addShoe(Shoe s)
    {
        this.shoes.add(s);
    }

    public void setShoes(List<Shoe> shoes)
    {
        this.shoes = shoes;
    }
    
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User))
        {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entity.User[ id=" + id + ", firstName=" + firstName + ", born=" + born + " ]";
    }

}
