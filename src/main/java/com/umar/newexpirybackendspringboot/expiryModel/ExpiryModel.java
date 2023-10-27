package com.umar.newexpirybackendspringboot.expiryModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExpiryModel {
    @Id    // use genration type identity to incremnet id with 1 and 2 and 2,3,4,5 etc
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brandName;
    private String supplierName;
    private String expiryDate;

    public ExpiryModel(){}

    public ExpiryModel(String brandName, String supplierName, String expiryDate){
        this.brandName = brandName;
        this.supplierName = supplierName;
        this.expiryDate = expiryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ExpiryModel{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
