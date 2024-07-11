package com.codegym.shopyy.service;

import com.codegym.shopyy.entities.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICommentService {
    Iterable<Comment> findAll();
    Optional<Comment> findById(Long id);
    List<Comment> getCommentsByProductDetail(Long productId);
    Comment addComment(Comment comment);
}
