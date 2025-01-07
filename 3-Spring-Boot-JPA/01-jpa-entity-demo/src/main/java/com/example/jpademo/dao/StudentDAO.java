package com.example.jpademo.dao;

import com.example.jpademo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student newStudent);

    Student findById(Integer id);

    List<Student> findAll();

    void update(Student editedStudent);

    void delete(Integer id);
}
