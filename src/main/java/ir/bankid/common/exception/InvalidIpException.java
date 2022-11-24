package ir.bankid.common.exception;

import ir.bankid.common.util.Messages;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = Messages.INVALID_IP)
public class InvalidIpException extends RuntimeException {
    public InvalidIpException(String message) {
        super(message);
    }
}
