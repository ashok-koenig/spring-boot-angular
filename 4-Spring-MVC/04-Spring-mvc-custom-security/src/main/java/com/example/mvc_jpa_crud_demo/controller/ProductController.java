package com.example.mvc_jpa_crud_demo.controller;

import com.example.mvc_jpa_crud_demo.model.Product;
import com.example.mvc_jpa_crud_demo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model){
        Product product = productService.getProductById(id);
        if(product == null){
            return "redirect:/products";
        }
        model.addAttribute("product", product);
        String[] categories = {"Smartphone", "Laptop", "Desktop"};
        model.addAttribute("categories", categories);
        return "product-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}
