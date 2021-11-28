package com.tcs.blog.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InvalidInputException extends RuntimeException {

    private String errorCode;
    private String errorMessage;
}
