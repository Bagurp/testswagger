package com.example;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Testing Swagger and Micronaut integration",
                version = "0.1",
                description = "This web application is for testing file upload using Swagger.",
                contact = @Contact(url = "", name = "Pramukh Bagur", email = "pramukhdbagur@gmail.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
