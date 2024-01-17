package com.example.bookstore.book.service;

import com.example.bookstore.book.dao.userimpl;
import com.example.bookstore.book.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userserverimpl implements userserver {
    @Autowired
    userimpl userimpl;
    @Override
    public List<User> getListUser() {
        return userimpl.getListUser();
    }

    @Override
    public User getUserById(Integer id) {
        return userimpl.getUserById(id);
    }

    @Override
    public void updateUser(Integer id, User user) {
        userimpl.updateUser(id,user);
    }

    @Override
    public void createUser(User user) {
        userimpl.createUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userimpl.deleteUser(id);
    }

}
