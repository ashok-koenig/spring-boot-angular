package com.example.jpademo;

import com.example.jpademo.dao.StudentDAO;
import com.example.jpademo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
//			getAStudent(studentDAO, 1);
//			updateStudent(studentDAO);
			deleteStudent(studentDAO, 2);
			getAllStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO, Integer id) {
		studentDAO.delete(id);
		System.out.println("Student deleted with id: "+ id);
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student editStudent = studentDAO.findById(2);
		editStudent.setEmail("johnsmith@email.com");
		studentDAO.update(editStudent);
		System.out.println("Updated Student: "+ editStudent);
	}

	private void getAllStudent(StudentDAO studentDAO) {
		List<Student> students= studentDAO.findAll();
		for(Student student: students){
			System.out.println(student);
		}
	}

	private void getAStudent(StudentDAO studentDAO, Integer id) {
		Student student = studentDAO.findById(id);
		System.out.println("Student Detail: "+ student);
	}

	private void createStudent(StudentDAO studentDAO){
		Student newStudent = new Student("John", "Smith", "smith@email.com");
		studentDAO.save(newStudent);
		System.out.println("Saved student with id: " + newStudent.getId());
	}

}
