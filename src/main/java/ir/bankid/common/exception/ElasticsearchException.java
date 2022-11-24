package ir.bankid.common.exception;


import ir.bankid.common.util.Messages;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = Messages.ELASTICSEARCH_EXCEPTION)
public class ElasticsearchException extends RuntimeException {
}
