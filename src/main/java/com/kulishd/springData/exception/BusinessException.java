package com.kulishd.springData.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 2685096428814082545L;

    private final String field;
    private final String fieldValue;
    private final String reason;
    private final Status status;

    public enum Status {

        BAD_REQUEST("Bad Request", 400),
        NOT_FOUND("Not found", 404),
        NOT_ACCEPTABLE("Not Acceptable", 406),
        NOT_IMPLEMENTED("Not Implemented", 501),
        INTERNAL_ERROR("Internal Error", 500);

        private final String value;
        private final int code;

        Status(String value, int code) {
            this.value = value;
            this.code = code;
        }

        public int code() {
            return this.code;
        }

        public String value() {
            return this.value;
        }

        @Override
        public String toString() {
            return code + " " + name();
        }

    }
}
