package com.example.openfeign.controller;

import com.example.openfeign.domain.User;
import com.example.openfeign.service.UserService;
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
    private UserService userService;

    @RequestMapping("/openfeign")
    public List<User> users() {
        return userService.users();
    }

}