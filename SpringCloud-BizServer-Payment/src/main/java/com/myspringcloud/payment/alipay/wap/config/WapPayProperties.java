package com.myspringcloud.payment.alipay.wap.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**  
 * 
 * @Title:  WapPayProperties.java    
 * @Description:  
 * @author: wangxuezheng  
 * @date:   2017年4月29日 下午12:35:14   
 * @version V1.0 
 */
@Configuration
public class WapPayProperties {
				
	@Value("${alipay.wap.server_url}")
	private String serverUrl;
	
	@Value("${alipay.wap.app_id}")
	private String appId;
	
	@Value("${alipay.wap.seller_id}")
	private String sellerId;
	
	@Value("${alipay.wap.public_key}")
	private String publicKey;
	
	@Value("${alipay.wap.private_key}")
	private String privateKey;
	
	@Value("${alipay.wap.return_url}")
	private String returnUrl;
	
	@Value("${alipay.wap.notify_url}")
	private String notifyUrl;
	
	@Value("${alipay.wap.subject}")
	private String subject;

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
