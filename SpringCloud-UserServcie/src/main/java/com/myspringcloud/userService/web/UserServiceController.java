package com.myspringcloud.userService.web;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.myspringcloud.userService.model.User;

/**  
 * 
 * @Title:  UserServiceController.java    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: wangxuezheng  
 * @date:   2017年5月2日 下午9:02:02   
 * @version V1.0 
 */
@RestController
@RequestMapping("userService")
public class UserServiceController {
	
	@GetMapping("getUser/{userId}")
	public User getUser(@PathVariable("userId") String userId){
		
		System.out.println("获取User,更具UserId，查询User-->" + userId);
		
		User user = new User();
		user.setUserName("Tom");
		user.setPassword("123");
		user.setUserType(1);
		user.setRegisterTime(new Date());
		user.setValidity("0");
		
		return user;
		
	}
	
	@PostMapping("saveUser")
	public String saveUser(@RequestBody User user){
		
		System.out.println("保存User--->" + JSON.toJSONString(user));
		
		return "userId:010100100101";
	}
	
	@GetMapping("deleteUser/{userId}")
	public Boolean deleteUser(@PathVariable("userId") String userId){
		
		System.out.println("删除用户--->" + userId);
		
		return true;
	}
	
	@RequestMapping(value = "findUserByUserNameAndPassword")
	public User findUserByUserNameAndPassword(String userName, String password){
		
		System.out.println("userService--->" + userName + "  password--->" + password);
		
		User user = new User();
		user.setUserName("Tomcat");
		user.setPassword("123");
		user.setUserType(1);
		user.setRegisterTime(new Date());
		user.setValidity("0");
		
		return user;
	}
	
	
	
	
	
	
	
	
	
	
	
}
