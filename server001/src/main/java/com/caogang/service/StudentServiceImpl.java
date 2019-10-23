package com.caogang.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caogang.entity.Student;
import com.caogang.mapper.StudentMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/** 
* @author : xiaogang
* @version : 2019年10月23日 上午11:34:38 
* @email : 18242360858@163.com
*/
@Transactional
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public PageInfo<Student> selectAllStudent() {
		
		PageHelper.startPage(1, 10);
		
		List<Student> selectAllStudent = studentMapper.selectAllStudent();
		
		return new PageInfo<Student>(selectAllStudent);
	}

	@Override
	public BigDecimal selectSalaryById(Integer id) {
		return studentMapper.selectSalaryById(id);
	}

	@Override
	public Student selectOneById(Integer id) {
		return studentMapper.selectOneById(id);
	}

}
