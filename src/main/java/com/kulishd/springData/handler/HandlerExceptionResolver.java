package com.kulishd.springData.handler;

import com.kulishd.springData.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class BusinesExceptionHandler implements CustomExceptionHandleable<BusinessException> {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<BusinessException> handle(BusinessException exception) {
        HttpStatus httpStatus = HttpStatus.valueOf(exception.getStatus().code());
        return new ResponseEntity<>(exception, httpStatus);
    }
}
