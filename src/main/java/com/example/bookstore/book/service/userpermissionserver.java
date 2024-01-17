package com.example.bookstore.book.service;

import com.example.bookstore.book.model.Userpermission;

import java.util.List;

public interface userpermissionserver {
    public List<Userpermission> getListUserpermission();
    public Userpermission getUserpermissionById(Integer id);
    void updateUserpermission(Integer id, Userpermission userpermission);
    void createUserpermission(Userpermission userpermission);
    void deleteUserpermission(Integer id);
}
