package com.example.jpa_rest_product.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Title is required")
    @NotNull(message = "Title is required")
    @Size(min= 2, max = 100, message = "Title must be between 2 and 200 characters")
    private String title;

    @NotEmpty(message = "Title is required")
    @NotNull(message = "Title is required")
    @Size(min= 2, max = 100, message = "Title must be between 2 and 200 characters")
    private String category;

    private Double price;

    public Product() {
    }

    public Product(Integer id, String title, String category, Double price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
