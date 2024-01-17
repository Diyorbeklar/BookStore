package com.example.bookstore.book.controller;

import com.example.bookstore.book.model.User;
import com.example.bookstore.book.service.userserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class usercontroller {
    @Autowired
    userserverimpl userserverimpl;
    @GetMapping
    public List<User> getusers(){
        return userserverimpl.getListUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id){

        return userserverimpl.getUserById(id);
    }

    @PostMapping()
    public void insertUser(@RequestBody User user){

        userserverimpl.createUser(user);
    }

    @DeleteMapping()
    public void deleteUser(@RequestBody User user){

        userserverimpl.deleteUser(user.getId());
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") Integer id,@RequestBody User user){
        userserverimpl.updateUser(id,user);
    }

}


