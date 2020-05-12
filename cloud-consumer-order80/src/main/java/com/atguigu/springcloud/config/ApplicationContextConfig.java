package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author humingtao
 * @create 2020/5/12 22:50
 */
@Configuration
public class ApplicationContextConfig {

    /*类似于 <bean id="" class="" >*/
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
