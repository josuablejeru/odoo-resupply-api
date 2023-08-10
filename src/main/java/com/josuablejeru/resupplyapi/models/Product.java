package com.josuablejeru.resupplyapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Product {


    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    public Product() {

    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public Product(String name) {
        this.name = name;
    }
}
