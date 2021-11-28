package com.tcs.blog.service.dto;

import com.tcs.blog.model.Post;
import com.tcs.blog.model.user.User;
import lombok.Data;

import java.util.List;

@Data
public class UserInformation {
    User userPersonalInfo;
    List<Post> userAllPostInfo;
}
