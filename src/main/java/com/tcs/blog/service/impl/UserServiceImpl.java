package com.tcs.blog.service.impl;

import com.tcs.blog.model.Post;
import com.tcs.blog.model.user.User;
import com.tcs.blog.repository.PostRepository;
import com.tcs.blog.repository.UserRepository;
import com.tcs.blog.service.UserService;
import com.tcs.blog.service.dto.UserDTO;
import com.tcs.blog.service.dto.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service implementation to User entity
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;



    /**
     * This methos is used to get user details from User table
     * @param username username of user
     * @return
     */
    @Override
    public UserDTO getUserProfile(String username) {
        User user = userRepository.findByUsername(username);
        return new UserDTO(user.getId(), user.getUsername(), user.getFirstName(), user.getLastName(),
                user.getEmail(), user.getAddress(), user.getPhone(), user.getWebsite(),
                user.getCompany(), 10L);
    }

    /**
     * This method returns details of all users including their post information
     * @return list of all users along with their personal information as well as post details
     */
    @Override
    public List<UserInformation> getAllUsersCompleteInformation() {
        List<UserInformation> userInformationList = new ArrayList<>();
        List<User> allUsersList = userRepository.findAll();
        for (User user : allUsersList) {
            UserInformation userInformation = new UserInformation();
            List<Post> posts = postRepository.findByUserId(user.getId());
            List<Post> userPostDetails = new ArrayList<>();
            userInformation.setUserPersonalInfo(user);
            userInformation.setUserAllPostInfo(posts);
            userInformationList.add(userInformation);
        }
        return userInformationList;
    }
}
