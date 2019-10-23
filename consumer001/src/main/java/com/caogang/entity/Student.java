package com.caogang.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/** 
* @author : xiaogang
* @version : 2019年10月23日 下午6:36:23 
* @email : 18242360858@163.com
*/
@Data
public class Student {

	private Integer id;
	private String name;
	private Integer age;
	private BigDecimal salary;
	private Date birthday;
	private String addr;
	private String sex;

}
