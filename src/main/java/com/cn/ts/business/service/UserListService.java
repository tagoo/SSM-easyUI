package com.cn.ts.business.service;

import java.util.List;
import java.util.Map;

import com.cn.ts.business.model.Empuser;

public interface UserListService {
    List<Empuser> getUserList(Map<String, Object> paramsMap);

    Integer countByExample(String userName);
    
    int deleteByExample(String id);
    
    int insert(Empuser empuser);
    
    int update(Empuser empuser);
}
