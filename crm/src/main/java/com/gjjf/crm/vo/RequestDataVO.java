package com.gjjf.crm.vo;

public class RequestDataVO {
	
	/**
	 * 查询申请机构的编码
	 */
	private String memberNo;
	
	/**
	 * 版本号 本期项目默认为 1.0
	 */
	private String version;
	
	/**
	 * 核心请求数据
	 */
	private QueryRiskDataVO data;

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public QueryRiskDataVO getData() {
		return data;
	}

	public void setData(QueryRiskDataVO data) {
		this.data = data;
	}

}