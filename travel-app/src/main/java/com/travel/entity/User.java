package com.travel.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
//    @Size(min = 8, max = 50)
//    @Min(value = 6, message = "Age should not be less than 18")
//    @NotEmpty(message = "Username is required")
    private String username;

    @Column(unique = true)
//    @NotEmpty(message = "Email is required")
//    @Size(min = 3, max = 100)
    private String email;

    @Column(name = "full_name")
//    @NotEmpty(message = "Full name is required")
    private String fullName;

    @Column(name = "date_Birth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dOfB;

    @Column(name = "gender")
//    @NotEmpty(message = "Sex is required")
    private boolean gender;

    @Column(unique = true)
//    @Size(min = 1, max = 6)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getdOB() {
        return dOfB;
    }

    public void setdOB(Date dOB) {
        this.dOfB = dOB;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dOB=" + dOfB +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                '}';
    }

}
