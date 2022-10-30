package com.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    private String customer_name;
    private String email;
    private String mobile_number;
    private String city;
    private String customer_id;

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_name='" + customer_name + '\'' +
                ", email='" + email + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", city='" + city + '\'' +
                ", customer_id='" + customer_id + '\'' +
                '}';
    }
}
