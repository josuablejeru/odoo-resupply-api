package com.josuablejeru.resupplydemoapi.services;

import com.josuablejeru.resupplydemoapi.models.Product;
import com.josuablejeru.resupplydemoapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> list() {
        return productRepository.findAll();
    }
}
