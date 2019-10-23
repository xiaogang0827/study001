package com.caogang.service;

import java.math.BigDecimal;

import com.caogang.entity.Student;
import com.github.pagehelper.PageInfo;

/** 
* @author : xiaogang
* @version : 2019年10月23日 上午11:33:46 
* @email : 18242360858@163.com
*/
public interface StudentService {

	PageInfo<Student> selectAllStudent();

	BigDecimal selectSalaryById(Integer id);

	Student selectOneById(Integer id);

}
