package com.example.demo.controller;

import com.example.demo.model.Trainer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Trainer trainer;
    Trainer anotherTrainer;
    DemoController(Trainer trainer, Trainer anotherTrainer){
        this.trainer = trainer;
        this.anotherTrainer = anotherTrainer;
    }

    @RequestMapping("/subject")
    public String subject(){
        return "Trainer: " + trainer.getSubject() + ", Another Trainer: "+ anotherTrainer.getSubject();
    }

    @RequestMapping("/check")
    public String check(){
        return "Comparing Beans: trainer == anotherTrainer: "+ (trainer == anotherTrainer);
    }
}
