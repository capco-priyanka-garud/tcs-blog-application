package com.tcs.blog.service.mappers;

import com.tcs.blog.model.Post;
import com.tcs.blog.service.dto.PostRequestDTO;
import lombok.NoArgsConstructor;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Post} and its DTO {@link PostRequestDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PostMapper extends com.tcs.blog.service.mappers.EntityMapper<PostRequestDTO, Post> {

    Post toEntity(PostRequestDTO businessUnitDTO);

    default Post fromId(Long id) {
        if (id == null) {
            return null;
        }
        Post post = new Post();
        post.setId(id);
        return post;
    }
}
