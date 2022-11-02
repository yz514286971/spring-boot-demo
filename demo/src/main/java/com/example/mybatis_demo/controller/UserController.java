package com.example.mybatis_demo.controller;

import com.example.mybatis_demo.bean.User;
import com.example.mybatis_demo.service.UserService;
import com.example.mybatis_demo.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userservice;

    @GetMapping("/test")
    public List<User> test() {
        return userservice.test();
    }
}
