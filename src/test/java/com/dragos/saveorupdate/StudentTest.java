package com.dragos.saveorupdate;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring-context.xml")
public class StudentTest {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @Test
    public void testSaveOrUpdate(){
        Student student1 = new Student("marty");
        Student student2 = new Student("abe");
        studentService.saveStudent(student1);
        studentService.saveStudent(student2);

        for(Student student : studentService.getStudents()){
            System.out.println(student.getId()+" "+student.getName());
        }

    }

}
