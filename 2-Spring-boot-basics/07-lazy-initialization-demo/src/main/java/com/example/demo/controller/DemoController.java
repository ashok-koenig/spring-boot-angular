package com.example.demo.controller;

import com.example.demo.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Trainer anotherTrainer;
    Trainer trainer;
    // Constructor Injection
    DemoController(@Qualifier("softwareTrainer") Trainer trainer){
        this.trainer = trainer;
    }
    @RequestMapping("/subject")
    public String subject(){
        return "Trainer: " + trainer.getSubject();
    }

    // Setter Injection
    @Autowired
    public void setAnotherTrainer(@Qualifier("hardwareTrainer") Trainer anotherTrainer){
        this.anotherTrainer = anotherTrainer;
    }

    @RequestMapping("/hardware")
    public String hardware(){
        return "Trainer: " + anotherTrainer.getSubject();
    }
}
