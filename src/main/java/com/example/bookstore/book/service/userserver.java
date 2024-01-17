package com.example.bookstore.book.service;

import com.example.bookstore.book.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface userserver {
    public List<User> getListUser();
    public User getUserById(Integer id);
    void updateUser(Integer id, User user);
    void createUser(User user);
    void deleteUser(Integer id);
}
