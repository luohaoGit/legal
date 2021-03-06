package com.github.legal.wechat.mapper;

import com.github.legal.wechat.domain.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    void updateSubcribeByOpenId(User user);

    User selectByOpenId(String openId);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}