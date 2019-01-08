package com.learningSpring.spring_parameter_filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("Employee")
public class Employee {
    Integer id;

    String name;
    String mobile;
    String land;
    String email;
    String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee() {
    }

    public Employee(Integer id, String name, String mobile, String land, String email, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.land = land;
        this.email = email;
        this.address = address;
    }
}
