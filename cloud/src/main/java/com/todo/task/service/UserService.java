package com.todo.task.service;

import com.todo.task.Dao.UserDao;
import com.todo.task.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> selectAllUsers() {
        return userDao.findAllUsers();
    }
}
