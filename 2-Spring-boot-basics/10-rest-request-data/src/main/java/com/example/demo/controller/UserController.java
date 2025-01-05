package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

   @GetMapping
    public String getAllUsers(){
        return "List of users";
    }

    @GetMapping("/search")
    public String search(@RequestParam Map<String, String> params){
        return "User Search with Parameters: "+ params.toString();
    }

    @GetMapping("/{id}")
    public String getAUser(@PathVariable int id){
        return "Get A user with id: "+ id;
    }

    @PostMapping
    public String createUser(@RequestBody String body){
       return "User Created with body: "+ body;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody String body){
       return "User Updated with id: "+ id +" and body: "+ body;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
       return "User Deleted with id: "+ id;
    }
}
