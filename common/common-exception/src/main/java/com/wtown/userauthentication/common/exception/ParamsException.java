/**
 * @author LYU
 * @create 2017年11月10日 9:40
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.common.exception;

import com.wtown.userauthentication.common.model.enums.MessageCode;

public class ParamsException extends AbstractBaseException {

    private MessageCode messageCode;
    private String additionalMessage;

    public ParamsException(MessageCode messageCode, String additionalMessage) {
        super();
        this.messageCode = messageCode;
        this.additionalMessage = additionalMessage;
    }


    @Override
    public String getErrorCode() {
        return messageCode.getCode();
    }

    @Override
    public String getErrorMessage() {
        if (additionalMessage != null && !"".equals(additionalMessage)) {
            return messageCode.getMessageDesc() + "(" + additionalMessage + ")";
        }
        return messageCode.getMessageDesc();
    }
}
