package com.tcs.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoRecordsException extends RuntimeException {
    private String errorCode;
    private String errorMessage;

    public NoRecordsException() {

    }

    public NoRecordsException(String resource, String resourceId) {
        this.errorCode = resource;
        this.errorMessage = resourceId;
    }

}
