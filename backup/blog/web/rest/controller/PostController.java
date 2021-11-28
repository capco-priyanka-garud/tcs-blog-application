package com.tcs.blog.web.rest.controller;

import com.tcs.blog.model.Post;
import com.tcs.blog.service.PostService;
import com.tcs.blog.service.dto.PostRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	Logger logger = LoggerFactory.getLogger(PostController.class);

	@Autowired
	private PostService postService;

	@PostMapping
	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Post> createPostByAdmin(@Valid @RequestBody PostRequestDTO postReqBody) {
		logger.info("Request to create post by admin is received -  po{}:",postReqBody);
		Post newPost = postService.addPost(postReqBody);
		return new ResponseEntity<>(newPost, HttpStatus.CREATED);
	}
}
