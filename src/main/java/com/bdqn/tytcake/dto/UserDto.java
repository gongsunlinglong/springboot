package com.bdqn.tytcake.dto;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "User")
public class UserDto {

    private Integer userId;
    private String userAccount;
    private String userName;
    private String usetPwd;
    private String userSex;

    private Date userbirthday;
    private String phone;
    private String address;

    public UserDto(Integer userId, String userAccount, String userName, String usetPwd, String userSex, Date userbirthday, String phone, String address) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userName = userName;
        this.usetPwd = usetPwd;
        this.userSex = userSex;
        this.userbirthday = userbirthday;
        this.phone = phone;
        this.address = address;
    }

    public UserDto() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsetPwd() {
        return usetPwd;
    }

    public void setUsetPwd(String usetPwd) {
        this.usetPwd = usetPwd;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
