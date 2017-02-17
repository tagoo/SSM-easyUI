package com.cn.ts.business.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.ts.business.model.Empuser;
import com.cn.ts.business.model.EmpuserKey;
import com.cn.ts.business.service.LoginService;
import com.cn.ts.frame.Web.BaseController;
import com.cn.ts.frame.bean.UserInfo;

@Controller  
public class LoginController extends BaseController{
    
    @Resource
    private LoginService loginService;  
    
	@RequestMapping("/login")
    public ModelAndView login(String userName, String password){
		if(!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password)){
		    Empuser user = loginService.selectUserByUserName(userName);
			if(password.equals(user.getPassword())){
				ModelAndView mav = new ModelAndView("main");
				
				UserInfo userInfo = new UserInfo();
				userInfo.setUserId(user.getId());
				userInfo.setUserName(user.getUsername());
				userInfo.setPassWord(user.getPassword());
				
				HttpSession session = request.getSession(true);
				session.setAttribute("userInfo", userInfo);
				
		        return mav;
			}else{
				ModelAndView mav = new ModelAndView("login");   
		        return mav;
			}	
		}else{
			ModelAndView mav = new ModelAndView("login");   
	        return mav;
		}
    }
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session){
        session.invalidate();
        
		ModelAndView mav = new ModelAndView("login");
        return mav;
	}
}
