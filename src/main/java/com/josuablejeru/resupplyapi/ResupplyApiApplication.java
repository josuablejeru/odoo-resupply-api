package com.josuablejeru.resupplyapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Resupply API",
                description = """
                        Scope of the API is to serve a Mobile Application for users of Odoo
                        If someone needs a resupply of certain Products this application will handle the request
                        """,
                contact = @Contact(
                        name = "Josua Blejeru",
                        email = "josua@blejeru.com"
                )
        )
)
public class ResupplyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResupplyApiApplication.class, args);
    }

}
