package com.example.bookstore.book.mapper;

import com.example.bookstore.book.model.Userpermission;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class userpermissionmapper implements RowMapper<Userpermission> {
    @Override
    public Userpermission mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Userpermission(rs.getInt("id"), rs.getInt("user_id"),rs.getInt("permission_id"));
    }
}
