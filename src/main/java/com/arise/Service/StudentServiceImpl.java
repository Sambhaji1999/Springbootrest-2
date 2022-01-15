package com.arise.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.arise.Dao.StudentRepo;
import com.arise.Entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired(required=true)
    
    StudentRepo studentrepo;
    @Override
  public   List<Student> getstudent()
    {
    	return (List<Student>)studentrepo.findAll();
    }
    
  public   Student saveStudent(Student student)
    {
    	return studentrepo.save(student);
    }
  
 public  void deleteStudentById(int studentId)
  {
	  studentrepo.deleteById(studentId);
  }
 
public  Student updateStudent(Student std)
{
	Student s=new Student();
	Student exisStudent=studentrepo.findById(s.getId()).orElse(std);
	exisStudent.setName(s.getName());
	exisStudent.setId(s.getId());
	exisStudent.setAge(s.getAge());
	return studentrepo.save(exisStudent);
}
    
  

}
