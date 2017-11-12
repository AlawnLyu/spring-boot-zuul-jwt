/**
 * @author LYU
 * @create 2017年11月10日 9:15
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.common.base;

import com.wtown.userauthentication.common.converter.json.JsonDataUtil;
import com.wtown.userauthentication.common.converter.json.impl.JsonDataUtilImpl;
import com.wtown.userauthentication.common.converter.xml.XmlDataUtil;
import com.wtown.userauthentication.common.converter.xml.impl.XmlDataUtilImpl;
import org.springframework.context.annotation.Bean;

public class BaseConfiguration {
    @Bean
    public JsonDataUtil jsonDataUtil() {
        return new JsonDataUtilImpl();
    }

    @Bean
    public XmlDataUtil xmlDataUtil() {
        return new XmlDataUtilImpl();
    }
}
