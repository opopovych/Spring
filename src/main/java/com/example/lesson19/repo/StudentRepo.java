package com.example.lesson19.repo;

import org.springframework.stereotype.Repository;

import com.example.lesson19.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
