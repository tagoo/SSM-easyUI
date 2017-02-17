package com.cn.ts.business.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ts.business.dao.EmpuserMapper;
import com.cn.ts.business.model.Empuser;
import com.cn.ts.business.model.EmpuserExample;
import com.cn.ts.business.model.EmpuserExample.Criteria;
import com.cn.ts.frame.utils.Page;
import com.cn.ts.frame.utils.SearchPageUtil;

@Service 
public class UserListServiceImpl implements UserListService {
    
    @Autowired
    EmpuserMapper userDao;
    
    @Override
    public List<Empuser> getUserList(Map<String,Object> paramsMap) {
        SearchPageUtil searchPageUtil = new SearchPageUtil();
        searchPageUtil.setPage((Page)paramsMap.get("page"));
        searchPageUtil.setOrderBy(paramsMap.get("sort").toString());;
        searchPageUtil.setFilter(paramsMap.get("userName").toString());
        searchPageUtil.setObject(paramsMap.get("empuser"));
        
        List<Empuser> userList = userDao.getUserList(searchPageUtil);
        
        return userList;
    }
    
    @Override
    public Integer countByExample(String userName) {
        EmpuserExample userExp = new EmpuserExample();
        Criteria criteria = userExp.createCriteria();
        
        if(StringUtils.isNotEmpty(userName)){
            criteria.andUsernameEqualTo(userName);
        }
        
        int count = userDao.countByExample(userExp);
        
        return count;
    }

    @Override
    public int deleteByExample(String id) {
        EmpuserExample userExp = new EmpuserExample();
        Criteria criteria = userExp.createCriteria();
        
        if(StringUtils.isNotEmpty(id)){
            criteria.andIdEqualTo(id);
        }
        
        int count = userDao.deleteByExample(userExp);
        return count;
    }
    
    @Override
    public int insert(Empuser empuser){
        String id = userDao.selectPrimaryKey();
        empuser.setId(id);
        int count = userDao.insert(empuser);
        return count;
    }

    @Override
    public int update(Empuser empuser){
        int count = userDao.update(empuser);
        return count;
    }
    
}
