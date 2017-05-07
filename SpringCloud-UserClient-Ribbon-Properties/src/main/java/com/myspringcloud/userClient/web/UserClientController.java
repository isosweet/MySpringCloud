package com.myspringcloud.userClient.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.myspringcloud.userClient.model.User;

/**  
 * 
 * @Title:  UserClientController.java    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: wangxuezheng  
 * @date:   2017年5月2日 下午8:57:16   
 * @version V1.0 
 */
@RestController
@RequestMapping("userClient")
public class UserClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("getUser/{userId}")
	public User getUser(@PathVariable("userId") String userId){
		
		String url = "http://springcloud-userservcie/userService/getUser/" + userId;
		
		return restTemplate.getForObject(url, User.class);
	}
	
}
