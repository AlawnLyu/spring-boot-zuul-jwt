/**
 * @author LYU
 * @create 2017年11月10日 15:08
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.apigate;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
@EnableZuulProxy
@EnableFeignClients
public class ApiGateStarter {
    public static void main(String[] args) {
        SpringApplication.run(ApiGateStarter.class, args);
    }
}
