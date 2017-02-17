package com.cn.ts.business.dao;

import com.cn.ts.business.model.Datademo;
import com.cn.ts.business.model.DatademoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatademoMapper {
    int countByExample(DatademoExample example);

    int deleteByExample(DatademoExample example);

    int insert(Datademo record);

    int insertSelective(Datademo record);

    List<Datademo> selectByExample(DatademoExample example);

    int updateByExampleSelective(@Param("record") Datademo record, @Param("example") DatademoExample example);

    int updateByExample(@Param("record") Datademo record, @Param("example") DatademoExample example);
}