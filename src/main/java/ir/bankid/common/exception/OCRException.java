package ir.bankid.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static ir.bankid.common.util.Messages.OCR_CANT_DETECT_DATA;


@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = OCR_CANT_DETECT_DATA)
public class OCRException extends RuntimeException {
    public OCRException(String message) {
        super(message);
    }
}
