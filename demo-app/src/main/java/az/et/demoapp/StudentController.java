package az.et.demoapp;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    public static final List<Student> STUDENTS = Arrays.asList(
            new Student("Elvin", 23, "CS"),
            new Student("Zohrab", 30, "IT"),
            new Student("Veli", 50, "Fizika")
    );

    @RequestMapping
    public List<Student> findAllStudents() {
        return STUDENTS;
    }

    @RequestMapping("/{name}")
    public Student findAllStudents(@PathVariable String name) {
        return STUDENTS.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
    }

}
