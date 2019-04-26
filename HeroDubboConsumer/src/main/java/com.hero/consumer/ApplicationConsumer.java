package com.hero.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Des:
 * @Auther: 飞狐
 * @Date: 2019-04-24
 */
@SpringBootApplication
@EnableDubbo //启动dubbo注解，自动导入application.yml配置
@ImportResource(locations = "classpath:spring/hero-dubbo-consumer.xml")// 导入consumer配置
public class ApplicationConsumer {
    public static void main(String[] args){
        SpringApplication.run(ApplicationConsumer.class, args);
    }
}
