package com.anurag.springboot.security.services;

import com.anurag.springboot.security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService(){
        list.add(new User("root", "root", "abc@gmail.com"));
        list.add(new User("abc", "abc", "xyz@gmail.com"));
    }

    // get All Users


    public List<User> getAllUser() {
        return this.list;
    }

    public User getSingleUser(String username){
        return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
