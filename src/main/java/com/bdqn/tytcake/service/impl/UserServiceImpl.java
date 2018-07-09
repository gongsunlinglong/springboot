package com.bdqn.tytcake.service.impl;

import com.bdqn.tytcake.dto.UserDto;
import com.bdqn.tytcake.dao.UserDao;
import com.bdqn.tytcake.entity.User;
import com.bdqn.tytcake.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public void insertUser(User user) {
        this.userDao.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public void delateUser(String userAccount) {
        this.userDao.delateUser(userAccount);
    }

    @Override
    public User sleectUserById(Integer userAccount) {
        return this.userDao.sleectUserById(userAccount);
    }

    @Override
    public List<User> sleectUserAll() {
        return this.userDao.sleectUserAll();
    }

    @Override
    public Long selectUserByCount(UserDto dto) {
        return this.userDao.selectUserByCount(dto);
    }

    @Override
    public List<User> selectStudentByPage(UserDto dto) {
        return this.selectStudentByPage(dto);
    }
}
