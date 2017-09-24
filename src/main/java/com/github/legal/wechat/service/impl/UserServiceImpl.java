package com.github.legal.wechat.service.impl;

import com.github.legal.wechat.domain.po.User;
import com.github.legal.wechat.mapper.UserMapper;
import com.github.legal.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by luohao on 24/09/2017.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        user.setCreatetime(new Date());
        user.setDeleted(false);
        userMapper.insertSelective(user);
    }

    @Override
    public User findByOpenId(String openId) {
        return userMapper.selectByOpenId(openId);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void updateSubcribe(User user) {
        user.setUpdatetime(new Date());
        userMapper.updateSubcribeByOpenId(user);
    }
}
