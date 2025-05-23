package com.example.product_crud_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')") // Add the products by the admin only
    public Product addProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
public Product getProduct(@PathVariable Long id) {
    return productService.getProductById(id);
}

@PutMapping("/{id}")
@PreAuthorize("hasRole('ADMIN')")
public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
    return productService.updateProduct(id, product);
}

@DeleteMapping("/{id}")
@PreAuthorize("hasRole('ADMIN')")
public void deleteProduct(@PathVariable Long id) {
    productService.deleteProduct(id);
}
}