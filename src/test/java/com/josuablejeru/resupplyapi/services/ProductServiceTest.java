package com.josuablejeru.resupplyapi.services;

import com.josuablejeru.resupplyapi.models.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Testcontainers
class ProductServiceTest {

    @MockBean
    public ProductService productService;


    @Container
    private static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15");


    @DynamicPropertySource
    public static void overrideProps(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }



    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Product> products = productService.list();

        assertEquals(3, products.size());
    }

}