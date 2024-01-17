package com.example.bookstore.book.dao;

import com.example.bookstore.book.mapper.usermapper;
import com.example.bookstore.book.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class userimpl implements userdao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<User> getListUser() {
        return (List<User>) jdbcTemplate.query("SELECT * FROM USERS",new usermapper());
    }

    @Override
    public User getUserById(Integer id) {
        return (User) jdbcTemplate.queryForObject("SELECT * FROM USERS WHERE ID=?",new Object[]{id},new usermapper());
    }

    @Override
    public void updateUser(Integer id, User user) {
        jdbcTemplate.update("UPDATE USERS SET username=?,password=?,role_name=? WHERE ID=?",user.getUsername(),user.getPassword(),user.getRole_name(),id);
    }

    @Override
    public void createUser(User user) {
        jdbcTemplate.update("INSERT INTO USERS(username,password,role_name) VALUES (?,?,?)",user.getUsername(),user.getPassword(),user.getRole_name());
    }

    @Override
    public void deleteUser(Integer id) {

        jdbcTemplate.update("DELETE FROM USERS WHERE id=?",id);
    }

}
