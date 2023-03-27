package com.anurag.springboot.security.controllers;

import com.anurag.springboot.security.models.User;
import com.anurag.springboot.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userService.getAllUser();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getSingleUser(username);
    }
    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }
}
