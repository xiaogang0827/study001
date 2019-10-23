package com.caogang.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.caogang.entity.Student;

/** 
* @author : xiaogang
* @version : 2019年10月23日 上午11:38:10 
* @email : 18242360858@163.com
*/
@Mapper
public interface StudentMapper {
	
	List<Student> selectAllStudent();
	
	BigDecimal selectSalaryById(@Param("id")Integer id);

}
