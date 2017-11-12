/**
 * @author LYU
 * @create 2017年11月10日 9:29
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.common.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelfLogFactory {
    public static <T> Logger getLogger(Class<T> clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}
