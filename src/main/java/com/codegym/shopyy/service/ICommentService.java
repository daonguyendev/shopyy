package com.codegym.shopyy.service;

import com.codegym.shopyy.model.Comment;

import java.util.List;
import java.util.Optional;

public interface ICommentService {
    Iterable<Comment> findAll();
    Optional<Comment> findById(Long id);
    List<Comment> getCommentsByProductDetail(Long productDetailId);
    Comment addComment(Comment comment);
}
