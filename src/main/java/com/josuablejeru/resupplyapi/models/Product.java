package com.josuablejeru.resupplyapi.models;

import jakarta.persistence.*;


@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String id;

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {}


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
