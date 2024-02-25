package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Student;

public interface StudentService {
	public void saveData(Student s);
	public List<Student> DisplayAllData();
	public void deletedata(Student s);
	public Student editdata(int uid);
	public Student loginChecks(String un, String ps);
}
