package com.tcs.blog.web.rest.controller;

import com.tcs.blog.model.Post;
import com.tcs.blog.service.PostService;
import com.tcs.blog.service.dto.PostRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Rest controller to work with POST entity in application
 */
@RestController
@RequestMapping("/api/posts")
public class PostController {

    Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    /**
     * Method is used to create post on behalf of user by admin
     * @param postReqBody post details
     * @return
     */
    @PostMapping
    //@PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Post> createPostByAdmin(@Valid @RequestBody PostRequestDTO postReqBody) {
        logger.info("START : Request to create post by admin is received -  po{}:", postReqBody);

        Post newPost = postService.addPost(postReqBody);

        logger.info("END : Request to create post by admin is received ");
        return new ResponseEntity<>(newPost, HttpStatus.CREATED);
    }
}
