package com.josuablejeru.resupplyapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product", indexes = @Index(columnList = "barcode"))
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Getter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String barcode;

    @Getter
    @Setter
    private Integer quantity;
}
