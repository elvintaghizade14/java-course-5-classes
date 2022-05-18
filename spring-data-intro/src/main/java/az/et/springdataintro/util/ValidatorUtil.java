package az.et.springdataintro.util;

import az.et.springdataintro.exception.ParameterInvalidException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ValidatorUtil {

    public static void requireNullId(Long id) {
        if (id != null) {
            throw new ParameterInvalidException("id must be null!");
        }
    }

    public static void requireNotNullId(Long id) {
        if (id == null) {
            throw new ParameterInvalidException("id must not be null!");
        }
    }
}
