package com.dragos.saveorupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDAO")
public class StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<Student> getStudents() {
        return getCurrentSession().createQuery("from Student").list();
    }

    public void saveStudent(Student student) {
        getCurrentSession().save(student);
    }

}
