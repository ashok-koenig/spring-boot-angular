package com.example.jpa_rest_product.repository;

import com.example.jpa_rest_product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // JPQL Query
    @Query("SELECT p FROM Product p ORDER BY p.price DESC")
    List<Product> findAllProductsSortedByPrice();

    // JPQL Query with params
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice")
    List<Product> findProductsByPriceRange(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);

    // JPQL Advanced features
    @Query(name = "Product.findByCategory")
    List<Product> findByCategory(@Param("category") String category);

    // Bulk Updates
    @Modifying
    @Transactional
    @Query(name = "Product.updatePriceByCategory")
    int updatePriceByCategory(@Param("price") double price, @Param("category") String category);

    // Native SQL Query
    @Query(value = "SELECT * FROM products WHERE LOWER(title) LIKE LOWER(CONCAT('%', :title, '%'))", nativeQuery = true)
    List<Product> searchByTitle(@Param("title") String title);
}
