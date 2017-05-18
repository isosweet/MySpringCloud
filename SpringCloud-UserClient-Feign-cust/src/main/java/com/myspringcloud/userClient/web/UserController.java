package com.myspringcloud.userClient.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myspringcloud.userClient.cleint.UserClient;
import com.myspringcloud.userClient.model.User;

/**  
 * 
 * @Title:  UserClientController.java    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: wangxuezheng  
 * @date:   2017年5月7日 上午9:02:34   
 * @version V1.0 
 */
@RestController
@RequestMapping("userClient")
public class UserController {
	
	@Autowired
	private UserClient userClient;
	
	@RequestMapping(value = "getUser/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable("userId") String userId){
		return userClient.getUser(userId);
	}
	
	@RequestMapping(value = "saveUser", method = RequestMethod.POST)
	public String saveUser(User user){
		
		return userClient.saveUser(user);
	}
	
	@RequestMapping(value = "deleteUser/{userId}", method = RequestMethod.GET)
	public Boolean deleteUser(@PathVariable("userId") String userId){
		
		return userClient.deleteUser(userId);
	}
	
	@RequestMapping(value = "findUserByUserNameAndPassword")
	public User findUserByUserNameAndPassword(String userName, String password){
		
		System.out.println("userClient--->" + userName + "  password--->" + password);
		
		return userClient.findUserByUserNameAndPassword(userName, password);
	}
	
	
}
