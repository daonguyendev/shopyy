package com.codegym.shopyy.service.impl;

import com.codegym.shopyy.model.Comment;
import com.codegym.shopyy.repository.ICommentRepository;
import com.codegym.shopyy.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService implements ICommentService {

    @Autowired
    private ICommentRepository iCommentRepository;

    @Override
    public Comment addComment(Comment comment) {
        return iCommentRepository.save(comment);
    }

    @Override
    public List<Comment> getCommentsByProductDetail(Long productDetailId) {
        return iCommentRepository.findByProductDetailId(productDetailId);
    }

    @Override
    public Optional<Comment> findById(Long id) {

        return iCommentRepository.findById(id);
    }

    @Override
    public Iterable<Comment> findAll() {

        return iCommentRepository.findAll();
    }
}
