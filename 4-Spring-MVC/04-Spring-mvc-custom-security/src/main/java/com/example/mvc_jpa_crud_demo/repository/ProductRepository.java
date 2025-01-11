package com.example.mvc_jpa_crud_demo.repository;

import com.example.mvc_jpa_crud_demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
