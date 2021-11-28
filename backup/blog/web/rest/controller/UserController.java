package com.tcs.blog.web.rest.controller;


import com.tcs.blog.model.Post;
import com.tcs.blog.service.PostService;
import com.tcs.blog.service.UserService;
import com.tcs.blog.service.dto.UserInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private PostService postService;

	@GetMapping("/allData")
	public ResponseEntity<List<UserInformation>> getAllUsersCompleteInfo() {

		Logger logger = LoggerFactory.getLogger(PostController.class);

		List<UserInformation> response = userService.getAllUsersCompleteInformation();

		return new ResponseEntity<  >(response, HttpStatus.OK);
	}


}
