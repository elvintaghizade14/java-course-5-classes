package az.et.springdataintro.model.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    PERSON_NOT_FOUND(404, 4041),
    PARAMETER_INVALID(400, 4001),
    PERSON_ALREADY_EXISTS(400, 4002);

    private final int baseCode;
    private final int childCode;
    
}
