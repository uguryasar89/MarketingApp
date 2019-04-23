package com.uguryasar.edu.marketing.da.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "item")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public ItemEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public ItemEntity setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ItemEntity setName(String name) {
        this.name = name;
        return this;
    }
}
