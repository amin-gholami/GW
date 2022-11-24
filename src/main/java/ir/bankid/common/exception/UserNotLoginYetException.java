package ir.bankid.common.exception;

import ir.bankid.common.util.Messages;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ACCEPTED, reason = Messages.USER_NOT_LOGIN_YET)
public class UserNotLoginYetException extends RuntimeException {
}
