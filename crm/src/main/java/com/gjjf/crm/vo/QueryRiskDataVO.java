package com.gjjf.crm.vo;

public class QueryRiskDataVO {
	
	/**
	 * 请求类型(固定为 query)
	 */
	private String action;
	
	/**
	 * 姓名或企业名称
	 */
	private String name;
	
	/**
	 * 证件类型
	 * 取值对照:
		01=组织机构代码(9 位,不含-) 
		02=统一社会信用代码
		03=身份证(二代)
		04=军官证
		05=台胞证
		06=护照
		99=其他
	 */
	private String idType;
	
	/**
	 * 证件号码
	 */
	private String idNo;
	
	/**
	 * 查询结果汇总的时间范围 单位=月; 取值范围:1~12;默认=3
	 */
	private int period;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

}