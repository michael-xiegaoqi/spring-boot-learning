package com.gjjf.commonservice.userCenter.model;

import java.io.Serializable;
import java.util.Date;

public class UcUser implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -6604546137738270458L;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.user_id
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.user_pwd
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String user_pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.mmh
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String mmh;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.phone
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.nick_name
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String nick_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.user_level_id
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Integer user_level_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.user_photo
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String user_photo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.email
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.birthday
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.regist_channel
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Integer regist_channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.last_consume_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Date last_consume_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.create_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Date create_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.status
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.status_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Date status_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.sex
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.last_update_creater
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String last_update_creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.last_update_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private Date last_update_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.creater
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.freeze_reason
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String freeze_reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uc_user.tag
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    private String tag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.user_id
     *
     * @return the value of uc_user.user_id
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.user_id
     *
     * @param user_id the value for uc_user.user_id
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.user_pwd
     *
     * @return the value of uc_user.user_pwd
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getUser_pwd() {
        return user_pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.user_pwd
     *
     * @param user_pwd the value for uc_user.user_pwd
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd == null ? null : user_pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.mmh
     *
     * @return the value of uc_user.mmh
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getMmh() {
        return mmh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.mmh
     *
     * @param mmh the value for uc_user.mmh
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setMmh(String mmh) {
        this.mmh = mmh == null ? null : mmh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.phone
     *
     * @return the value of uc_user.phone
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.phone
     *
     * @param phone the value for uc_user.phone
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.nick_name
     *
     * @return the value of uc_user.nick_name
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getNick_name() {
        return nick_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.nick_name
     *
     * @param nick_name the value for uc_user.nick_name
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.user_level_id
     *
     * @return the value of uc_user.user_level_id
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Integer getUser_level_id() {
        return user_level_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.user_level_id
     *
     * @param user_level_id the value for uc_user.user_level_id
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setUser_level_id(Integer user_level_id) {
        this.user_level_id = user_level_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.user_photo
     *
     * @return the value of uc_user.user_photo
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getUser_photo() {
        return user_photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.user_photo
     *
     * @param user_photo the value for uc_user.user_photo
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo == null ? null : user_photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.email
     *
     * @return the value of uc_user.email
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.email
     *
     * @param email the value for uc_user.email
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.birthday
     *
     * @return the value of uc_user.birthday
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.birthday
     *
     * @param birthday the value for uc_user.birthday
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.regist_channel
     *
     * @return the value of uc_user.regist_channel
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Integer getRegist_channel() {
        return regist_channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.regist_channel
     *
     * @param regist_channel the value for uc_user.regist_channel
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setRegist_channel(Integer regist_channel) {
        this.regist_channel = regist_channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.last_consume_time
     *
     * @return the value of uc_user.last_consume_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Date getLast_consume_time() {
        return last_consume_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.last_consume_time
     *
     * @param last_consume_time the value for uc_user.last_consume_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setLast_consume_time(Date last_consume_time) {
        this.last_consume_time = last_consume_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.create_time
     *
     * @return the value of uc_user.create_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.create_time
     *
     * @param create_time the value for uc_user.create_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.status
     *
     * @return the value of uc_user.status
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.status
     *
     * @param status the value for uc_user.status
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.status_time
     *
     * @return the value of uc_user.status_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Date getStatus_time() {
        return status_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.status_time
     *
     * @param status_time the value for uc_user.status_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setStatus_time(Date status_time) {
        this.status_time = status_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.sex
     *
     * @return the value of uc_user.sex
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.sex
     *
     * @param sex the value for uc_user.sex
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.last_update_creater
     *
     * @return the value of uc_user.last_update_creater
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getLast_update_creater() {
        return last_update_creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.last_update_creater
     *
     * @param last_update_creater the value for uc_user.last_update_creater
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setLast_update_creater(String last_update_creater) {
        this.last_update_creater = last_update_creater == null ? null : last_update_creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.last_update_time
     *
     * @return the value of uc_user.last_update_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public Date getLast_update_time() {
        return last_update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.last_update_time
     *
     * @param last_update_time the value for uc_user.last_update_time
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setLast_update_time(Date last_update_time) {
        this.last_update_time = last_update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.creater
     *
     * @return the value of uc_user.creater
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.creater
     *
     * @param creater the value for uc_user.creater
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.freeze_reason
     *
     * @return the value of uc_user.freeze_reason
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getFreeze_reason() {
        return freeze_reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.freeze_reason
     *
     * @param freeze_reason the value for uc_user.freeze_reason
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setFreeze_reason(String freeze_reason) {
        this.freeze_reason = freeze_reason == null ? null : freeze_reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uc_user.tag
     *
     * @return the value of uc_user.tag
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uc_user.tag
     *
     * @param tag the value for uc_user.tag
     *
     * @mbggenerated Sun Oct 16 16:13:05 CST 2016
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}