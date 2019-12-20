package com.zyq.springbootmybatis.dao;

import com.zyq.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *@author zyq
 *@date 2019/12/16 17:53
 *@description UserDao
 **/

@Mapper
public interface UserDao {
    /**
     *@author zyq
     *@date 2019/12/16 17:54
     *@description 通过名字查找用户
     **/
    User findUserByName(@Param("name") String name);

    /**
     *@author zyq
     *@date 2019/12/16 17:55
     *@description 查找所有用户
     **/
    List<User> findAllUser();

    /**
     *@author zyq
     *@date 2019/12/16 17:56
     *@description 插入用户
     **/
    void insertUser(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money);

    /**
     *@author zyq
     *@date 2019/12/16 17:57
     *@description 通过id修改用户信息
     **/
    void updateUser(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money,
                    @Param("id") int id);

    /**
     *@author zyq
     *@date 2019/12/16 17:58
     *@description 根据id删除用户
     **/

    void deleteUser(@Param("id") int id);
}
