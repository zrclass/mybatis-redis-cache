package org.zrclass.cache.service.impl;

import com.sun.xml.bind.v2.model.core.ID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zrclass.cache.common.entity.User;
import org.zrclass.cache.dao.EmpMapper;
import org.zrclass.cache.dao.UserMapper;
import org.zrclass.cache.service.UserService;

import java.util.List;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 12:38
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll(){
        List<User> all = userMapper.findAll();
        return all;
    }

    @Override
    public void add(User user) {
        userMapper.add(user);

    }

    @Override
    public void update(String username, Long id) {
        userMapper.updateUsernameById(username,id);
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.findOne(id);
    }

    @Override
    public void deleteById(Long id) {
        userMapper.deleteById(id);
    }
}
