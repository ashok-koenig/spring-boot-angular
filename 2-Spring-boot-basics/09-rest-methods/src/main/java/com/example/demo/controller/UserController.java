package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

   @GetMapping
    public String getAllUsers(){
        return "List of users";
    }

    @GetMapping("/{id}")
    public String getAUser(){
        return "Get A user";
    }

    @PostMapping
    public String createUser(){
       return "User Created";
    }

    @PutMapping
    public String updateUser(){
       return "User Updated";
    }

    @DeleteMapping
    public String deleteUser(){
       return "User Deleted";
    }
}
