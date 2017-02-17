package com.cn.ts.business.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cn.ts.business.model.Empuser;
import com.cn.ts.business.service.UserListService;
import com.cn.ts.frame.Web.BaseController;
import com.cn.ts.frame.utils.Page;
import com.cn.ts.frame.utils.ResponseUtil;

@Controller
public class UserListController extends BaseController{
    
    @Resource
    private UserListService userListService;
    private Empuser empuser;
    
    @RequestMapping("/userList")
    public ModelAndView userList(){
        ModelAndView mav = new ModelAndView("userList");
        
        return mav;
    }
    
    @RequestMapping("/searchUserList")
    @ResponseBody
    public Map<String, Object> searchUserList() throws Exception{
        
        String userName = request.getParameter("userName");
        //获取分页参数
        int pageIndex = Integer.parseInt(request.getParameter("page"));
        int pageSize = Integer.parseInt(request.getParameter("rows"));
        int total = userListService.countByExample(userName);
        Page pageOb = new Page(pageIndex,pageSize,total);
        //获取排序所需的数据
        StringBuilder sortData = new StringBuilder("");
        String sort=request.getParameter("sort");
        String order=request.getParameter("order");
        order = (StringUtils.defaultString(order).length()==0)?"asc":order;
        sort = (StringUtils.defaultString(sort).length()==0)?"id":sort;
        sortData.append(sort).append(" ").append(order);
        String sortString = sortData.toString();
        //将参数转为map
        Map<String,Object> paramsMap=new HashMap<String,Object>();  
        paramsMap.put("userName", userName);  
        paramsMap.put("empuser",empuser);  
        paramsMap.put("page", pageOb);
        paramsMap.put("sort", sortString);
        
        List<Empuser> userList = userListService.getUserList(paramsMap);
        
        Map<String, Object> result = new HashMap<String, Object>(2);
        
        result.put("rows", userList);
        result.put("total", total);
        return result;
    }
    
    @RequestMapping("/delete")  
    @ResponseBody
    public String delete(String id) throws Exception{ 
        JSONObject jsonObject = new JSONObject();  
        int flag = userListService.deleteByExample(id); 
        if(flag == 1){
            jsonObject.put("success", true);  
            ResponseUtil.write(response, jsonObject); 
        }
        return null;  
    } 
    
    @RequestMapping("/saveUser")  
    public String saveUser(Empuser empuser) throws Exception{  
        //操作记录条数，初始化为0  
        int resultTotal = 0; 
        if (empuser.getId() == null) {  
            resultTotal = userListService.insert(empuser); 
        }else{  
            resultTotal = userListService.update(empuser);
        }  
        JSONObject jsonObject = new JSONObject();  
        if(resultTotal > 0){   //说明修改或添加成功  
            jsonObject.put("success", true);  
        }else{  
            jsonObject.put("success", false);  
        }  
        ResponseUtil.write(response, jsonObject);  
        return null;  
    } 
}
