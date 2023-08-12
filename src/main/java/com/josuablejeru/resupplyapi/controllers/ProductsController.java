package com.josuablejeru.resupplyapi.controllers;

import com.josuablejeru.resupplyapi.models.Product;
import com.josuablejeru.resupplyapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/products")
public class ProductsController {

    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return this.productService.list();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> requestProduct(@RequestBody Product product) {
        Product createdProduct = this.productService.add(product);

        return new ResponseEntity<>(createdProduct, HttpStatus.OK);
    }
}
