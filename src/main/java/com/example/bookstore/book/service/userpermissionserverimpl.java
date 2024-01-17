package com.example.bookstore.book.service;

import com.example.bookstore.book.dao.userpermissionimpl;
import com.example.bookstore.book.model.Userpermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userpermissionserverimpl implements userpermissionserver{
    @Autowired
    userpermissionimpl userpermissionimpl;
    @Override
    public List<Userpermission> getListUserpermission() {
        return userpermissionimpl.getListUserpermission();
    }

    @Override
    public Userpermission getUserpermissionById(Integer id) {
        return userpermissionimpl.getUserpermissionById(id);
    }

    @Override
    public void updateUserpermission(Integer id, Userpermission userpermission) {
        userpermissionimpl.updateUserpermission(id,userpermission);
    }

    @Override
    public void createUserpermission(Userpermission userpermission) {
        userpermissionimpl.createUserpermission(userpermission);
    }

    @Override
    public void deleteUserpermission(Integer id) {
        userpermissionimpl.deleteUserpermission(id);
    }
}
