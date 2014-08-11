package com.dragos.saveorupdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    private final StudentDAO studentDAO;

    @Autowired
    public StudentService(@Qualifier("studentDAO") StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public List<Student> getStudents() {
        return studentDAO.getStudents();
    }

    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }


}
