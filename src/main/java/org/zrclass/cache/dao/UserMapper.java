package org.zrclass.cache.dao;

import org.apache.ibatis.annotations.Param;
import org.zrclass.cache.common.entity.User;

import java.util.List;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 11:49
 */
public interface UserMapper {
    List<User> findAll();

    void add(User user);

    /**
     * AdminUserMapper.xml
     *
     * @param username
     * @param id
     */
    void updateUsernameById(@Param("username") String username, @Param("id") Long id);

    User findOne(@Param("id") Long id);

    void deleteById(@Param("id") Long id);
}
