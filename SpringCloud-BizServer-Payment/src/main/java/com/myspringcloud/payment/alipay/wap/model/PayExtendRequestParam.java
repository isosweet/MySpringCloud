package com.myspringcloud.payment.alipay.wap.model;

import java.io.Serializable;

/**  
 * 手机网站支付请求参数 - 业务扩展请求参数
 * 
 * @Title:  PayExtendRequestParam.java    
 * @Description:    手机网站支付请求参数 - 业务扩展请求参数
 * @author: wangxuezheng  
 * @date:   2017年4月29日 下午12:03:08   
 * @version V1.0 
 */

public class PayExtendRequestParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 类型：  String  <br>
	 * 是否必填: 否  <br>
	 * 最大长度: 64  <br>
	 * 描述: 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID   <br>
	 * 示例值: 2088511833207846  <br>
	 */	
	private String sys_service_provider_id;
	
	/**
	 * 类型：String    <br>
	 * 是否必填:  否 <br>
	 * 最大长度: 1  <br>
	 * 描述:  是否发起实名校验    <br>
				T：发起     <br>
				F：不发起  <br>
	 * 示例值:  T <br>
	 */	
	private String needBuyerRealnamed;
	
	/**
	 * 类型：   String <br>
	 * 是否必填:  否 <br>
	 * 最大长度: 128  <br>
	 * 描述:  账务备注 <br>
				注：该字段显示在离线账单的账务备注中  <br>
	 * 示例值: 促销  <br>
	 */	
	private String TRANS_MEMO;

	public String getSys_service_provider_id() {
		return sys_service_provider_id;
	}

	public void setSys_service_provider_id(String sys_service_provider_id) {
		this.sys_service_provider_id = sys_service_provider_id;
	}

	public String getNeedBuyerRealnamed() {
		return needBuyerRealnamed;
	}

	public void setNeedBuyerRealnamed(String needBuyerRealnamed) {
		this.needBuyerRealnamed = needBuyerRealnamed;
	}

	public String getTRANS_MEMO() {
		return TRANS_MEMO;
	}

	public void setTRANS_MEMO(String tRANS_MEMO) {
		TRANS_MEMO = tRANS_MEMO;
	}
	
	
	
}
