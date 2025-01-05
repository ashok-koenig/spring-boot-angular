package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers(){
       List<User> users = new ArrayList<>();
       users.add(new User(1,"John", "john@email.com"));
       users.add(new User(2,"Smith", "smith@email.com"));
       return users;
    }

    @PostMapping
    public String createUser(@RequestBody User user){
        return "User Created with body: "+ user;
    }

    @GetMapping("/search")
    public String search(@RequestParam Map<String, String> params){
        return "User Search with Parameters: "+ params.toString();
    }

    @GetMapping("/{id}")
    public String getAUser(@PathVariable int id){
        return "Get A user with id: "+ id;
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
