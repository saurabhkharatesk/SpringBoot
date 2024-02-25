package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
  @Autowired
  StudentService ss;
  

	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/reg")
	public String preRegister()
	{
		return "register";
	}
	
	@RequestMapping("/register")
	public String regData(@ModelAttribute Student s)
	{
		ss.saveData(s);
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginCheck(@RequestParam("uname") String un,@RequestParam("password") String ps,Model m )
	{
		
		Student s=ss.loginChecks(un,ps);
		if(s!=null) {
		
		List<Student> list=ss.DisplayAllData();
		
		m.addAttribute("data", list);
		return "success";
		}else {
			m.addAttribute("Data", "Wrong Username or Password");
			return "login";
		}
	}
	
	@RequestMapping("/delete")
	public String deletedata(@ModelAttribute Student s,Model m) {
	
			ss.deletedata(s);
			List<Student> list=ss.DisplayAllData();
			m.addAttribute("data", list);
			return "success";
			
		}
		
	
		
	@RequestMapping("/edit")
	public String editdata(@RequestParam("sid")int uid,Model m) {
	   Student s= ss.editdata(uid);
		m.addAttribute("data", s);													
		return "edit";
	}
		
		
	
	
	@RequestMapping("/updatestu")
	public String updatedata(@ModelAttribute Student s,Model m) { 
		ss.saveData(s);
		List<Student> list=ss.DisplayAllData();
		m.addAttribute("data", list);
		return "success";
	}
	
}
/*
@PutMapping("/updateemp/{id}")
public Employee updateEmployee(@RequestBody Employee newEmp,
		@PathVariable Integer id) {
	System.out.println("UpdateEmp called....");
	return er.findById(id).map(employee -> {
		employee.setEmpname(newEmp.getEmpname());
		employee.setEmpsalary(newEmp.getEmpsalary());
	return er.save(employee);
}).orElseGet(() -> {
		return er.save(newEmp);
	});*/
