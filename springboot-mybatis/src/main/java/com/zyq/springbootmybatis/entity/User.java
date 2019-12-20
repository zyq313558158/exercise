package com.zyq.springbootmybatis.entity;

import lombok.Data;

/**
 *@author zyq
 *@date 2019/12/16 17:53
 *@description User实体类
 **/
@Data
public class User {
    private int id;
    private String name;
    private int age;
    private double money;
}
