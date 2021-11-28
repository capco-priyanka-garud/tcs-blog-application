package com.tcs.blog.service.impl;


import com.tcs.blog.model.AuditLogs;
import com.tcs.blog.model.Post;
import com.tcs.blog.model.user.User;
import com.tcs.blog.repository.AuditLogsRepository;
import com.tcs.blog.repository.PostRepository;
import com.tcs.blog.service.PostService;
import com.tcs.blog.service.dto.PostRequestDTO;
import com.tcs.blog.service.mappers.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private AuditLogsRepository auditLogsRepository;

	//private final PostMapper postMapper;


	@Override
	public Post addPost(PostRequestDTO postDto) {
		{
			/*User user = userRepository.findById(currentUser.getId())
					.orElseThrow(() -> new ResourceNotFoundException(USER, ID, 1L));
*/
			Post post = new Post();//(Post) postMapper.toEntity(postDto);
			post.setBody(postDto.getBody());
			postRepository.save(post);
			AuditLogs auditLogs = new AuditLogs();
			auditLogs.setCreatedBy(postDto.getPostCreatedBy());
			auditLogsRepository.save(auditLogs);
			return post;
		}
	}

	@Override
	public List<Post> getAllPostsByCreatedBy(Long userID) {
		List<Post> posts = postRepository.findByUserId(userID);
		return posts;
	}
}
