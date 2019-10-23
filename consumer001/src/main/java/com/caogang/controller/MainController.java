package com.caogang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caogang.client.FeignInterface;

/** 
* @author : xiaogang
* @version : 2019年10月22日 下午9:33:41 
* @email : 18242360858@163.com
*/
@RestController
public class MainController {
	
	@Autowired
	private FeignInterface feignInterface;
	
	@RequestMapping("/getport")
    public String port(){
		
        return feignInterface.getport();
    }

}
