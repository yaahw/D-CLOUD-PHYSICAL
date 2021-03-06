package com.ynding.cloud.book;

import com.alibaba.cloud.seata.feign.SeataFeignClientAutoConfiguration;
import com.ynding.cloud.common.annotation.CustomSwaggerConfig;
import com.ynding.cloud.seata.annotation.CustomSeataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

/**
 * @author Administrator
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {SeataFeignClientAutoConfiguration.class, DataSourceAutoConfiguration.class})
//@EntityScan("com.ynding.cloud.book.entity")
@EnableTransactionManagement
@EnableFeignClients
@CustomSwaggerConfig
@CustomSeataConfig
public class PhysicalBookMetaApplication {

    /*@LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate template = new RestTemplate();
        *//*List interceptors = template.getInterceptors();
        if (interceptors == null) {
            template.setInterceptors(Collections.singletonList(new UserContextInterceptor()));
        } else {
            interceptors.add(new UserContextInterceptor());
            template.setInterceptors(interceptors);
        }*//*
        return template;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(PhysicalBookMetaApplication.class, args);
    }
}
