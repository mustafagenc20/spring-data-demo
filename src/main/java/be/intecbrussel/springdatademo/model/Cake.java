package be.intecbrussel.springdatademo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "user")
public class Cake {

    @Id
    @GeneratedValue
    private Integer id;

    private boolean isAlie;
    private boolean hasChocolate;
    private String name;

    @OneToOne(mappedBy = "cake")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isAlie() {
        return isAlie;
    }

    public void setAlie(boolean alie) {
        isAlie = alie;
    }

    public boolean isHasChocolate() {
        return hasChocolate;
    }

    public void setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
