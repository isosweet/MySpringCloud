package com.myspringcloud.userService.web;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		
		System.out.println("userId--04-->" + userId);
		
		User user = new User();
		user.setUserName("Tom");
		user.setPassword("123");
		user.setUserType(1);
		user.setRegisterTime(new Date());
		user.setValidity("0");
		
		return user;
		
	}
	
}
