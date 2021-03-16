package org.zrclass.cache.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        SpringUtil.applicationContext = context;
    }
    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }
    
    public static <T> T getBean(Class<T> t) {
        return applicationContext.getBean(t);
    }
}
