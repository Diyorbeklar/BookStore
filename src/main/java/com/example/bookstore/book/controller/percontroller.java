package com.example.bookstore.book.controller;

import com.example.bookstore.book.model.Permission;
import com.example.bookstore.book.service.permissionserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class percontroller {
    @Autowired
    permissionserverimpl permissionserverimpl;
    @GetMapping
    public List<Permission> getpermissions(){
        return permissionserverimpl.getListPermission();
    }

    @GetMapping("/{id}")
    public Permission getPermissionById(@PathVariable("id") Integer id){

        return permissionserverimpl.getPermissionById(id);
    }

    @PostMapping()
    public void insertPermission(@RequestBody Permission permission){

        permissionserverimpl.createPermission(permission);
    }

    @DeleteMapping()
    public void deletePermission(@RequestBody Permission permission){

        permissionserverimpl.deletePermission(permission.getId());
    }

    @PutMapping("/{id}")
    public void updatePermission(@PathVariable("id") Integer id,@RequestBody Permission permission){
        permissionserverimpl.updatePermission(id,permission);
    }

}



