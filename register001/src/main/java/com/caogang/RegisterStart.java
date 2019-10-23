package com.caogang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 
* @author : xiaogang
* @version : 2019年10月22日 下午4:23:31 
* @email : 18242360858@163.com
*/
@SpringBootApplication
@EnableEurekaServer
public class RegisterStart {
	
	public static void main(String[] args) {
		
		SpringApplication.run(RegisterStart.class, args);
		
		System.out.println("注册中心启动。。。");
		
	}

}
