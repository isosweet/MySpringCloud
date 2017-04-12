package com.myspringcloud.config.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigClientController {
	
	@Value("${driver}")
	private String jdbcDriver;
	
	@Value("${url}")
	private String jdbcUrl;
	
	@Value("${username}")
	private String jdbcUsername;
	
	@Value("${password}")
	private String jdbcPassword;
	
	@GetMapping("/getDataBaseProp")
	public String getDataBaseProp(){
		
		return jdbcDriver + "---" + jdbcUrl + "---" + jdbcUsername + "---" + jdbcPassword;
	}
	
	
	
}
