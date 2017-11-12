/**
 * @author LYU
 * @create 2017年11月10日 9:39
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.common.exception;

public abstract class AbstractBaseException extends Exception {
    public AbstractBaseException() {
        super();
    }

    public abstract String getErrorCode();

    public abstract String getErrorMessage();
}
