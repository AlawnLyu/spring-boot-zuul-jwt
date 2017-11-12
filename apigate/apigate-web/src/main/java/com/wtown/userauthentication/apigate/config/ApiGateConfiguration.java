/**
 * @author LYU
 * @create 2017年11月10日 15:09
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.apigate.config;

import com.wtown.userauthentication.apigate.filter.CustomFilter;
import com.wtown.userauthentication.common.base.BaseConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateConfiguration extends BaseConfiguration {
    @Bean
    public CustomFilter customFilter(){
        return new CustomFilter();
    }
}
