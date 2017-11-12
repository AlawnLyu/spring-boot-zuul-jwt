/**
 * @author LYU
 * @create 2017年11月10日 8:59
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.common.base;

import com.wtown.userauthentication.common.converter.json.JsonDataUtil;
import com.wtown.userauthentication.common.converter.xml.XmlDataUtil;
import com.wtown.userauthentication.common.exception.ParamsException;
import com.wtown.userauthentication.common.logger.SelfLogFactory;
import com.wtown.userauthentication.common.model.dto.ResultDTO;
import com.wtown.userauthentication.common.model.enums.MessageCodeEnum;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

@RestControllerAdvice
public class BaseController {

    protected static Logger logger = SelfLogFactory.getLogger(BaseController.class);

    @Autowired
    private JsonDataUtil jsonDataUtil;

    @Autowired
    private XmlDataUtil xmlDataUtil;

    protected String returnErrorMessage(MessageCodeEnum codeEnum) throws IOException {
        return returnErrorMessage(codeEnum.getCode(),codeEnum.getMessageDesc());
    }

    protected String returnErrorMessage(String errorCode, String errorMessage) throws IOException {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(errorCode);
        resultDTO.setMessage(errorMessage);
        logger.debug("返回错误内容：{}", resultDTO.toString());
        return jsonDataUtil.writeObject(resultDTO);
    }

    protected String returnSuccessMessage(Object data) throws IOException {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(MessageCodeEnum.SUCCESS.getCode());
        resultDTO.setMessage(MessageCodeEnum.SUCCESS.getMessageDesc());
        resultDTO.setData(data);
        logger.debug("返回成功内容：{}", resultDTO.toString());
        return jsonDataUtil.writeObject(resultDTO);
    }

    @ExceptionHandler(ParamsException.class)
    public String handlerException(ParamsException exception) throws IOException {
        return returnErrorMessage(exception.getErrorCode(), exception.getErrorMessage());
    }

    protected <T> T getObjectByJson(String data, Class<T> clazz) throws IOException {
        return jsonDataUtil.readObject(data, clazz);
    }

    protected <T> T getObjectByXml(String data, Class<T> clazz) throws IOException {
        return xmlDataUtil.readObject(data, clazz);
    }

    protected String getXmlStr(Object data) throws IOException {
        return xmlDataUtil.writeObject(data);
    }

    protected String getJsonStr(Object data) throws IOException {
        return jsonDataUtil.writeObject(data);
    }
}
