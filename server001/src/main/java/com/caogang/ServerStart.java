package com.caogang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** 
* @author : xiaogang
* @version : 2019年10月22日 下午4:23:31 
* @email : 18242360858@163.com
*/
@SpringBootApplication
@EnableEurekaClient
public class ServerStart {
	
	public static void main(String[] args) {
		
		SpringApplication.run(ServerStart.class, args);
		
		System.out.println("服务中心启动。。。");
		
	}

}
