package com.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_order")
public class PurchaseOrder {
    private String product_name;
    private long quantity;
    private float pricing;
    private float mrp;
    private String  purchase_order_id;
    private String  customer_id;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public float getPricing() {
        return pricing;
    }

    public void setPricing(float pricing) {
        this.pricing = pricing;
    }

    public float getMrp() {
        return mrp;
    }

    public void setMrp(float mrp) {
        this.mrp = mrp;
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
        return "PurchaseOrder{" +
                "product_name='" + product_name + '\'' +
                ", quantity=" + quantity +
                ", pricing=" + pricing +
                ", mrp=" + mrp +
                ", purchase_order_id='" + purchase_order_id + '\'' +
                ", customer_id='" + customer_id + '\'' +
                '}';
    }
}
