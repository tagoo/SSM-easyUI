package com.cn.ts.business.service;

import com.cn.ts.business.model.Empuser;
import com.cn.ts.business.model.EmpuserKey;

/** 
 * 功能概要：LoginService接口类 
 */  
public interface LoginService {  
    Empuser selectUserByUserName(String userName);
}
