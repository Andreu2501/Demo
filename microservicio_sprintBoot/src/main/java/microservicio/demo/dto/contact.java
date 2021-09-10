/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microservicio.demo.dto;

/**
 *
 * @author Antonio
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
public class contact implements Serializable{
    
    private static final long serialVersionUID = 4894729030347835498L;
    @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    
   
    
    public contact(Long id, String firstName, String lastName, String phoneNumber, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
       
    }

    @Override
    public String toString() {
        return "contact{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
