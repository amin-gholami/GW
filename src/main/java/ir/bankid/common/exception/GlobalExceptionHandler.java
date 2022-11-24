package ir.bankid.common.exception;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import ir.bankid.common.util.Messages;
import ir.bankid.keycloak.model.res.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<Response<String>> unauthorizedExceptionHandle(Exception ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(401)
                .setMessage(ex.getMessage())
                .setError("Unauthorized"),
                HttpStatus.UNAUTHORIZED);

    }

    @ExceptionHandler(SQLException.class)
    public ResponseEntity<Response<String>> sqlExceptionHandle(Exception ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Response<String>> constraintViolationException(Exception ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(IOException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> ioExceptionHandler(IOException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }


    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> arithmeticExceptionHandler(ArithmeticException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(ClassCastException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> classCastExceptionHandler(ClassCastException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> nullPointerExceptionHandler(NullPointerException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> numberFormatExceptionHandler(NumberFormatException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(IllegalMonitorStateException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> illegalMonitorStateExceptionHandler(IllegalMonitorStateException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> arrayIndexOutOfBoundsExceptionHandler(ArrayIndexOutOfBoundsException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(IllegalStateException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> illegalStateExceptionHandler(IllegalStateException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> exceptionHandler(Exception ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Response<String>> badRequestHandler(BadRequestException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(400)
                .setMessage(ex.getMessage())
                .setError("Bad Request Error"),
                HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Response<String>> notFoundExceptionHandler(NotFoundException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(404)
                .setMessage(ex.getMessage())
                .setError("Not Found Error"),
                HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(ServiceUnavailableErrorException.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public ResponseEntity<Response<String>> ServiceUnavailableErrorException(ServiceUnavailableErrorException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(503)
                .setMessage(ex.getMessage())
                .setError("Service Is Unavailable Error"),
                HttpStatus.SERVICE_UNAVAILABLE);

    }

    @ExceptionHandler(InternalServerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> ServerExceptionHandler(InternalServerException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(500)
                .setMessage(Messages.INTERNAL_SERVER_ERROR)
                .setError("Internal Server Error"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(TooManyRequestException.class)
    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    public ResponseEntity<Response<String>> tooManyRequestExceptionHandler(TooManyRequestException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(429)
                .setMessage(ex.getMessage())
                .setError("Too Many Request Error"),
                HttpStatus.TOO_MANY_REQUESTS);

    }

    @ExceptionHandler(AlreadyApprovedException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Response<String>> alreadyApprovedExceptionHandler(AlreadyApprovedException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(429)
                .setMessage(ex.getMessage())
                .setError("Conflict"),
                HttpStatus.CONFLICT);

    }

    @ExceptionHandler(NotAcceptableException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResponseEntity<Response<String>> notAcceptableExceptionHandler(NotAcceptableException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(406)
                .setMessage(ex.getMessage())
                .setError("Not Acceptable Error"),
                HttpStatus.NOT_ACCEPTABLE);

    }


    @ExceptionHandler(NotAliveException.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public ResponseEntity<Response<String>> notAliveExceptionHandler(NotAliveException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(417)
                .setMessage(ex.getMessage())
                .setError("Expectation Failed Error"),
                HttpStatus.EXPECTATION_FAILED);

    }

    @ExceptionHandler(ForbiddenException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseEntity<Response<String>> forbiddenExceptionHandler(ForbiddenException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(403)
                .setMessage(ex.getMessage())
                .setError("Forbidden Error"),
                HttpStatus.FORBIDDEN);

    }

    @ExceptionHandler(ElasticsearchException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Response<String>> elasticsearchExceptionHandler(ElasticsearchException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .setMessage(ex.getMessage())
                .setError("elastic exception"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Response<String>> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        List<String> details = new ArrayList<>();
        for(ObjectError error : ex.getBindingResult().getAllErrors()) {
            details.add(error.getDefaultMessage());
        }
        return new ResponseEntity<>(new Response<String>()
                .setStatus(HttpStatus.BAD_REQUEST.value())
                .setMessage(details.get(details.size()-1))
                .setError("validation exception"),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<?> badFormatException(InvalidFormatException ex) {
        return new ResponseEntity<>(new Response<String>()
                .setStatus(HttpStatus.BAD_REQUEST.value())
                .setMessage(ex.getMessage())
                .setError("validation exception"),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ViewException.class)
    public ModelAndView viewException( ViewException ex) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message",ex.getMessage());
        mav.setViewName("failed-payment");
        mav.getModelMap();
        return mav;
    }

    @ExceptionHandler(WaitingFnViewException.class)
    public ModelAndView waitingFnViewException(WaitingFnViewException ex){
        ModelAndView mav = new ModelAndView();
        mav.addObject("message",ex.getMessage());
        mav.setViewName("waiting-payment");
        mav.getModelMap();
        return mav;
    }

    @ExceptionHandler(FailedFnViewException.class)
    public ModelAndView failedFnViewException(FailedFnViewException ex){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("failed-fn");
        mav.getModelMap();
        return mav;
    }

    @ExceptionHandler(TimeLimitExceededException.class)
    public ResponseEntity<Response<String>> timeLimitExceededException(TimeLimitExceededException exception){
        exception.printStackTrace();
        return new ResponseEntity<>(new Response<String>()
                .setStatus(HttpStatus.REQUEST_TIMEOUT.value())
                .setMessage(exception.getMessage())
                .setError("timeout exception"),
                HttpStatus.REQUEST_TIMEOUT);
    }
}
