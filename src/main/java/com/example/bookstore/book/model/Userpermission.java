package com.example.bookstore.book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Userpermission {
    private Integer id;
    private Integer user_id;
    private Integer permission_id;
}
