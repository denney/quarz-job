package com.acrel.quarz.job.quarzjob.controller;

import com.acrel.quarz.job.quarzjob.model.User;
import com.acrel.quarz.job.quarzjob.model.UserExample;
import com.acrel.quarz.job.quarzjob.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    public long countByExample(UserExample example) {
        return 0;
    }


    public int deleteByExample(UserExample example) {
        return 0;
    }


    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }


    public int insert(User record) {
        return 0;
    }


    public int insertSelective(User record) {
        return 0;
    }

    @ResponseBody
    @RequestMapping(value = "/list", produces = {"application/json;charset=UTF-8"})
    public PageInfo<User> selectByExample(UserExample example) {
        return userService.selectByExample(example);
    }


    public User selectByPrimaryKey(Integer userId) {
        return null;
    }


    public int updateByExampleSelective(User record, UserExample example) {
        return 0;
    }


    public int updateByExample(User record, UserExample example) {
        return 0;
    }


    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }


    public int updateByPrimaryKey(User record) {
        return 0;
    }
}


