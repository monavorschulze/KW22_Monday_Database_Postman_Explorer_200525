package de.neuefische.studentdvweb.controller;

import de.neuefische.studentdvweb.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
@RequestMapping("student")
public class StudentController {

    private final ArrayList<Student> students = new ArrayList<>();

    @GetMapping
    public ArrayList<Student> getStudent() {

        students.add(new Student("Momo", "16"));
        students.add(new Student("Michel", "7"));
        students.add(new Student("Lotta", "14"));
        return students;
    }

    @PutMapping
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping (path ="{id}")
    public Student getStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

}