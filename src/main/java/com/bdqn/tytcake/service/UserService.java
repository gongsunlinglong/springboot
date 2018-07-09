package com.bdqn.tytcake.service;

import com.bdqn.tytcake.dto.UserDto;
import com.bdqn.tytcake.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 新增用户信息
     * @param user 用户信息
     */
    public void insertUser(User user);

    /**
     * 修改用户信息
     * @param user 用户信息
     */
    public void updateUser(User user);

    /**
     * 根据用户账
     * 删除用户信息
     * @param userAccount 用户账号
     */
    public void delateUser(String userAccount);

    /**
     * 根据用户账号
     * 查询用户信息
     * @param userAccount 用户账号
     * @return 用户信息
     */
    public User sleectUserById(Integer userAccount);

    /**
     * 查询全部用户信息
     * @return 用户信息
     */
    public List<User> sleectUserAll();
    /**
     * 根据条件查询全部用户信息
     * @return 受影响行数
     */
    public Long selectUserByCount(UserDto dto);
    /**
     * 根据条件查询用户信息
     * @return 用户信息
     */
    public List<User> selectStudentByPage(UserDto dto);
}
