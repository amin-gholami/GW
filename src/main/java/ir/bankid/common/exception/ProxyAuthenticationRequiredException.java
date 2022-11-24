package ir.bankid.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PROXY_AUTHENTICATION_REQUIRED)
public class ProxyAuthenticationRequiredException extends RuntimeException {
    public ProxyAuthenticationRequiredException(String message) {
        super(message);
    }
}
