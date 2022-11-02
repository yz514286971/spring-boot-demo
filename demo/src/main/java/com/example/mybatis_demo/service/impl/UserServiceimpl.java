package com.example.mybatis_demo.service.impl;
import com.example.mybatis_demo.bean.User;
import com.example.mybatis_demo.dao.UserDao;
import com.example.mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value = "userService")
public class UserServiceimpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public List<User> test() {
        return userDao.selectList(null);
    }
}
