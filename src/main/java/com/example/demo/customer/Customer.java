package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Customer {

    @Id
    private Long id;

    @NotBlank(message = "name must be entered")
    private String name;

    @NotBlank(message = "password must be entered")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotBlank(message = "email must be entered")
    @Email
    private String email;

//    public Customer(Long id, String name, String password, String email) {
//        this.id = id;
//        this.name = name;
//        this.password = password;
//        this.email = email;
//    }    * instead of this we use @AllargsConstructor

//    public Customer() {
//    }   * instead of this we use noArgsconstructor


    @JsonProperty("customerId")   //instead of ID we get customerId
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore //to hide the password from client
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }        instead of this we use @ToString
}

