package com.caogang.entity;

import java.math.BigDecimal;
import lombok.Data;

/** 
* @author : xiaogang
* @version : 2019年10月22日 下午5:53:55 
* @email : 18242360858@163.com
*/
@Data
public class Student {

	private Integer id;
	private String name;
	private Integer age;
	private BigDecimal salary;
	private String sex;
	
}
