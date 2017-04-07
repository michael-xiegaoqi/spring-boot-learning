package com.gjjf.commonservice.userCenter.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.gjjf.commonservice.userCenter.model.User;
import com.gjjf.framework.util.JSONUtils;

import redis.clients.jedis.Jedis;

@Component
public class UserRedisDao  extends RedisBaseDao {

	private Logger logger = LoggerFactory.getLogger(UserRedisDao.class);
	
	//会员的key %s 为用户ID
	private final static String USER_KEY = "USER_KEY_%s";


	public void saveUser(User user) {

		if(user == null){
			return;
		}

		Jedis jedis = null;
		try {
			jedis 			= getJedis();
			String key  	= String.format(USER_KEY, user.getId());
			
			String value = JSONUtils.toJsonString(user);
			
			logger.info("缓存会员数据的 key ：{}，value: {}",key,value);
			
			jedis.set(key, value);
		} catch (Exception e) {
			returnBroken(jedis);
			logger.error("------ RedisDaoException: {}", e);
		} finally {
			release(jedis);
		}
	}


	public User getUser(Long id) {

		if(id == null || id == 0){
			return null;
		}

		Jedis jedis = null;
		try {
			jedis = getJedis();
			String key   = String.format(USER_KEY,id);
			String value = jedis.get(key);

			//不存在时返回空
			if(value == null){
				return null;
			}
			
			User user = JSONUtils.toObject(value, User.class);
			
			return user;
		} catch (Exception e) {
			returnBroken(jedis);
			logger.error("------ RedisDaoException: {}", e);
		} finally {
			release(jedis);
		}
		return null;
	}

}
