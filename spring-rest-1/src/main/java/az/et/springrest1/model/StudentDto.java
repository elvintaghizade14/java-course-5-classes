package az.et.springrest1.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @Email
    private String email;

    @Min(18)
    @Max(100)
    private int age;
}
