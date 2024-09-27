package ru.intensive.spring.mvc_hibernate_aop.service;

import org.springframework.stereotype.Service;
import ru.intensive.spring.mvc_hibernate_aop.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
