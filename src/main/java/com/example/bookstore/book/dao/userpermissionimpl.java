package com.example.bookstore.book.dao;

import com.example.bookstore.book.mapper.userpermissionmapper;
import com.example.bookstore.book.model.Userpermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userpermissionimpl implements userpermissiondao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Userpermission> getListUserpermission() {
        return (List<Userpermission>) jdbcTemplate.query("SELECT * FROM USERPERMISSION",new userpermissionmapper());
    }

    @Override
    public Userpermission getUserpermissionById(Integer id) {
        return (Userpermission) jdbcTemplate.queryForObject("SELECT * FROM USERPERMISSION WHERE ID=?",new Object[]{id},new userpermissionmapper());
    }

    @Override
    public void updateUserpermission(Integer id, Userpermission userpermission) {
        jdbcTemplate.update("UPDATE USERPERMISSION SET user_id=?,permission_id=? WHERE ID=?",userpermission.getUser_id(),userpermission.getPermission_id(),id);
    }

    @Override
    public void createUserpermission(Userpermission userpermission) {
        jdbcTemplate.update("INSERT INTO USERPERMISSION(user_id,permission_id) VALUES (?,?)",userpermission.getUser_id(),userpermission.getPermission_id());
    }

    @Override
    public void deleteUserpermission(Integer id) {
        jdbcTemplate.update("DELETE FROM USERPERMISSION WHERE id=?",id);
    }
}
