package com.example.demo.component;

import com.example.demo.model.Trainer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SoftwareTrainer implements Trainer {
    @Override
    public String getSubject() {
        return "Java Spring Boot with Angular";
    }
}
