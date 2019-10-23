package com.caogang.config;

import org.springframework.stereotype.Component;

import com.caogang.client.FeignInterface;
import com.caogang.entity.Student;

/** 
* @author : xiaogang
* @version : 2019年10月23日 下午6:38:35 
* @email : 18242360858@163.com
*/
@Component
public class HystrixClientFallback implements FeignInterface{

	@Override
	public String getport() {
		return "0000";
	}

	@Override
	public Student testHystrix(Integer id) {
		
		Student student = new Student();
		
		student.setName("小娜");
		
		student.setId(1);
		
		return student;
	}

}
