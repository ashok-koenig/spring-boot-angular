package com.example.mvc_demo.controller;

import com.example.mvc_demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String showHome(Model model){
        return "home";
    }

    @RequestMapping("/about")
    public String showAbout(Model model){
        model.addAttribute("first_name", "John");
        model.addAttribute("last_name", "Smith");
        model.addAttribute("age", 15);
        String[] friends = {"Peter", "Bob", "Ana", "July"};
        model.addAttribute("friends", friends);

        Person smith = new Person("Smith", "smith@email.com", 44544);
        model.addAttribute("person", smith);

        Person[] employees = {
                new Person("John", "john@email.com", 68686),
                new Person("Smith", "smith@email.com", 56555),
                new Person("Ana", "ana@email.com", 56565),
                new Person("July", "july@email.com", 544565),
        };
        model.addAttribute("employees", employees);
        return "about";
    }
}
