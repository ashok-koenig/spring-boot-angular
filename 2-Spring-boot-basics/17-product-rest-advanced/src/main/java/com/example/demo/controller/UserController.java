package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/v1/users")
    public String getAllUsers(){
        return "List of users from version 1";
    }

    @GetMapping("/v2/users")
    public String getAllUsersV2(){
        return "List of users from version 2";
    }
}
