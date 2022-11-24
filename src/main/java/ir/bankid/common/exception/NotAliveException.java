package ir.bankid.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class NotAliveException extends RuntimeException {
    public NotAliveException(String message) {
        super(message);
    }
}
