/**
 * @author LYU
 * @create 2017-11-10-15:45
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.apigate.feign;

import com.wtown.userauthentication.common.model.dto.ResultDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "userauth", url = "http://localhost:9000")
public interface UserAuthRemoteService {

    @RequestMapping(value = "/oauth/checkpermissions", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    ResultDTO checkPermission(@RequestParam("role") String role, @RequestParam("uri") String uri);

    @RequestMapping(value = "/oauth/shouldfilter", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    ResultDTO shouldFilter(@RequestParam("role") String role, @RequestParam("uri") String uri);
}
