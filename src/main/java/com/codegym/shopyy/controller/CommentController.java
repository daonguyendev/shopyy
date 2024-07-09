package com.codegym.shopyy.controller;

import com.codegym.shopyy.model.Comment;
import com.codegym.shopyy.service.impl.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/{id}")
    public ResponseEntity<Comment> findById(@PathVariable Long id) {
        return new ResponseEntity<>(commentService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Iterable<Comment>> findAll() {
        return new ResponseEntity<>(commentService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        Comment savedComment = commentService.addComment(comment);
        return ResponseEntity.ok(savedComment);
    }

    @GetMapping("/product/{productDetailId}")
    public ResponseEntity<List<Comment>> getCommentsByProductDetail(@PathVariable Long productDetailId) {
        List<Comment> comments = commentService.getCommentsByProductDetail(productDetailId);
        return ResponseEntity.ok(comments);
    }
}
