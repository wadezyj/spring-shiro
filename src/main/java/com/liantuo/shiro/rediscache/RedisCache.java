package com.liantuo.shiro.rediscache;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Collection;
import java.util.Set;

/**
 * redis cache
 * Created by ZhangYJ on 15/11/19.
 */
public class RedisCache<K, V> implements Cache<K, V> {

    private RedisTemplate<K, V> redisTemplate;

    public V get(K k) throws CacheException {
        return redisTemplate.opsForValue().get(k);
    }

    public V put(K k, V v) throws CacheException {
        redisTemplate.opsForValue().set(k, v);
        return v;
    }

    public V remove(K k) throws CacheException {
        V v = redisTemplate.opsForValue().get(k);
        redisTemplate.delete(k);
        return v;
    }

    public void clear() throws CacheException {
        //redisTemplate.
    }

    public int size() {
        return redisTemplate.keys((K) "shiro:*").size();
    }

    public Set<K> keys() {
        return redisTemplate.keys((K) "shiro:*");
    }

    public Collection<V> values() {
        return null;
    }
}
