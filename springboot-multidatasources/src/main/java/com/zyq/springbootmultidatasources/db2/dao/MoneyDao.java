package com.zyq.springbootmultidatasources.db2.dao;

import com.zyq.springbootmultidatasources.bean.Money;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("db2SqlSessionTemplate")
public interface MoneyDao {
    /**
     * 通过id 查看工资详情
     */
    Money findMoneyById(@Param("id") int id);
}
