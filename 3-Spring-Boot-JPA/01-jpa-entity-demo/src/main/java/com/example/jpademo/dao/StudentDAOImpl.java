package com.example.jpademo.dao;

import com.example.jpademo.entity.Student;
import jakarta.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student newStudent) {
        entityManager.persist(newStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student", Student.class).getResultList();
    }

    @Override
    @Transactional
    public void update(Student editedStudent) {
        entityManager.merge(editedStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student tempStudent = entityManager.find(Student.class, id);
        entityManager.remove(tempStudent);
    }
}
