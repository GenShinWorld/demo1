package com.example.demo.service;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public User login();
    List<User> selectall( String id);
}
