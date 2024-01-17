package com.example.bookstore.book.mapper;

import com.example.bookstore.book.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class usermapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getString("role_name"));
    }
}
