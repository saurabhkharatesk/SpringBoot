package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	public Student findAllByUnameAndPassword(String un,String ps);
	public Student findAllBySid(int id);
	
	
}
