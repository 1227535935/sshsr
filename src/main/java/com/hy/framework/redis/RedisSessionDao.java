package com.hy.framework.redis;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by hy on 2018/6/29
 * /**
 *  *
 *  * 使用redis来管理session信息
 *  *
 *  * Copyright(C) 2018-2018
 *  * Author: wanhaoran
 *  * Da
 */
public class RedisSessionDao extends AbstractSessionDAO {

    private static final String SHIRO_REDIS_SESSION_KEY_PREFIX = "shiro:redis.session_";

    private RedisTemplate redisTemplate;

    private ValueOperations valueOperations;

    public RedisSessionDao(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.valueOperations = redisTemplate.opsForValue();
    }

    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = this.generateSessionId(session);
        this.assignSessionId(session,sessionId);
        valueOperations.set(generateKey(sessionId),session,session.getTimeout(),TimeUnit.MILLISECONDS);
        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable serializable) {
        return (Session) valueOperations.get(generateKey(serializable));
    }

    @Override
    public void update(Session session) throws UnknownSessionException {
        valueOperations.set(generateKey(session.getId()),session,session.getTimeout(),TimeUnit.MILLISECONDS);
    }

    @Override
    public void delete(Session session) {
        redisTemplate.delete(generateKey(session.getId()));
    }

    @Override
    public Collection<Session> getActiveSessions() {
        Set<Object> keySet = redisTemplate.keys(generateKey("*"));
        Set<Session> sessionSet = new HashSet<Session>();
        if (keySet == null || keySet.isEmpty()){
            return Collections.emptySet();
        }
        for(Object key : keySet){
            sessionSet.add((Session) valueOperations.get(key));
        }
        return sessionSet;
    }

    /**
     * 重组key
     * 区别其他使用环境的key
     *
     * @param key
     * @return
     */
    private String generateKey(Object key){
        return SHIRO_REDIS_SESSION_KEY_PREFIX + this.getClass().getName()+"_"+key;
    }
}
