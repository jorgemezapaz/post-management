package com.likeashark.post.management.service;

import com.likeashark.post.management.dto.PostDTO;

import java.util.List;

public interface PostManagementService {

    List<PostDTO> list();

    Boolean add(PostDTO post);

    Boolean edit(String id,PostDTO post);

    Boolean delete(String id);


}
