package az.et.springrest1.controller;

import az.et.springrest1.exception.StudentNotFoundException;
import az.et.springrest1.model.StudentDto;
import az.et.springrest1.service.StudentService;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;

    @GetMapping
    public List<StudentDto> getStudents() {
        log.info("getStudents() -> started");
        List<StudentDto> allStudents = studentService.getAllStudents();
        log.error("getStudents() -> finished");
        return allStudents;
    }

    @GetMapping("/{name}")
    public StudentDto getStudentByName(@NotBlank @PathVariable String name) {
        return studentService.findByName(name);
    }

    @GetMapping("/by-name")
    public StudentDto findByName(@RequestParam @NotBlank(message = "NDSKFBSALFKNSA;FLSA;FDMSAF") String name) {
        return studentService.findByName(name);
    }

    @PostMapping
    public StudentDto createStudent(@Valid @RequestBody StudentDto studentDto) {
        return studentService.createStudent(studentDto);
    }

//    @ExceptionHandler(StudentNotFoundException.class)
//    public ErrorModel handleStudentNotFoundException(StudentNotFoundException ex) {
//        return new ErrorModel(1000000, ex.getMessage());
//    }
//
//    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
//    private static class ErrorModel {
//        private int code;
//        private String message;
//    }

}
