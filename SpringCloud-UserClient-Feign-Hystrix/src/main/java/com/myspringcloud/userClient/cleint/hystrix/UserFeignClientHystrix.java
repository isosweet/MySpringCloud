package com.myspringcloud.userClient.cleint.hystrix;

import org.springframework.stereotype.Component;

import com.myspringcloud.userClient.cleint.UserFeignClient;
import com.myspringcloud.userClient.model.User;

/**
 * UserFeignClient 的断路器
 * 
 * @author wangxuezheng
 *
 */
@Component
public class UserFeignClientHystrix implements UserFeignClient {

	@Override
	public User getUser(String userId) {
		System.out.println("打开了断路器--->" + userId);
		return null;
	}

	@Override
	public String saveUser(User user) {
		return null;
	}

	@Override
	public Boolean deleteUser(String userId) {
		return null;
	}

	@Override
	public User findUserByUserNameAndPassword(String userName, String password) {
		return null;
	}

}
