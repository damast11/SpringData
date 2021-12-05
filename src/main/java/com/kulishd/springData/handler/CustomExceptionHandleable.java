package com.kulishd.springData.handler;

import org.springframework.http.ResponseEntity;

public interface CustomExceptionHandleable<T extends Exception> {

    ResponseEntity<T> handle(T exception);
}
