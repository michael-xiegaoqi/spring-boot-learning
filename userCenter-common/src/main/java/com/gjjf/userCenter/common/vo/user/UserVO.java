package com.gjjf.userCenter.common.vo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 用户基础信息vo
 * @author bm
 * @date 2016年7月5日 下午2:04:18
 */
public class UserVO implements Serializable
{
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -3040199513753214256L;

    /**
     * 用户id
     */
    private Integer user_id;

    /**
     * 用户密码
     */
    private String user_pwd;

    /**
     * 木木号
     */
    private String mmh;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 昵称
     */
    private String nick_name;

    /**
     * 用户等级
     */
    private Integer user_level_id;

    /**
     * 用户等级名称
     */
    private String user_level_name;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 用户头像
     */
    private String user_photo;

    /**
     * email
     */
    private String email;

    /**
     * 用户生日
     */
    private Date birthday;

    /**
     * 用户注册渠道
     */
    private Integer regist_channel;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 注册开始日期
     */
    private Date create_start_time;

    /**
     * 注册结束日期
     */
    private Date create_end_time;

    /**
     * 当前页码
     */
    private Integer start_page;

    /**
     * 每页数量
     */
    private Integer pages;

    /**
     * 账户余额
     */
    private Integer account_balance;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 个人标签
     */
    private String tag;

    public Integer getUser_id()
    {
        return user_id;
    }

    public void setUser_id(Integer user_id)
    {
        this.user_id = user_id;
    }

    public String getUser_pwd()
    {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd)
    {
        this.user_pwd = user_pwd;
    }

    public String getMmh()
    {
        return mmh;
    }

    public void setMmh(String mmh)
    {
        this.mmh = mmh;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getNick_name()
    {
        return nick_name;
    }

    public void setNick_name(String nick_name)
    {
        this.nick_name = nick_name;
    }

    public Integer getUser_level_id()
    {
        return user_level_id;
    }

    public void setUser_level_id(Integer user_level_id)
    {
        this.user_level_id = user_level_id;
    }

    public String getUser_photo()
    {
        return user_photo;
    }

    public void setUser_photo(String user_photo)
    {
        this.user_photo = user_photo;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public Integer getRegist_channel()
    {
        return regist_channel;
    }

    public void setRegist_channel(Integer regist_channel)
    {
        this.regist_channel = regist_channel;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Date getCreate_start_time()
    {
        return create_start_time;
    }

    public void setCreate_start_time(Date create_start_time)
    {
        this.create_start_time = create_start_time;
    }

    public Date getCreate_end_time()
    {
        return create_end_time;
    }

    public void setCreate_end_time(Date create_end_time)
    {
        this.create_end_time = create_end_time;
    }

    public Integer getStart_page()
    {
        return start_page;
    }

    public void setStart_page(Integer start_page)
    {
        this.start_page = start_page;
    }

    public Integer getPages()
    {
        return pages;
    }

    public void setPages(Integer pages)
    {
        this.pages = pages;
    }

    public Date getCreate_time()
    {
        return create_time;
    }

    public void setCreate_time(Date create_time)
    {
        this.create_time = create_time;
    }

    public String getUser_level_name()
    {
        return user_level_name;
    }

    public void setUser_level_name(String user_level_name)
    {
        this.user_level_name = user_level_name;
    }

    public Integer getSex()
    {
        return sex;
    }

    public void setSex(Integer sex)
    {
        this.sex = sex;
    }

    public Integer getAccount_balance()
    {
        return account_balance;
    }

    public void setAccount_balance(Integer account_balance)
    {
        this.account_balance = account_balance;
    }

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
