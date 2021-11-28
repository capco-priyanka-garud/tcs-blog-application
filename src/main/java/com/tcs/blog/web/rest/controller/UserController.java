package com.tcs.blog.web.rest.controller;

import com.tcs.blog.service.PostService;
import com.tcs.blog.service.UserService;
import com.tcs.blog.service.dto.UserInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Rest controller to work with User entity in application.
 */
@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    /**
     * This method is used to get complete information of all users.
     * @return
     */
    @GetMapping("/users/details")
    public ResponseEntity<List<UserInformation>> getAllUsersCompleteInfo() {
        logger.info("START : Request to get all users information received");

        List<UserInformation> response = userService.getAllUsersCompleteInformation();

        logger.info("END : Request to get all users information received");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
