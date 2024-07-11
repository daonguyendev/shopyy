package com.codegym.shopyy.service;

import com.codegym.shopyy.entities.Rating;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IRatingService {
    Optional<Rating> findById(Long id);
    Iterable<Rating> findAll();
    List<Rating> getRatingsByComment(Long commentId);
    Rating addRating(Rating rating);
}
