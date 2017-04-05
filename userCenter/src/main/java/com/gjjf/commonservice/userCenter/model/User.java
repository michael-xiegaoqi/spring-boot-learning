package com.gjjf.commonservice.userCenter.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {

	private Long id;

    private String username;

    private String mobilephone;

    private Date createtime;

    private BigDecimal usablesum;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public BigDecimal getUsablesum() {
		return usablesum;
	}

	public void setUsablesum(BigDecimal usablesum) {
		this.usablesum = usablesum;
	}

	
}
