package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/members")
public class MemberControlerV1 {

    @GetMapping
    public String getAllMembers(){
        return "List of Members from version 1";
    }
}
