package com.josuablejeru.resupplyapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Product {


    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String id;

    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
