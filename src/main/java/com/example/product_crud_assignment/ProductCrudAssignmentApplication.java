package com.example.product_crud_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class ProductCrudAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCrudAssignmentApplication.class, args);
	}

}
