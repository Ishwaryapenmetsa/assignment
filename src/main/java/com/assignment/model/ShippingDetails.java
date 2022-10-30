package com.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shipping_details")
public class ShippingDetails {
    private String Address;
    private String city;
    private String pincode;
    private String purchase_order_id;
    private String customer_id;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPurchase_order_id() {
        return purchase_order_id;
    }

    public void setPurchase_order_id(String purchase_order_id) {
        this.purchase_order_id = purchase_order_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "ShippingDetails{" +
                "Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", purchase_order_id='" + purchase_order_id + '\'' +
                ", customer_id='" + customer_id + '\'' +
                '}';
    }
}
