package com.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String product_id;
    private String quantity;
    private String product_name;
//    @CreatedDate
//    @Column(nullable = false, updatable = false)
//    private LocalDateTime created_at;

    public OrderDetail(String name, String address, String phone, String product_id, String product_name, String quantity) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity = quantity;
//        this.created_at = created_at;
    }

    public OrderDetail() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

//    public LocalDateTime getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(LocalDateTime created_at) {
//        this.created_at = created_at;
//    }

    public String toString(){
        return "Employee{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", product_id='" + product_id + '\'' +
                ", quantity='" +quantity + '\'' +
                ", product_name='" +product_name + '\'' +
                '}';
    }



}
