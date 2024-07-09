package com.codegym.shopyy.controller;


import com.codegym.shopyy.model.Rating;
import com.codegym.shopyy.service.impl.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;


    @GetMapping("/{id}")
    public ResponseEntity<Rating> findById(@PathVariable Long id) {
        return new ResponseEntity<>(ratingService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Iterable<Rating>> findAll() {
        return new ResponseEntity<>(ratingService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating) {
        Rating savedRating = ratingService.addRating(rating);
        return ResponseEntity.ok(savedRating);
    }

    @GetMapping("/rating/{commentId}")
    public ResponseEntity<List<Rating>> getRatingsByComment(@PathVariable Long commentId) {
        List<Rating> ratings = ratingService.getRatingsByComment(commentId);
        return ResponseEntity.ok(ratings);
    }

}
