package com.example.jpa_rest_product.service;

import com.example.jpa_rest_product.entity.Product;
import com.example.jpa_rest_product.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer id){
        return productRepository.findById(id);
    }

    @Transactional
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Transactional
    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    @Transactional
    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

    // JPQL Services
    public List<Product> findAllProductsSortedByPrice(){
        return productRepository.findAllProductsSortedByPrice();
    }

    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice){
        return productRepository.findProductsByPriceRange(minPrice, maxPrice);
    }

    public List<Product> findByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public int updatePriceByCategory(double price, String category){
        return productRepository.updatePriceByCategory(price, category);
    }

    public List<Product> searchByTitle(String title){
        return productRepository.searchByTitle(title);
    }
}
