package com.example.bookstore.book.dao;

import com.example.bookstore.book.mapper.permissionmapper;
import com.example.bookstore.book.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class permissionimpl implements permissiondao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Permission> getListPermission() {
        return (List<Permission>) jdbcTemplate.query("SELECT * FROM permissions",new permissionmapper());
    }

    @Override
    public Permission getPermissionById(Integer id) {
        return (Permission) jdbcTemplate.queryForObject("SELECT * FROM PERMISSIONS WHERE ID=?",new Object[]{id},new permissionmapper());
    }

    @Override
    public void updatePermission(Integer id, Permission permission) {
        jdbcTemplate.update("UPDATE PERMISSIONS SET name=? WHERE ID=?",permission.getName(),id);
    }

    @Override
    public void createPermission(Permission permission) {
        jdbcTemplate.update("INSERT INTO PERMISSIONS(name) VALUES (?)",permission.getName());
    }

    @Override
    public void deletePermission(Integer id) {

        jdbcTemplate.update("DELETE FROM PERMISSIONS WHERE id=?",id);
    }
}
