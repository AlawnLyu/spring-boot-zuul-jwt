/**
 * @author LYU
 * @create 2017-11-11-12:36
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.apigate.service;

import com.wtown.userauthentication.common.model.dto.ResultDTO;

public interface ApiGateService {
    String getSecret();

    String getOAuthServiceLocation();

    String getOAuthAccessTokenUri();

    Boolean shouldFilter(String token,String uri);

    ResultDTO checkPermission(String token, String uri);
}
