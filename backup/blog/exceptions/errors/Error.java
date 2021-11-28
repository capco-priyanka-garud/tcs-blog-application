package com.tcs.blog.exceptions.errors;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Error {

     public String source;
     public String reasonCode;
     public String description;

}
