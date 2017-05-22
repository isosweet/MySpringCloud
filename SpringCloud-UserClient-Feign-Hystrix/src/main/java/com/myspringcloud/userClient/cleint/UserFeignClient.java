package com.myspringcloud.userClient.cleint;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspringcloud.userClient.cleint.hystrix.UserFeignClientHystrix;
import com.myspringcloud.userClient.model.User;

/**  
 * 
 * @Title:  UserClient.java    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: wangxuezheng  
 * @date:   2017年5月7日 上午9:40:15   
 * @version V1.0 
 */
@FeignClient(name = "springcloud-userservcie", fallback = UserFeignClientHystrix.class)
public interface UserFeignClient {
	
	@RequestMapping(value = "userService/getUser/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable("userId") String userId);
	
	@RequestMapping(value = "userService/saveUser", method = RequestMethod.POST)
	public String saveUser(User user);
	
	@RequestMapping(value = "userService/deleteUser/{userId}", method = RequestMethod.GET)
	public Boolean deleteUser(@PathVariable("userId") String userId);
	
	@RequestMapping(value = "userService/findUserByUserNameAndPassword", method = RequestMethod.GET)
	public User findUserByUserNameAndPassword(@RequestParam("userName") String userName, @RequestParam("password") String password);
	
}
