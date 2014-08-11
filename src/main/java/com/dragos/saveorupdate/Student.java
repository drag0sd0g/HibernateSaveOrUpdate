package com.dragos.saveorupdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity(name="Student")
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue
    private BigDecimal id;

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
