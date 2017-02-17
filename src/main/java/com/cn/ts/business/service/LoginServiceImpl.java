package com.cn.ts.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ts.business.dao.EmpuserMapper;
import com.cn.ts.business.model.Empuser;
import com.cn.ts.business.model.EmpuserKey;

@Service 
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	EmpuserMapper userTbDao;

    @Override
    public Empuser selectUserByUserName(String userName) {
        return userTbDao.selectUserByUserName(userName);
    }

	
}
