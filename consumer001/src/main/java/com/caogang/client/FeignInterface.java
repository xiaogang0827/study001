package com.caogang.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @author : xiaogang
* @version : 2019年10月22日 下午9:52:48 
* @email : 18242360858@163.com
*/
@FeignClient("eureka-server")
public interface FeignInterface {
	
	@RequestMapping("/server/port")
	public String getport();

}
