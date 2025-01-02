package com.example.demo.controller;

import com.example.demo.model.Trainer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Trainer trainer;
    DemoController(@Qualifier("hardwareTrainer") Trainer trainer){
        this.trainer = trainer;
    }
    @RequestMapping("/subject")
    public String subject(){
        return "Trainer: " + trainer.getSubject();
    }
}
