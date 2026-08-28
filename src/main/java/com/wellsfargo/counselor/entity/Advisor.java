package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@Entity
@Table(name = "advisors")
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }



    // Getters and Setters

    public Long getAdvisorId() {
        return advisorId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

//
//
//import jakarta.persistence.*;
//
//
//@Entity
//
//public class Advisor {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "advisor_id")
//    private Long id;
//
//    @Column(name = "first_name", nullable = false, length = 50)
//    private String firstName;
//
//    @Column(name = "last_name", nullable = false, length = 50)
//    private String lastName;

//    @Column(name = "email", nullable = false, unique = true, length = 100)
//    private String email;
//
//    @Column(name = "phone_number", length = 20)
//    private String phoneNumber;
//
//    // Prevents infinite JSON recursion when serializing
//    @JsonIgnore
//    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Client> clients;
//
//    public Advisor() {}
//
//    // Getters and Setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//    public String getFirstName() { return firstName; }
//    public void setFirstName(String firstName) { this.firstName = firstName; }
//    public String getLastName() { return lastName; }
//    public void setLastName(String lastName) { this.lastName = lastName; }
//    public String getEmail() { return email; }
//    public void setEmail(String email) { this.email = email; }
//    public String getPhoneNumber() { return phoneNumber; }
//    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
//    public List<Client> getClients() { return clients; }
//    public void setClients(List<Client> clients) { this.clients = clients; }
//}