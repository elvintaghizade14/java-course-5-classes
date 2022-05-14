package az.et.springrest1.service;

import az.et.springrest1.dao.StudentRepository;
import az.et.springrest1.exception.StudentNotFoundException;
import az.et.springrest1.model.StudentDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll();
    }

    public StudentDto findByName(String name) {
        return studentRepository.findByName(name)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with name: " + name));
    }

    public StudentDto createStudent(StudentDto studentDto) {
        return studentRepository.save(studentDto);
    }

}
