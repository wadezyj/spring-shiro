package com.liantuo.shiro.rediscache;

import org.apache.shiro.ShiroException;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.util.Destroyable;
import org.apache.shiro.util.Initializable;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * redis shiro cache manage
 * Created by ZhangYJ on 15/11/19.
 */
public class RedisCacheManager implements CacheManager, Initializable, Destroyable {

    private RedisTemplate<String, String> redisTemplate;

    public <K, V> Cache<K, V> getCache(String s) throws CacheException {
        return new RedisCache<K, V>();
    }

    public void destroy() throws Exception {

    }

    public void init() throws ShiroException {

    }
}
