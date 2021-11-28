package com.tcs.blog.web.rest.controller;

import com.tcs.blog.exceptions.InvalidInputException;
import com.tcs.blog.exceptions.NoRecordsException;
import com.tcs.blog.exceptions.ServerException;
import com.tcs.blog.exceptions.errors.ErrorResponse;
import com.tcs.blog.commons.Constants;
import com.tcs.blog.commons.ErrorMessages;
import com.tcs.blog.exceptions.errors.Error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ControllerExceptionAdvisor {
    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity<ErrorResponse> handleInvalidInputs(InvalidInputException invalidInputException){

        Error error = new Error();
        error.setDescription(invalidInputException.getErrorMessage());
        error.setReasonCode(ErrorMessages.INVALID_INPUT);
        error.setSource(Constants.CORE_API);

        List<Error> errors = new ArrayList<>();
        errors.add(error);
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrors(errors);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(NoRecordsException.class)
    public ResponseEntity<ErrorResponse> handleNoRecordsError(NoRecordsException noRecordsException){

        Error error = new Error();
        error.setDescription(noRecordsException.getErrorMessage());
        error.setReasonCode(ErrorMessages.NOT_FOUND_DATA);
        error.setSource(Constants.CORE_API);

        List<Error> errors = new ArrayList<>();
        errors.add(error);
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrors(errors);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(ServerException.class)
    public ResponseEntity<ErrorResponse> handleInternalServerError(ServerException serverExceptions){

        Error error = new Error();
        error.setDescription(ErrorMessages.DESCRIPTION_INTERNAL_SERVER_ERROR);
        error.setReasonCode(ErrorMessages.INTERNAL_SERVER_ERROR);
        error.setSource(Constants.CORE_API);

        List<Error> errors = new ArrayList<>();
        errors.add(error);
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrors(errors);
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
