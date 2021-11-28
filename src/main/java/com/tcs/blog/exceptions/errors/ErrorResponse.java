package com.tcs.blog.exceptions.errors;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ErrorResponse {
    List<Error> errors;
}
