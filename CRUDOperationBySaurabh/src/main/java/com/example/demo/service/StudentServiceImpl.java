package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;
	
	@Override
	public void saveData(Student s) {
		sr.save(s);	
	}

	@Override
	public Student loginChecks(String un, String ps) {
	    
		 return sr.findAllByUnameAndPassword(un, ps);
	}

	@Override
	public List<Student> DisplayAllData() {
		return (List<Student>) sr.findAll();
	}

	@Override
	public void deletedata(Student s) {
		sr.delete(s);
	}

	@Override
	public Student editdata(int uid) {
		return sr.findAllBySid(uid);
	}

}
