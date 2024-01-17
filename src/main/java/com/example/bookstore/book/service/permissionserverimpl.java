package com.example.bookstore.book.service;

import com.example.bookstore.book.dao.permissionimpl;
import com.example.bookstore.book.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class permissionserverimpl implements permissionserver{
    @Autowired
     permissionimpl permissionimpl;
    @Override
    public List<Permission> getListPermission() {
        return permissionimpl.getListPermission();
    }

    @Override
    public Permission getPermissionById(Integer id) {
        return permissionimpl.getPermissionById(id);
    }

    @Override
    public void updatePermission(Integer id, Permission permission) {
        permissionimpl.updatePermission(id,permission);
    }

    @Override
    public void createPermission(Permission permission) {
        permissionimpl.createPermission(permission);
    }

    @Override
    public void deletePermission(Integer id) {
        permissionimpl.deletePermission(id);
    }
}
