package org.zrclass.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 20114535 zhourui
 * @version 1.0
 * @date 2021/3/16 11:16
 */
@SpringBootApplication
@MapperScan("org.zrclass.cache.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
