package com.codegym.shopyy.service;

import com.codegym.shopyy.entities.Comment;

import java.util.List;
import java.util.Optional;

public interface ICommentService {
    Iterable<Comment> findAll();
    Optional<Comment> findById(Long id);
    List<Comment> getCommentsByProductDetail(Long productId);
    Comment addComment(Comment comment);
}
