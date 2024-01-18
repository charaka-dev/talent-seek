package com.example.demo.model;



import java.util.Date;
import java.util.List;


public class Invoice {
    private String customerName;
    private Date date;
    private List<InvoiceItem> items;

    public void setCustomerName(String johnDoe) {
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }
// Constructors, Getters and Setters
}
