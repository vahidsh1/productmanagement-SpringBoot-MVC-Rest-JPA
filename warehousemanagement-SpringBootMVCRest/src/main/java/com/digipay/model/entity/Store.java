package com.digipay.model.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "WMSTORE")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "WMID")
    private int storeID;

    @Column(name = "WMSTOCK")
    int stockCount;

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeID=" + storeID +
                ", stockCount=" + stockCount +
                '}';
    }
}
