package az.et.springrest1.dao;

import az.et.springrest1.model.StudentDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    private static final List<StudentDto> STUDENTS = new ArrayList<>();

    @PostConstruct
    private void init() {
         StudentDto studentDto = new StudentDto("a", "A", "a@gmail.com", 25);
        STUDENTS.add(studentDto);
        STUDENTS.add(StudentDto.builder().name("John").age(20).build());
        STUDENTS.add(StudentDto.builder().name("Jane").age(21).build());
        STUDENTS.add(StudentDto.builder().name("Jack").age(22).build());
        STUDENTS.add(StudentDto.builder().name("Jill").age(23).build());
    }

    public List<StudentDto> findAll() {
        return STUDENTS;
    }

    public Optional<StudentDto> findByName(String name) {
        return STUDENTS.stream()
                .filter(s -> s.getName().equals(name))
                .findFirst();
    }

    public StudentDto save(StudentDto studentDto) {
        STUDENTS.add(studentDto);
        return studentDto;
    }
}
