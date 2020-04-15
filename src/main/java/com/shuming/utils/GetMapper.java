package com.shuming.utils;

import com.shuming.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetMapper {
    private static UserMapper userMapper;
    public static UserMapper get(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:spring/spring-config.xml");
        return (UserMapper) applicationContext.getBean("userMapper");
    }
}
