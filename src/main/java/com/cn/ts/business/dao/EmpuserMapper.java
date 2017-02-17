package com.cn.ts.business.dao;

import com.cn.ts.business.model.Empuser;
import com.cn.ts.business.model.EmpuserExample;
import com.cn.ts.business.model.EmpuserKey;
import com.cn.ts.frame.utils.SearchPageUtil;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmpuserMapper {
    int countByExample(EmpuserExample example);

    int deleteByExample(EmpuserExample example);

    int deleteByPrimaryKey(EmpuserKey key);

    int insert(Empuser record);
    
    int update(Empuser record);
    String  selectPrimaryKey();

    int insertSelective(Empuser record);

    List<Empuser> selectByExample(EmpuserExample example);
    
    List<Empuser> getUserList(SearchPageUtil searchPageUtil);

    Empuser selectByPrimaryKey(EmpuserKey key);
    
    Empuser selectUserByUserName(String userName);

    int updateByExampleSelective(@Param("record") Empuser record, @Param("example") EmpuserExample example);

    int updateByExample(@Param("record") Empuser record, @Param("example") EmpuserExample example);

    int updateByPrimaryKeySelective(Empuser record);

    int updateByPrimaryKey(Empuser record);
}