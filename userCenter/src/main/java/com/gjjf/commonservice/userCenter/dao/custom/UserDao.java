/**
 * Copyright: Copyright 2007-2016 LSMY All Rights Reserved.
 * @Title: UserDao.java
 * @lastModifier
 */

package com.gjjf.commonservice.userCenter.dao.custom;

import org.apache.ibatis.annotations.Mapper;

import com.gjjf.userCenter.common.vo.user.UserVO;

/**
 * @Description
 * @date 2016年7月5日 下午4:46:24
 */
@Mapper
public interface UserDao
{
    /**
     * @Description 会员信息查询
     * @param user_id 用户id
     * @return
     * @lastModifier
     */
    public UserVO getMemberInfo(int user_id);
    
}