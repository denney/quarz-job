package com.acrel.quarz.job.quarzjob.service.impl;

import com.acrel.quarz.job.quarzjob.dao.UserMapper;
import com.acrel.quarz.job.quarzjob.model.User;
import com.acrel.quarz.job.quarzjob.model.UserExample;
import com.acrel.quarz.job.quarzjob.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public long countByExample(UserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public PageInfo<User> selectByExample(UserExample example) {


        PageHelper.startPage(1,1);
        List<User> list=userMapper.selectByExample(example);

        PageInfo<User> pageInfo=new PageInfo<>(list);
        return  pageInfo;
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
