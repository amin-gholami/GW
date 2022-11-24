package ir.bankid.common.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.REQUEST_TIMEOUT;

@ResponseStatus(value = REQUEST_TIMEOUT)
public class TimeLimitExceededException extends RuntimeException {
    public TimeLimitExceededException(String message){
        super(message);
    }
}
