package com.example.bookstore.book.service;

import com.example.bookstore.book.model.Permission;

import java.util.List;

public interface permissionserver {
    public List<Permission> getListPermission();
    public Permission getPermissionById(Integer id);
    void updatePermission(Integer id, Permission permission);
    void createPermission(Permission permission);
    void deletePermission(Integer id);
}
