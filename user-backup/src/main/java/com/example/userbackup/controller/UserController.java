package com.example.userbackup.controller;

import com.example.userbackup.domain.User;
import com.example.userbackup.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author QZY
 * @date 2021/12/8 9:32
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/users")
    public List<User> users() {
        System.out.println("user2");
        return userMapper.findAll();
    }

}