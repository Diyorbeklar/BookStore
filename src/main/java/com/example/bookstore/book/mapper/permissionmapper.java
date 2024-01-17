package com.example.bookstore.book.mapper;

import com.example.bookstore.book.model.Permission;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class permissionmapper implements RowMapper<Permission> {
    @Override
    public Permission mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Permission(rs.getInt("id"),rs.getString("name"));
    }
}
