package com.example.lesson16;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class DaoLayerImpl implements DaoLayer {
List<Student> list = new ArrayList<>();
	@Override
	public Student create(Student student) {
		list.add(student);
		return student;
	}

	@Override
	public Student read(Integer id) {
		
		return list.get(id);
	}

	@Override
	public void delete(int id) {
		list.remove(id);
	}

	@Override
	public List<Student> readAll() {
		// TODO Auto-generated method stub
		return list;
	}
	



	

	



	


}
