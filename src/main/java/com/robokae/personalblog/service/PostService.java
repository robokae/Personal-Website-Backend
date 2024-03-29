package com.robokae.personalblog.service;

import com.robokae.common.model.Post;
import com.robokae.personalblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long postId) {
        return postRepository.getById(postId);
    }

    public Post getPostByTitle(String title) {
        return postRepository.findByTitle(title);
    }

    public void createPost(Post post) {
        postRepository.save(post);
    }

    public void updatePost() {
    }

    public void deletePost(Long postId) {
        postRepository.deleteById(postId);
    }
}
