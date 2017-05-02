package com.myspringcloud.payment.alipay.wap.model;

import java.io.Serializable;

/**  
 * 手机网站支付请求参数 - 公共请求参数
 * 
 * @Title:  PayCommonRequestParam.java    
 * @Description:    手机网站支付请求参数 - 公共请求参数
 * @author: wangxuezheng  
 * @date:   2017年4月29日 上午11:34:32   
 * @version V1.0 
 */

public class PayCommonRequestParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 类型：  String  <br>
	 * 是否必填:  是 <br>
	 * 最大长度: 32  <br>
	 * 描述:  支付宝分配给开发者的应用ID  <br>
	 * 示例值:  2014072300007148 <br>
	 */
	private String app_id;
	
	/**
	 * 类型：String    <br>
	 * 是否必填: 是  <br>
	 * 最大长度: 128  <br>
	 * 描述: 接口名称   <br>
	 * 示例值: alipay.trade.wap.pay  <br>
	 */
	private String method;
	
	/**
	 * 类型： String   <br>
	 * 是否必填: 否  <br>
	 * 最大长度:  40 <br>
	 * 描述: 仅支持JSON   <br>
	 * 示例值: JSON  <br>
	 */
	private String format;
	
	/**
	 * 类型：String    <br>
	 * 是否必填:  否 <br>
	 * 最大长度: 256  <br>
	 * 描述:  HTTP/HTTPS开头字符串  <br>
	 * 示例值: https://m.alipay.com/Gk8NF23  <br>
	 */
	private String return_url;

	/**
	 * 类型： String   <br>
	 * 是否必填: 是  <br>
	 * 最大长度:  10 <br>
	 * 描述: 请求使用的编码格式，如utf-8,gbk,gb2312等   <br>
	 * 示例值: utf-8  <br>
	 */
	private String charset;
	
	/**
	 * 类型：  String  <br>
	 * 是否必填:  是 <br>
	 * 最大长度: 10  <br>
	 * 描述:  商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2  <br>
	 * 示例值: RSA2  <br>
	 */
	private String sign_type;
	
	
	/**
	 * 类型： String   <br>
	 * 是否必填:  是 <br>
	 * 最大长度: 256  <br>
	 * 描述:  商户请求参数的签名串，详见签名  <br>
	 * 示例值: 详见示例  <br>
	 */
	private String sign;
	
	/**
	 * 类型：  String  <br>
	 * 是否必填:  是 <br>
	 * 最大长度: 19  <br>
	 * 描述:   发送请求的时间，格式"yyyy-MM-dd HH:mm:ss" <br>
	 * 示例值:  2014-07-24 03:07:50 <br>
	 */
	private String timestamp;
	
	/**
	 * 类型：  String  <br>
	 * 是否必填: 是  <br>
	 * 最大长度: 3  <br>
	 * 描述: 调用的接口版本，固定为：1.0   <br>
	 * 示例值:  1.0 <br>
	 */
	private String version;
	
	/**
	 * 类型：   String <br>
	 * 是否必填: 否  <br>
	 * 最大长度: 256  <br>
	 * 描述:  支付宝服务器主动通知商户服务器里指定的页面http/https路径。  <br>
	 * 示例值: https://api.xx.com/receive_notify.htm  <br>
	 */
	private String notify_url;
	
	/**
	 * 类型：  String  <br>
	 * 是否必填: 是  <br>
	 * 最大长度:  业务请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档 <br>
	 * 描述:    <br>
	 * 示例值:   <br>
	 */
	private String biz_content;

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getReturn_url() {
		return return_url;
	}

	public void setReturn_url(String return_url) {
		this.return_url = return_url;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getSign_type() {
		return sign_type;
	}

	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getBiz_content() {
		return biz_content;
	}

	public void setBiz_content(String biz_content) {
		this.biz_content = biz_content;
	}
	

}
