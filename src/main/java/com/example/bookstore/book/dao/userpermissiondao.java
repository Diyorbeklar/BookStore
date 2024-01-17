package com.example.bookstore.book.dao;

import com.example.bookstore.book.model.Userpermission;

import java.util.List;

public interface userpermissiondao {
    public List<Userpermission> getListUserpermission();
    public Userpermission getUserpermissionById(Integer id);
    void updateUserpermission(Integer id, Userpermission userpermission);
    void createUserpermission(Userpermission userpermission);
    void deleteUserpermission(Integer id);
}
