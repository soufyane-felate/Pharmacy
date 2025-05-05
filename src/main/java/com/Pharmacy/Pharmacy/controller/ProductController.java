package com.Pharmacy.Pharmacy.controller;

import com.Pharmacy.Pharmacy.entities.Product;
import com.Pharmacy.Pharmacy.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @PostMapping("/product")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
    @PutMapping("/product")
    public Product updateProduct( @RequestBody Product product) {
        return productRepository.save(product);
    }
}
