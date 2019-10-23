package com.caogang.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caogang.entity.Student;
import com.caogang.service.StudentService;
import com.github.pagehelper.PageInfo;

/** 
* @author : xiaogang
* @version : 2019年10月22日 下午9:33:41 
* @email : 18242360858@163.com
*/
@RestController
@RequestMapping("/server")
public class MainController {
	
	@Autowired
	private StudentService studentService;
	
	@Value("${server.port}")
    private  String port;
	
	@RequestMapping("/port")
    public String port(){
		
        return "我的端口号是："+port;
    }
	
	@GetMapping("/listAll")
	public PageInfo<Student> listAll(){
		
		return studentService.selectAllStudent();
	}
	
	@GetMapping("/mathSalary")
	public BigDecimal mathSalary(@RequestParam Integer id){
		
		return studentService.selectSalaryById(id);
	}
	

}
