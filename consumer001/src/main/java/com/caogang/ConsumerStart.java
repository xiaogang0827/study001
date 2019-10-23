package com.caogang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/** 
* @author : xiaogang
* @version : 2019年10月22日 下午4:23:31 
* @email : 18242360858@163.com
*/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerStart {
	
	public static void main(String[] args) {
		
		SpringApplication.run(ConsumerStart.class, args);
		
		System.out.println("消费中心启动。。。");
		
	}

}
