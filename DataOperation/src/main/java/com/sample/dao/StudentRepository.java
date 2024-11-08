package com.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
