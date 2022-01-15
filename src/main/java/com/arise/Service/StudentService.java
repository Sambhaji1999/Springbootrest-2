package com.arise.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arise.Entity.Student;

public interface StudentService {
	

	List<Student> getstudent();
	
	Student saveStudent(Student student);
	
	void deleteStudentById(int studentId);
	
	
	Student updateStudent(Student std);
	
}
