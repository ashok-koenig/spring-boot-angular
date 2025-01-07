package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/members")
public class MemberControllerV2 {
    @GetMapping
    public String getAllMembers(){
        return "List of Members from version 2";
    }
}
