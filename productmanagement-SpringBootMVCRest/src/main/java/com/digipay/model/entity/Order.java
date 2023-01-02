package com.digipay.model.entity;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PMORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "PMOID")
    private int orderID;

    @Column(name = "PMOREGISTERDATE")
    private String orderRegisterDate;

    @Column(name = "PMOPID")
    private int orderProductID;

    @Column(name = "PMOPCATEGORY")
    private String orderProductCategory;

    @Column(name = "PMOSTATUS")
    private String orderStatus;

    @Column(name = "PMOFINALIZEDATE")
    private String orderFinalizeDate;
    @Column(name = "PMORETURNDATE")
    private String orderReturnDate;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "PMCID")
    private Customer customer;


    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderRegisterDate() {
        return orderRegisterDate;
    }

    public void setOrderRegisterDate(String orderRegisterDate) {
        this.orderRegisterDate = orderRegisterDate;
    }

    public String getOrderReturnDate() {
        return orderReturnDate;
    }

    public void setOrderReturnDate(String orderReturnDate) {
        this.orderReturnDate = orderReturnDate;
    }

    public int getOrderProductID() {
        return orderProductID;
    }

    public String getOrderFinalizeDate() {
        return orderFinalizeDate;
    }

    public void setOrderFinalizeDate(String orderFinalizeDate) {
        this.orderFinalizeDate = orderFinalizeDate;
    }

    public void setOrderProductID(int orderProductID) {
        this.orderProductID = orderProductID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderProductCategory() {
        return orderProductCategory;
    }

    public void setOrderProductCategory(String orderProductCategory) {
        this.orderProductCategory = orderProductCategory;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderRegisterDate='" + orderRegisterDate + '\'' +
                ", orderProductID=" + orderProductID +
                ", orderProductCategory='" + orderProductCategory + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderFinalizeDate='" + orderFinalizeDate + '\'' +
                ", orderReturnDate='" + orderReturnDate + '\'' +
                ", customer=" + customer +
                '}';
    }
}