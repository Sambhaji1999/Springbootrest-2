package com.arise.Main;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arise.Entity.Student;
import com.arise.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	
	StudentService studentservice;
	
	@GetMapping("/getstudent")
	
	public List<Student> getStudent()
	{
	return studentservice.getstudent();
	}
	
	
	@PostMapping("/addstudent")
	 
    public Student saveStudent(@Validated @RequestBody Student department)
    {
        return studentservice.saveStudent(department);
    }
	
	
	@DeleteMapping("/deletebyid/{id}")
	 
    public String deleteStudentById(@PathVariable("id")int studentId)
    {
        studentservice.deleteStudentById(studentId);
        return "Deleted Successfully";
    }
	
	@PutMapping("/updates")
	public Student updateStudent(@RequestBody Student std)
	{
		return studentservice.updateStudent(std);
	}
	
	
	
	
	
	
	

}


