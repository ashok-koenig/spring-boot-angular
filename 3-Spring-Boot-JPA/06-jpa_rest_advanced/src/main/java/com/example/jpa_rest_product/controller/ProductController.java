package com.example.jpa_rest_product.controller;

import com.example.jpa_rest_product.entity.Product;
import com.example.jpa_rest_product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer id){
        Product product = productService.getProductById(id).orElseThrow();
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product product){
        product.setId(id);
        return ResponseEntity.ok(productService.updateProduct(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    // JPQL Controls

    @GetMapping("/sorted")
    public ResponseEntity<List<Product>> getAllProductSortedByPrice(){
        return ResponseEntity.ok(productService.findAllProductsSortedByPrice());
    }

    @GetMapping("/price-range")
    public ResponseEntity<List<Product>> getProductsByPriceRange(@RequestParam double minPrice, @RequestParam double maxPrice){
        return ResponseEntity.ok(productService.getProductsByPriceRange(minPrice, maxPrice));
    }

    @GetMapping("/category")
    public ResponseEntity<List<Product>> getProductsByCategory(@RequestParam String category){
        return ResponseEntity.ok(productService.findByCategory(category));
    }

    @PutMapping("/update-price")
    public ResponseEntity<String> updatePriceByCategory(@RequestParam double price, @RequestParam String category){
        int updatedCount = productService.updatePriceByCategory(price, category);
        return ResponseEntity.ok(updatedCount + " products price updated successfully");
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProductsByTitle(@RequestParam String title){
        return ResponseEntity.ok(productService.searchByTitle(title));
    }
}
