package com.tcs.blog.service.dto;

import lombok.Data;

@Data
public class PostRequestDTO {

        Long userId;
        Long id;
        String title;
        String body;
        String postCreatedBy;
}
