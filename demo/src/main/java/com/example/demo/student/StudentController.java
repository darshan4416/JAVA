package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="apis/")
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void addStudents(@RequestBody Student student){
         studentService.addStudents(student);
    }

    @DeleteMapping("{id}")
    public String deleteStudent(@PathVariable Integer id){

        studentService.deleteStudent(id);

        return "successfully deleted";
    }




}
