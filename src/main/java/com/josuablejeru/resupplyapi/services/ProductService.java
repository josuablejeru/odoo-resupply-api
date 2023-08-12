package com.josuablejeru.resupplyapi.services;

import com.josuablejeru.resupplyapi.models.Product;
import com.josuablejeru.resupplyapi.repositories.ProductRepository;
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

    public Product add(Product product) {
        return productRepository.save(product);
    }
}
