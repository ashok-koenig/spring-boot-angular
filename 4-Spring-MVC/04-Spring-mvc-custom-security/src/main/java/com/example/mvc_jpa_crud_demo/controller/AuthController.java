package com.example.mvc_jpa_crud_demo.controller;

import com.example.mvc_jpa_crud_demo.model.Member;
import com.example.mvc_jpa_crud_demo.service.MemberService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private MemberService memberService;

    AuthController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String showLoginForm(Model model){
        return "login-form";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model){
        model.addAttribute("member", new Member());
        return "register-form";
    }

    @PostMapping("/save")
    public String saveMember(@ModelAttribute Member member, Model model){
        memberService.createMember(member);
        return "redirect:/auth/login";
    }
}
