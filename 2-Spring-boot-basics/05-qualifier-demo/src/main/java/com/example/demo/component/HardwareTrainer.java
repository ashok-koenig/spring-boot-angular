package com.example.demo.component;

import com.example.demo.model.Trainer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class HardwareTrainer implements Trainer {
    @Override
    public String getSubject() {
        return "Networking and Routing";
    }
}
