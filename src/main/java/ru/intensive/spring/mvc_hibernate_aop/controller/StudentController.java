package ru.intensive.spring.mvc_hibernate_aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.intensive.spring.mvc_hibernate_aop.entity.Student;
import ru.intensive.spring.mvc_hibernate_aop.service.StudentService;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("")
    public String showAllStudents(Model model){

        List<Student> allStudents = studentService.getAllStudents();
        model.addAttribute("allStudents", allStudents);

        return "all-students";
    }

    @RequestMapping("/addNewStudent")
    public String addNewStudent(Model model){

        Student student = new Student();
        model.addAttribute("student", student);

        return "student-info";
    }

    @RequestMapping("/updateInfo")
    public String updateStudent(@RequestParam("studentId") int id, Model model){

        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);

        return "student-info";
    }

    @RequestMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student){

        studentService.saveStudent(student);

        return "redirect:/";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studentId") int id){
        studentService.deleteStudent(id);
        return "redirect:/";
    }
}
