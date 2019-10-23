package com.caogang.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caogang.config.HystrixClientFallback;
import com.caogang.entity.Student;

/** 
* @author : xiaogang
* @version : 2019年10月22日 下午9:52:48 
* @email : 18242360858@163.com
*/
@FeignClient(name = "eureka-server" , fallback = HystrixClientFallback.class)
public interface FeignInterface {
	
	@RequestMapping("/server/port")
	public String getport();
	
	@GetMapping("/server/testHystrix/{id}")
	public Student testHystrix(@PathVariable("id") Integer id);

}
