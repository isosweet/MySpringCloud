package com.myspringcloud.payment.alipay.wap.service;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.MaintainBizOrder;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.myspringcloud.payment.alipay.wap.config.WapPayProperties;
import com.myspringcloud.payment.alipay.wap.controller.WapPayController;
import com.myspringcloud.payment.alipay.wap.model.PayBizRequestParam;

/**  
 * 
 * @Title:  WapPayService.java    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: wangxuezheng  
 * @date:   2017年4月29日 下午12:20:02   
 * @version V1.0 
 */
@Component
public class WapPayService {
	
	private static Logger logger = Logger.getLogger(WapPayService.class);
	
	@Autowired
	private WapPayProperties wapPayProperties;
	
	/**
	 * 生成订单信息，并构造支付请求
	 * 
	 * @param userId
	 * @param totalAmount
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public String createWapPay(String userId, String totalAmount) throws UnsupportedEncodingException{
		
		String serverUrl = wapPayProperties.getServerUrl();
		String appId =  wapPayProperties.getAppId();
		String privateKey = wapPayProperties.getPrivateKey();
		String publicKey = wapPayProperties.getPublicKey();
		String returnUrl = wapPayProperties.getReturnUrl();
		String notifyUrl = wapPayProperties.getNotifyUrl();
		String subject = wapPayProperties.getSubject();
		String sellerId = wapPayProperties.getSellerId();
		
	    AlipayClient alipayClient = new DefaultAlipayClient(serverUrl, appId, privateKey, "json", "utf-8", publicKey, "RSA2"); //获得初始化的AlipayClient
	    AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();//创建API对应的request
	    alipayRequest.setReturnUrl(returnUrl);
	    alipayRequest.setNotifyUrl(notifyUrl);//在公共参数中设置回跳和通知地址
	    
	    //填充业务参数
	    PayBizRequestParam bizRequestParam = new PayBizRequestParam();
	    bizRequestParam.setOut_trade_no("001001001001004");
	    bizRequestParam.setTotal_amount(new BigDecimal(5.00));
	    bizRequestParam.setSubject("理财");
	    bizRequestParam.setSeller_id(sellerId);
	    bizRequestParam.setProduct_code("QUICK_WAP_PAY");
	    
	    alipayRequest.setBizContent(JSON.toJSONString(bizRequestParam));

	    String form="";
	    try {
	        form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
	    } catch (AlipayApiException e) {
	        e.printStackTrace();
	    }
		return form;
	}
	
	
	public String asynchNotify(Map<String,String> params) throws AlipayApiException{
		
		String publicKey = wapPayProperties.getPublicKey();
		
		boolean verify_result = AlipaySignature.rsaCheckV1(params, publicKey, "utf-8", "RSA2");
		if(verify_result){//验证成功
			logger.info("支付宝异步通知，签名检验成功----->" + verify_result);
		}else{
			logger.info("支付宝异步通知，签名检验失败----->" + verify_result);
		}
		
		return "success";
	}
	
	
	public static void main(String[] args) {
		
		String str1 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAg5w527T3uc5btoVzBXfYh1pLvB3WYa6PEBtBK0BFCRWXatdQR1wY5kGdo+Holq8eDb/omnZ6mcJS7WclcH4H24WzT2nHwWpL6y92711e/M+veoPXWBnN+RkljWY6dk/N216DIcxdrSk9n1qH1Q/hwCpGln8cxZWlsUnMBgyGPatSGps2CS4PBRd1yDfaZK53yY5lopAj/j1CkV6e5gi1WKYp7LkJFkuLeqZsd1b9cemhLUIGgF/+dkfXdrvXxHNQL44kcXvX6iLpEd+ZBNC6RUSAn/kbJtYLCN0n7J5jOO3NVU9S+vz/9tcVInQtWCm9Yg1A/uriYGb1p1iCx2YN+QIDAQAB";
		
		String str2 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtlqoOvxxAN2mKNEr6pYkc5HMyPtuD5SPlVWvgMa+IqSwh2QhiPTwOc/S4KNJIu4I7oNiumsHXa3LKhLVey5LRoaajFXpiQ38ORFksiNaUpqiysftj48XbrUCXpqJoDwrRjcrGaZq5wKMT2qA4ceKS0quHwyzLLyCuUHirGa4YVKumrDyfms3GJZ7wfBpWY/m/g655L27wqED2b5k2qWCF+6CF+ysffDmvD8pJ+5widiz3xFYjIzK2pO5xX4KrYvwTprCSuxILSE0XCgTP+V975NXPCIzUsK7Cg8CkUwZapMI+fs4Nya4ocZue1YAQB1912XBgMOzfMRjOINSdqlrTwIDAQAB";
		
		
	}
	
	
}
