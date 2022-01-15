package com.arise.Dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arise.Entity.Student;

@Repository


public interface StudentRepo extends CrudRepository<Student,Integer>{

	

	

	

}
