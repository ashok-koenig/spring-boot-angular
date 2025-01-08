package com.example.jpa_rest_product.service;

import com.example.jpa_rest_product.entity.Product;
import com.example.jpa_rest_product.repository.ProductRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public List<Product> getPaginatedProducts(int page, int size, String sort){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sort).ascending().and(Sort.by("price").ascending()));
        return productRepository.findAll(pageable).get().toList();
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

}
