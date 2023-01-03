package com.digipay.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Invoice")
public class Invoice {

    @Id
    private String id;

    private String invoiceInformation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvoiceInformation() {
        return invoiceInformation;
    }

    public void setInvoiceInformation(String invoiceInformation) {
        this.invoiceInformation = invoiceInformation;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", invoiceInformation='" + invoiceInformation + '\'' +
                '}';
    }
}
