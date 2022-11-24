package ir.bankid.common.exception;

import ir.bankid.common.util.Messages;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = Messages.INVALID_TOKEN)
public class TokenNotProvidedException extends RuntimeException {
}
