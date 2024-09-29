package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

import java.util.List;

public interface StudentDao {

    int addStudent(Student student);
    int updateStudent(Student student);
    Student getStudent(int studentId);
    List<Student> getAllStudent();
    int deleteStudent(int studentId);


}
