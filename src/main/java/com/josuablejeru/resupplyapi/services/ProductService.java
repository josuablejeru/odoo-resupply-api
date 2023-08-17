package com.josuablejeru.resupplyapi.services;

import com.josuablejeru.resupplyapi.models.Product;
import com.josuablejeru.resupplyapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Product> getById(String id) {
        return productRepository.findById(id);
    }

    public Integer changeQuantity(Product product, Integer quantityTick) {
        Integer currentQuantity = product.getQuantity();
        product.setQuantity(currentQuantity + quantityTick);

        productRepository.save(product);

        return product.getQuantity();
    }
}
