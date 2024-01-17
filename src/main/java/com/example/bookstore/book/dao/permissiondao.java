package com.example.bookstore.book.dao;

import com.example.bookstore.book.model.Permission;

import java.util.List;

public interface permissiondao {
    public List<Permission> getListPermission();
    public Permission getPermissionById(Integer id);
    void updatePermission(Integer id, Permission permission);
    void createPermission(Permission permission);
    void deletePermission(Integer id);
}
