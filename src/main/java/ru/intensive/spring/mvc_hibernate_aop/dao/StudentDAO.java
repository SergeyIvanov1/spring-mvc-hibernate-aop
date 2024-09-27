package ru.intensive.spring.mvc_hibernate_aop.dao;

import org.springframework.stereotype.Repository;
import ru.intensive.spring.mvc_hibernate_aop.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
