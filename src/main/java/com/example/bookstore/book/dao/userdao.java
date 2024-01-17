package com.example.bookstore.book.dao;

import com.example.bookstore.book.model.User;

import java.util.List;

public interface userdao {
    public List<User> getListUser();
    public User getUserById(Integer id);
    void updateUser(Integer id, User user);
    void createUser(User user);
    void deleteUser(Integer id);
}
