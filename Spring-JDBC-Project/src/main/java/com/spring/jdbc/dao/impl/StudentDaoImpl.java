package com.spring.jdbc.dao.impl;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import com.spring.jdbc.mapper.RowMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addStudent(Student student) {
       String query="insert into student (id,name,city) values(?,?,?)" ;
    return this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
    }

    @Override
    public int updateStudent(Student student) {
        String query="update student set name=?, city=? where id=?";
       return this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
    }

    @Override
    public int deleteStudent(int studentId) {
        String query="delete from student where id=?";
       return this.jdbcTemplate.update(query,studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        String query="select * from student where id=?";
        RowMapper<Student> rowMapper= new RowMapperImpl();
       return this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
    }

    @Override
    public List<Student> getAllStudent() {
        String query="select * from student";
        RowMapper<Student> rowMapper= new RowMapperImpl();
         return this.jdbcTemplate.query(query,rowMapper);
    }


}
