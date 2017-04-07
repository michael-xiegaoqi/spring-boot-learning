package com.gjjf.commonservice.userCenter.redis;

import org.springframework.stereotype.Component;

import com.gjjf.framework.util.StringUtil;

import redis.clients.jedis.Jedis;

@Component
public class UserRedisDao  extends RedisBaseDao {

	//保存页面验证码的key
	private final static String IDENTITY_CODE_KEY = "IDENTITY_CODE_%s";


	public void saveIdentifyCode(String identify_code) {

		if(StringUtil.isEmpty(identify_code)){
			return;
		}

		Jedis jedis = null;
		try {
			jedis 			= getJedis();
			String key  	= String.format(IDENTITY_CODE_KEY, identify_code);
			int expired     = 1200;
			jedis.setex(key, expired, identify_code);
		} catch (Exception e) {
			returnBroken(jedis);
			logger.error("------ RedisDaoException: {}", e);
		} finally {
			release(jedis);
		}
	}


	public String getIdentifyCode(String identify_code) {

		if(StringUtil.isEmpty(identify_code)){
			return "";
		}

		Jedis jedis = null;
		try {
			jedis = getJedis();
			String key   = String.format(IDENTITY_CODE_KEY,identify_code);
			String value = jedis.get(key);

			//不存在时返回空
			if(value == null){
				return "";
			}
			return value;
		} catch (Exception e) {
			returnBroken(jedis);
			logger.error("------ RedisDaoException: {}", e);
		} finally {
			release(jedis);
		}
		return null;
	}

	public void delIdentifyCode(String identify_code) {

		if(StringUtil.isEmpty(identify_code)){
			return;
		}

		Jedis jedis = null;
		try {
			jedis 			= getJedis();
			String key   = String.format(IDENTITY_CODE_KEY,identify_code);
			jedis.del(key);
		} catch (Exception e) {
			returnBroken(jedis);
			logger.error("------ RedisDaoException: {}", e);
		} finally {
			release(jedis);
		}
	}

}
