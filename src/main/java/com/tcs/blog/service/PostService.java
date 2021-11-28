package com.tcs.blog.service;

import com.tcs.blog.model.Post;
import com.tcs.blog.service.dto.PostRequestDTO;

import java.util.List;

/**
 * POst service interface
 */
public interface PostService {

    Post addPost(PostRequestDTO post);

    List<Post> getAllPostsByCreatedBy(Long userId);
}
