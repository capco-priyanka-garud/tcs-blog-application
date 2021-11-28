package com.tcs.blog.service.impl;


import com.tcs.blog.exceptions.NoRecordsException;
import com.tcs.blog.model.AuditLogs;
import com.tcs.blog.model.Post;
import com.tcs.blog.model.enumaration.AuditType;
import com.tcs.blog.model.user.User;
import com.tcs.blog.repository.AuditLogsRepository;
import com.tcs.blog.repository.PostRepository;
import com.tcs.blog.repository.UserRepository;
import com.tcs.blog.service.PostService;
import com.tcs.blog.service.dto.PostRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Post service implementation class
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AuditLogsRepository auditLogsRepository;

    @Autowired
    private UserRepository userRepository;
    /**
     * Method creates
     * @param postDto
     * @return post object with postId
     */
    @Override
    public Post addPost(PostRequestDTO postDto) {
        {
			User user = userRepository.findById(postDto.getUserId())
					.orElseThrow(() -> new NoRecordsException("1001", "No user found with this id"));

            Post post = new Post();//(Post) postMapper.toEntity(postDto);
            post.setBody(postDto.getBody());
            post.setTitle(postDto.getTitle());
            post.setUser(user);
            postRepository.save(post);
            AuditLogs auditLogs = new AuditLogs();
            auditLogs.setCreatedBy(user.getUsername());
            auditLogs.setOldActivity("NA");
            auditLogs.setNewActivity(post.toString());
            auditLogs.setFieldName("POST creation");
            auditLogs.setAuditType(AuditType.PostCreatedByAdmin);
            auditLogsRepository.save(auditLogs);
            return post;
        }
    }

    /*
     * Get user posts details by ID.
     */
    @Override
    public List<Post> getAllPostsByCreatedBy(Long userID) {
        List<Post> posts = postRepository.findByUserId(userID);
        return posts;
    }
}
