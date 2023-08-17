package com.josuablejeru.resupplyapi.controllers;

import com.josuablejeru.resupplyapi.controllers.errors.ProductNotFoundException;
import com.josuablejeru.resupplyapi.controllers.requestbody.ChangeProductQuantity;
import com.josuablejeru.resupplyapi.controllers.response.UpdateProductResponse;
import com.josuablejeru.resupplyapi.models.Product;
import com.josuablejeru.resupplyapi.services.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/products")
@Tag(name = "Products Resupply", description = "requests products you need in your inventory")
@Log4j2
public class ProductsController {

    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getAllProducts() {
        log.info("Request all Products");
        return this.productService.list();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> requestProduct(@RequestBody Product product) {
        Product createdProduct = this.productService.add(product);

        log.debug("Create new Product: {}", product);

        return new ResponseEntity<>(createdProduct, HttpStatus.OK);
    }

    @PutMapping(value = "{productId}/quantity", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UpdateProductResponse changeQuantity(@PathVariable("productId") String productId, @RequestBody ChangeProductQuantity body) {
        Integer requestedQuantity = body.getQuantity();

        Optional<Product> product = productService.getById(productId);
        product.orElseThrow(() -> new ProductNotFoundException("Product not found"));

        Integer newCalculatedQuantity = productService.changeQuantity(product.get(), requestedQuantity);

        UpdateProductResponse response = new UpdateProductResponse();

        response.setProductId(productId);
        response.setQuantity(newCalculatedQuantity);

        return response;
    }
}
