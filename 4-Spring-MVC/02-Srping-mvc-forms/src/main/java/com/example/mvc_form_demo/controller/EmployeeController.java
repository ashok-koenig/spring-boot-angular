package com.example.mvc_form_demo.controller;

import com.example.mvc_form_demo.model.Address;
import com.example.mvc_form_demo.model.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employees/register")
    public String showForm(Model model){

        Employee employee= new Employee();
        employee.setAddress(new Address());
        model.addAttribute("employee", employee);

        String[] departments = {"Admin", "HR", "IT"};
        model.addAttribute("departments", departments);

        return "employee-form";
    }

    @PostMapping("/employees/save")
    public String saveEmployees(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, Model model){

        if(result.hasErrors()){
            String[] departments = {"Admin", "HR", "IT"};
            model.addAttribute("departments", departments);

            return "employee-form";
        }
        model.addAttribute("employee", employee);
        return "employee-success";
    }
}
