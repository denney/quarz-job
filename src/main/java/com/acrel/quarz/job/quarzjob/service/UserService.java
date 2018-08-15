package com.acrel.quarz.job.quarzjob.service;

import com.acrel.quarz.job.quarzjob.model.User;
import com.acrel.quarz.job.quarzjob.model.UserExample;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

public interface UserService {


    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    PageInfo<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
