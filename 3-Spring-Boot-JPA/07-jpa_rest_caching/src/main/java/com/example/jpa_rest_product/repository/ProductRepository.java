package com.example.jpa_rest_product.repository;

import com.example.jpa_rest_product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
