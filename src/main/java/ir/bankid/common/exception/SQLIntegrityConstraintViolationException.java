package ir.bankid.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SQLIntegrityConstraintViolationException extends RuntimeException {
    public SQLIntegrityConstraintViolationException(String message) {
        super(message);
    }
}
