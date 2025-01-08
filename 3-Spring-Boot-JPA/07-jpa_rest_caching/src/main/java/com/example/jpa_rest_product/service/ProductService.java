package com.example.jpa_rest_product.service;

import com.example.jpa_rest_product.entity.Product;
import com.example.jpa_rest_product.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
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
//        Optional<Product> product0= productRepository.findById(4);
//        //Level 1 Caching
//       Optional<Product> product1= productRepository.findById(id);
//       Optional<Product> product2= productRepository.findById(id);

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

}
