package com.codegym.shopyy.service;

import com.codegym.shopyy.model.Comment;
import com.codegym.shopyy.model.Rating;

import java.util.List;
import java.util.Optional;

public interface IRatingService {
    Optional<Rating> findById(Long id);
    Iterable<Rating> findAll();
    List<Rating> getRatingsByComment(Long commentId);
    Rating addRating(Rating rating);
}
