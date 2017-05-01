package com.myspringcloud.payment.alipay.wap.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.myspringcloud.payment.alipay.wap.service.WapPayService;

/**  
 * WAP Pay
 * 
 * @Title:  WapPayController.java    
 * @Description:    WAP Pay 
 * @author: wangxuezheng  
 * @date:   2017年4月29日 下午12:08:16   
 * @version V1.0 
 */
@RestController
public class WapPayController {
	
	private static Logger logger = Logger.getLogger(WapPayController.class);
	
	@Autowired
	private WapPayService wapPayService;
	
	/**
	 * 
	 * @param userId  用户Id
	 * @param totalAmount 交易金额
	 * @return
	 */
	@GetMapping("/wap/createWapPay")
	public void createWapPay(String userId, String totalAmount, HttpServletResponse httpResponse){
		
		try {
			String form = wapPayService.createWapPay(userId, totalAmount);
			
			logger.info("支付宝，创建交易的表单数据--->" + form);
			
			httpResponse.setContentType("text/html;charset=utf-8");
			httpResponse.getWriter().write(form);//直接将完整的表单html输出到页面
			httpResponse.getWriter().flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@GetMapping("/wap/synchNotify")
	public String synchNotify(HttpServletRequest request){
		
		//获取支付宝GET过来反馈信息
		Map<String,String> params = new HashMap<String,String>();
		try {
			Map requestParams = request.getParameterMap();
			for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
				String name = (String) iter.next();
				String[] values = (String[]) requestParams.get(name);
				String valueStr = "";
				for (int i = 0; i < values.length; i++) {
					valueStr = (i == values.length - 1) ? valueStr + values[i]
							: valueStr + values[i] + ",";
				}
				//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
				valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
				params.put(name, valueStr);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		logger.info("支付宝同步通知---->" + JSON.toJSONString(params));
		
		return "";
	}
	
	
	@PostMapping("/wap/asynchNotify")
	public String asynchNotify(HttpServletRequest request){
		
		//获取支付宝POST过来反馈信息
		Map<String,String> params = new HashMap<String,String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
			params.put(name, valueStr);
		}
		
		logger.info("支付宝异步通知---->" + JSON.toJSONString(params));
		
		try {
			wapPayService.asynchNotify(params);
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}
		
		return "success";
	}
	
	
	
	
	
}
