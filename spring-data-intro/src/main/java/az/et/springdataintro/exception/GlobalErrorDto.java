package az.et.springdataintro.exception;

import az.et.springdataintro.model.constant.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalErrorDto {

    private ErrorCode code;
    private String message;

    public static GlobalErrorDto of(ErrorCode code, String message) {
        return new GlobalErrorDto(code, message);
    }

}
