package com.example.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(1,"Darshan",29),
                new Student(2,"Adarsh",25),
                new Student(3,"Anurag",32));
    }
}
