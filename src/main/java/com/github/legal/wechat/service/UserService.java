package com.github.legal.wechat.service;

import com.github.legal.wechat.domain.po.User;

/**
 * Created by luohao on 24/09/2017.
 */
public interface UserService {

    void addUser(User user);

    User findByOpenId(String openId);

    void updateUser(User user);

    void updateSubcribe(User user);
}
