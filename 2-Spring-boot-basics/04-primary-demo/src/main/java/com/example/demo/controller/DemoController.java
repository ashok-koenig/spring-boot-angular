package com.example.demo.controller;

import com.example.demo.model.Trainer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Trainer trainer;
    DemoController(Trainer trainer){
        this.trainer = trainer;
    }
    @RequestMapping("/subject")
    public String subject(){
        return "Trainer: " + trainer.getSubject();
    }
}
