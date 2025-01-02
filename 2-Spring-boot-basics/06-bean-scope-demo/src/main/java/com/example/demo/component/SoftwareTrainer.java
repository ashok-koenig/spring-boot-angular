package com.example.demo.component;

import com.example.demo.model.Trainer;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Primary
@Component
@Scope("prototype")
public class SoftwareTrainer implements Trainer {
    @Override
    public String getSubject() {
        return "Java Spring Boot with Angular";
    }
}
