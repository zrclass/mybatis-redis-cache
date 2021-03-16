package org.zrclass.cache.common.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cache.Cache;
import org.zrclass.cache.common.redis.RedisService;
import org.zrclass.cache.common.utils.Md5Util;
import org.zrclass.cache.common.utils.SpringUtil;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 12:40
 */
@Slf4j
public class MybatisRedisCache implements Cache {
    public final String id;

    public MybatisRedisCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void putObject(Object key, Object value) {
        RedisService redisService = (RedisService) SpringUtil.getBean("redisService");
        redisService.hSet(id, Md5Util.getMD5Code(key.toString()), value);
    }

    @Override
    public Object getObject(Object key) {
        RedisService redisService = (RedisService) SpringUtil.getBean("redisService");
        return redisService.hGet(id, Md5Util.getMD5Code(key.toString()));
    }

    @Override
    public void clear() {
        RedisService redisService = (RedisService) SpringUtil.getBean("redisService");
        redisService.del(id);
    }

    @Override
    public Object removeObject(Object key) {
        return null;
    }

    @Override
    public int getSize() {
        RedisService redisService = (RedisService) SpringUtil.getBean("redisService");
        return redisService.hSize(id).intValue();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}
