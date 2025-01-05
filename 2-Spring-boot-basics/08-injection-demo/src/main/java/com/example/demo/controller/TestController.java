package com.example.demo.controller;

import com.example.demo.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    CalculationService calculationService;

    // Constructor Injection
//    TestController(CalculationService calculationService){
//        this.calculationService = calculationService;
////        this.calculationService = new CalculationService(); // Normal way of using service class
//    }

    // Setter Injection
//    @Autowired
//    void setCalculationService(CalculationService calculationService){
//        this.calculationService = calculationService;
//    }

    @RequestMapping("/")
    public String home(){
        return "Working with Services and Controllers";
    }

    @RequestMapping("/total")
    public String showTotalPrice(){
        return "Total Price: "+ calculationService.totalPrice(10,4,8);
    }
}
