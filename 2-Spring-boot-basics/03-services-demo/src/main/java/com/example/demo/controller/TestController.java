package com.example.demo.controller;

import com.example.demo.service.CalculationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    CalculationService calculationService;
    // Constructor Injection
    TestController(CalculationService calculationService){
        this.calculationService = calculationService;
//        this.calculationService = new CalculationService(); // Normal way of using service class
    }

    @RequestMapping("/")
    public String home(){
        return "Working with Services and Controllers";
    }

    @RequestMapping("/total")
    public String showTotalPrice(){
        return "Total Price: "+ calculationService.totalPrice(10,4,8);
    }
}
