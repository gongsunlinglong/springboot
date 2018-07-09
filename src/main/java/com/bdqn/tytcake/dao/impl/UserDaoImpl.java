package com.bdqn.tytcake.dao.impl;

import com.bdqn.tytcake.dto.UserDto;
import com.bdqn.tytcake.dao.UserDao;
import com.bdqn.tytcake.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void insertUser(User user) {
        mongoTemplate.insert(user);
    }

    @Override
    public void updateUser(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public void delateUser(String userAccount) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userAccount").is(userAccount));
        this.mongoTemplate.remove(query, User.class);
    }

    @Override
    public User sleectUserById(Integer userAccount) {
        return this.mongoTemplate.findById(userAccount, User.class);
    }



    @Override
    public List<User> sleectUserAll() {
        return this.mongoTemplate.findAll(User.class);
    }

    @Override
    public Long selectUserByCount(UserDto dto) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userName").regex("^.*" + dto.getUserName() + ".*$"));
        return mongoTemplate.count(query, User.class);
    }

    @Override
    public List<User> selectStudentByPage(UserDto dto) {
       /* Query query = new Query();
        query.addCriteria(Criteria.where("stuName").regex("^.*" + dto.getStuName() + ".*$"));
        query.skip(dto.getFromTo()).limit(dto.getPageSize());
        return mongoTemplate.find(query, Student.class);*/
        return null;
    }
}
