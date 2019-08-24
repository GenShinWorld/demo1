package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserDao;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;


    @Override
    public List<User> selectall(String id) {
        return userDao.selectall(id);
    }
    public User login(){
        return null;
    }
}
