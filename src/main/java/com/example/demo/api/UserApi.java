package com.example.demo.api;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserApi {
    @Autowired
    UserService userService;
    /**
     * 李全
     * 登录
     */
    public User login(){
        userService.login();
        return null;
    }
    @RequestMapping("/queryall")
    public Result queryall(String id){
        Result result;
        try{
            List<User> list =userService.selectall(id);
            if(list!=null){
                result=new Result("200","查询成功",list);
            }else{
                result=new Result("500","查询失败",null);
            }
        }catch (Exception e){
            result=new Result("404","查询错误",e.getMessage());
        }
        return result;
    }
}
