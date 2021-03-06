package com.springboot.test.config;

import com.seatelgroup.fivepay.demo.mapper.UserDao;
import com.seatelgroup.fivepay.mapper.UserDao;
import com.seatelgroup.mpay.demo.mapper.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.seatel.mapper.UserDao;

@Configuration //通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
@ComponentScan(basePackages = "com.seatel") //配置扫描包
public class SpringConfig {
    
    @Bean // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public UserDao getUserDao(){
        return new UserDao(); // 直接new对象做演示
    }
}
