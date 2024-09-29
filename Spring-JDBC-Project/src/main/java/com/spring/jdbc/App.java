package com.spring.jdbc;

import com.spring.jdbc.config.AppConfig;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       StudentDao stDao= context.getBean("studentDao", StudentDao.class);
        //Student student=new Student();
        //student.setId(5);
       // student.setName("Deelipss Kumar");
       // student.setCity("Varanasiss");
       // int insertStudent =stDao.addStudent(student);
       // int updateStudent =stDao.updateStudent(student);
       // int deleteStudent= stDao.deleteStudent(5);
       //Student st=stDao.getStudent(2);
        List<Student> listOfstudent=stDao.getAllStudent();
       //System.out.println("Row Inserted : "+ insertStudent);
       // System.out.println("Updated Student : "+ updateStudent);
       // System.out.println("Deleted Student : "+ deleteStudent);
      // System.out.println("Get Student : "+ st);
      //  System.out.println("Get All Student : "+ listOfstudent);



    }
}
