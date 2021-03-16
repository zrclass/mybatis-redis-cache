package org.zrclass.cache.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zrclass.cache.Application;
import org.zrclass.cache.common.entity.User;
import org.zrclass.cache.service.UserService;

import java.util.Date;


/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 13:38
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void findAll() {
        userService.findAll().forEach(u -> System.out.println("u = " + u));
    }

    @Test
    public void findOne(){
        User userById = userService.findUserById(1l);
        System.out.println(userById);
    }


    public void add(){
        User user =new User();
        user.setBirthday(new Date());
        user.setGender(1);
        user.setUsername("jack");
        user.setPassword("123");
        userService.add(user);
    }
}