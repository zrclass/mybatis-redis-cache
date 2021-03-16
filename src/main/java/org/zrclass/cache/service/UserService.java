package org.zrclass.cache.service;

import org.zrclass.cache.common.entity.User;

import java.util.List;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 13:39
 */
public interface UserService {

    List<User> findAll();

    void add(User user);

    void update(String username, Long id);

    User findUserById(Long id);

    void deleteById(Long id);
}
