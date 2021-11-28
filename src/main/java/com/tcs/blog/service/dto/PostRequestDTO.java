package com.tcs.blog.service.dto;

import lombok.Data;

/**
 * DTO to hold data of post entity
 */
@Data
public class PostRequestDTO {

    Long userId;
    Long id;
    String title;
    String body;
    String postCreatedBy;
}
