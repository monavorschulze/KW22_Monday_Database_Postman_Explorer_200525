package de.neuefische.studentdvweb.controller;

import de.neuefische.studentdvweb.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
    @RequestMapping("student")
    public class StudentController {

        @GetMapping
        public Student getStudent(){
            return new Student("Frank", "34");
        }


    }


