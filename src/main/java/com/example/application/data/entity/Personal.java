package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @Column(name = "id_pers", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "firstName", nullable = false, length = 45)
    private String firstName;

    @Size(max = 45)
    @NotNull
    @Column(name = "lastName", nullable = false, length = 45)
    private String lastName;

    @Size(max = 45)
    @NotNull
    @Column(name = "sex", nullable = false, length = 45)
    private String sex;

    @Size(max = 45)
    @NotNull
    @Column(name = "address", nullable = false, length = 45)
    private String address;

    @Size(max = 45)
    @NotNull
    @Column(name = "ph_number", nullable = false, length = 45)
    private String phNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

}