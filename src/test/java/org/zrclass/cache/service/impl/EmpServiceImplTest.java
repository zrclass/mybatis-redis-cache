package org.zrclass.cache.service.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zrclass.cache.Application;
import org.zrclass.cache.service.EmpService;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 15:33
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class EmpServiceImplTest {

    @Autowired
    private EmpService empService;

    @Test
    void findAll() {
        empService.findAll().forEach(e -> System.out.println("e: =>" + e));
    }

    @Test
    void add() {
    }

    @Test
    void update() {
    }

    @Test
    void findById() {
    }
}