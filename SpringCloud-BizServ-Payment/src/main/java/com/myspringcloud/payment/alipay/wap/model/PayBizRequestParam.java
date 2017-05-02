package com.myspringcloud.payment.alipay.wap.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**  
 * 手机网站支付请求参数 - 业务请求参数
 * 
 * @Title:  PayBizRequestParam.java    
 * @Description:    手机网站支付请求参数 - 业务请求参数  
 * @author: wangxuezheng  
 * @date:   2017年4月29日 上午11:48:37   
 * @version V1.0 
 */

public class PayBizRequestParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 类型：String    <br>
	 * 是否必填: 否  <br>
	 * 最大长度: 128  <br>
	 * 描述: Iphone6 16G   <br>
	 * 示例值:  对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。 <br>
	 */	
	private String body;

	/**
	 * 类型：String    <br>
	 * 是否必填: 是  <br>
	 * 最大长度: 256  <br>
	 * 描述:商品的标题/交易标题/订单标题/订单关键字等。    <br>
	 * 示例值:  大乐透 <br>
	 */	
	private String subject;
	
	/**
	 * 类型： String   <br>
	 * 是否必填:  是 <br>
	 * 最大长度: 64  <br>
	 * 描述:  商户网站唯一订单号  <br>
	 * 示例值: 70501111111S001111119  <br>
	 */	
	private String out_trade_no;
	
	/**
	 * 类型： String   <br>
	 * 是否必填: 否  <br>
	 * 最大长度: 6  <br>
	 * 描述:  该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。<br>
	 * 		  m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 <br>
	 * 		   该参数数值不接受小数点， 如 1.5h，可转换为 90m。  <br>
	 * 示例值:  90m <br>
	 */	
	private String timeout_express;
	
	/**
	 * 类型：Price    <br>
	 * 是否必填: 是  <br>
	 * 最大长度: 9  <br>
	 * 描述:  订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]  <br>
	 * 示例值:  9.00 <br>
	 */	
	private BigDecimal total_amount;
	
	/**
	 * 类型： String   <br>
	 * 是否必填: 否  <br>
	 * 最大长度:  28 <br>
	 * 描述: 收款支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID   <br>
	 * 示例值:  2088102147948060 <br>
	 */	
	private String seller_id;
	
	/**
	 * 类型：   String <br>
	 * 是否必填: 否  <br>
	 * 最大长度:  40 <br>
	 * 描述:   针对用户授权接口，获取用户相关数据时，用于标识用户授权关系 <br>
	 * 示例值: appopenBb64d181d0146481ab6a762c00714cC27  <br>
	 */	
	private String auth_token;
	
	/**
	 * 类型：  String  <br>
	 * 是否必填: 是  <br>
	 * 最大长度:   64 <br>
	 * 描述:  销售产品码，商家和支付宝签约的产品码  <br>
	 * 示例值:  QUICK_WAP_PAY <br>
	 */	
	private String product_code;
	
	/**
	 * 类型：  String  <br>
	 * 是否必填:  否 <br>
	 * 最大长度: 2  <br>
	 * 描述:  商品主类型：0—虚拟类商品，1—实物类商品 <br >
			    注：虚拟类商品不支持使用花呗渠道  <br>
	 * 示例值: 0  <br>
	 */	
	private String goods_type;
	
	/**
	 * 类型： String   <br>
	 * 是否必填: 否  <br>
	 * 最大长度:  512 <br>
	 * 描述: 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝会在异步通知时将该参数原样返回。<br>
	 * 		 本参数必须进行UrlEncode之后才可以发送给支付宝   <br>
	 * 示例值: merchantBizType%3d3C%26merchantBizNo%3d2016010101111  <br>
	 */	
	private String passback_params;
	
	/**
	 * 类型：  String  <br>
	 * 是否必填:  否 <br>
	 * 最大长度:  512 <br>
	 * 描述: 优惠参数 <br>
				注：仅与支付宝协商后可用   <br>
	 * 示例值:  {"storeIdType":"1"} <br>
	 */	
	private String promo_params;
	
	/**
	 * 类型：String    <br>
	 * 是否必填:  否 <br>
	 * 最大长度:   <br>
	 * 描述:   业务扩展参数，详见下面的“业务扩展参数说明” <br>
	 * 示例值:  {"sys_service_provider_id":"2088511833207846"} <br>
	 */	
	private String extend_params;
	
	/**
	 * 类型： String   <br>
	 * 是否必填: 否  <br>
	 * 最大长度: 128  <br>
	 * 描述:  可用渠道，用户只能在指定渠道范围内支付当有多个渠道时用“,”分隔 <br>
				注：与disable_pay_channels互斥  <br>
	 * 示例值: pcredit,moneyFund,debitCardExpress  <br>
	 */	
	private String enable_pay_channels;
	
	/**
	 * 类型：  String  <br>
	 * 是否必填:  否 <br>
	 * 最大长度: 128  <br>
	 * 描述:  禁用渠道，用户不可用指定渠道支付当有多个渠道时用“,”分隔 <br >
					注：与enable_pay_channels互斥  <br>
	 * 示例值: pcredit,moneyFund,debitCardExpress  <br>
	 */	
	private String disable_pay_channels;
	
	/**
	 * 类型： String   <br>
	 * 是否必填:  否 <br>
	 * 最大长度: 32  <br>
	 * 描述:  商户门店编号  <br>
	 * 示例值: NJ_001  <br>
	 */	
	private String store_id;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getTimeout_express() {
		return timeout_express;
	}

	public void setTimeout_express(String timeout_express) {
		this.timeout_express = timeout_express;
	}

	public BigDecimal getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(BigDecimal total_amount) {
		this.total_amount = total_amount;
	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getAuth_token() {
		return auth_token;
	}

	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getGoods_type() {
		return goods_type;
	}

	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}

	public String getPassback_params() {
		return passback_params;
	}

	public void setPassback_params(String passback_params) {
		this.passback_params = passback_params;
	}

	public String getPromo_params() {
		return promo_params;
	}

	public void setPromo_params(String promo_params) {
		this.promo_params = promo_params;
	}

	public String getExtend_params() {
		return extend_params;
	}

	public void setExtend_params(String extend_params) {
		this.extend_params = extend_params;
	}

	public String getEnable_pay_channels() {
		return enable_pay_channels;
	}

	public void setEnable_pay_channels(String enable_pay_channels) {
		this.enable_pay_channels = enable_pay_channels;
	}

	public String getDisable_pay_channels() {
		return disable_pay_channels;
	}

	public void setDisable_pay_channels(String disable_pay_channels) {
		this.disable_pay_channels = disable_pay_channels;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	
	
	
}
