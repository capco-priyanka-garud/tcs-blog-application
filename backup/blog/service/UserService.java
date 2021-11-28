package com.tcs.blog.service;


import com.tcs.blog.service.dto.UserDTO;
import com.tcs.blog.service.dto.UserInformation;

import java.util.List;

public interface UserService {


	UserDTO getUserProfile(String username);

	List<UserInformation> getAllUsersCompleteInformation();

}