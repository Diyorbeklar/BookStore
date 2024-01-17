package com.example.bookstore.book.controller;

import com.example.bookstore.book.model.Userpermission;
import com.example.bookstore.book.service.userpermissionserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userpermission")
public class userpermissioncontroller {
    @Autowired
    userpermissionserverimpl userpermissionserverimpl;
    @GetMapping
    public List<Userpermission> getuserpermissions(){
        return userpermissionserverimpl.getListUserpermission();
    }

    @GetMapping("/{id}")
    public Userpermission getUserpermissionById(@PathVariable("id") Integer id){

        return userpermissionserverimpl.getUserpermissionById(id);
    }

    @PostMapping()
    public void insertUserpermission(@RequestBody Userpermission userpermission){

        userpermissionserverimpl.createUserpermission(userpermission);
    }

    @DeleteMapping()
    public void deleteUserpermission(@RequestBody Userpermission userpermission){

        userpermissionserverimpl.deleteUserpermission(userpermission.getId());
    }

    @PutMapping("/{id}")
    public void updateUserpermission(@PathVariable("id") Integer id,@RequestBody Userpermission userpermission){
        userpermissionserverimpl.updateUserpermission(id,userpermission);
    }

}


