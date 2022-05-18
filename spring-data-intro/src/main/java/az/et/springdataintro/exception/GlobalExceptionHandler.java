package az.et.springdataintro.exception;

import static az.et.springdataintro.model.constant.ErrorCode.PARAMETER_INVALID;
import static az.et.springdataintro.model.constant.ErrorCode.PERSON_ALREADY_EXISTS;
import static az.et.springdataintro.model.constant.ErrorCode.PERSON_NOT_FOUND;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity<GlobalErrorDto> handlePersonNotFoundException(PersonNotFoundException ex) {
        return ResponseEntity.status(PERSON_NOT_FOUND.getBaseCode())
                .body(GlobalErrorDto.of(PERSON_NOT_FOUND, ex.getMessage()));
    }

    @ExceptionHandler(ParameterInvalidException.class)
    public ResponseEntity<GlobalErrorDto> handleParameterInvalidException(ParameterInvalidException ex) {
        return ResponseEntity.status(PARAMETER_INVALID.getBaseCode())
                .body(GlobalErrorDto.of(PARAMETER_INVALID, ex.getMessage()));
    }

    @ExceptionHandler(PersonAlreadyExistsException.class)
    public ResponseEntity<GlobalErrorDto> handlePersonAlreadyExistsException(PersonAlreadyExistsException ex) {
        return ResponseEntity.status(PERSON_ALREADY_EXISTS.getBaseCode())
                .body(GlobalErrorDto.of(PERSON_ALREADY_EXISTS, ex.getMessage()));
    }


}
