package com.bdqn.tytcake.controller;

import com.bdqn.tytcake.entity.User;
import com.bdqn.tytcake.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/insertUser.do")
    public void insertUser(User user){
        User user1=new User(1,"123456789","韩飞","x","x",new Date(),"x","x");
        this.userService.insertUser(user1);
    }
    @GetMapping("/sleectAll.do")
    public List<User> sleectUserAll() {
        return this.userService.sleectUserAll();
    }
}
