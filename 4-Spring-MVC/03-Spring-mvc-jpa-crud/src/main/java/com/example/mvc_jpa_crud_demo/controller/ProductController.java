package com.example.mvc_jpa_crud_demo.controller;

import com.example.mvc_jpa_crud_demo.model.Product;
import com.example.mvc_jpa_crud_demo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public String listProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model){
        model.addAttribute("product", new Product());
        String[] categories = {"Smartphone", "Laptop", "Desktop"};
        model.addAttribute("categories", categories);
        return "product-form";
    }

    @PostMapping("/save")
    public String saveProducts(@Valid @ModelAttribute Product product, BindingResult result, Model model){
        if(result.hasErrors()){
            String[] categories = {"Smartphone", "Laptop", "Desktop"};
            model.addAttribute("categories", categories);
            return "product-form";
        }
        productService.saveProduct(product);
        return "redirect:/products";
    }
}
