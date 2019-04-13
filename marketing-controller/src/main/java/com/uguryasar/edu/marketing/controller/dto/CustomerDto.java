package com.uguryasar.edu.marketing.controller.dto;

public class CustomerDto {

    private int customerID;
    private String customerName;
    private String customerAddress;

    public int getCustomerID() {
        return customerID;
    }

    public CustomerDto setCustomerID(int customerID) {
        this.customerID = customerID;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public CustomerDto setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public CustomerDto setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }
}
