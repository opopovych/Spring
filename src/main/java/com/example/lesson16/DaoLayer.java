package com.example.lesson16;

import java.util.List;

public interface DaoLayer {

	Student create(Student student);

	Student read(Integer id);

	

	void delete(int id);

	List<Student> readAll();

	

	
}
