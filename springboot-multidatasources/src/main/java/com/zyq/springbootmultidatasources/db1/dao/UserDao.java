package com.zyq.springbootmultidatasources.db1.dao;

import com.zyq.springbootmultidatasources.bean.User;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("db1SqlSessionTemplate")
public interface UserDao {
    /**
     * 通过名字查询用户信息
     */
    User findUserByName(String name);
}
