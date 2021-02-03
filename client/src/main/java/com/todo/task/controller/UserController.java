package com.todo.task.controller;

import com.todo.task.bean.User;
import com.todo.task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("all")
    public List<User> findAll() {
        return userService.selectAllUsers();
    }
}
