package be.thomasmore.froomi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import be.thomasmore.froomi.model.Student;
import be.thomasmore.froomi.repositories.StudentRepository;

import java.util.Optional;

@Controller
public class StudentController {
    //test

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/studentlist")
    public String studentList(Model model){
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "studentlist";
    }

    @GetMapping({"/studentdetails", "/studentdetails/{id}"})
    public String studentDetails(Model model, @PathVariable(required = false) Integer id){
        Optional<Student> optionalStudents = studentRepository.findById(id);

        if(optionalStudents.isPresent()){
            model.addAttribute("student", optionalStudents.get());
        }
        return "studentdetails";
    }
}
