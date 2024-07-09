package com.codegym.shopyy.service.impl;

import com.codegym.shopyy.model.Rating;
import com.codegym.shopyy.repository.IRatingRepository;
import com.codegym.shopyy.service.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService implements IRatingService {

    @Autowired
    private IRatingRepository ratingRepository;

    @Override
    public Optional<Rating> findById(Long id) {
        return ratingRepository.findById(id);
    }

    @Override
    public Iterable<Rating> findAll() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingsByComment(Long commentId) {
        return ratingRepository.findByCommentId(commentId);
    }

    @Override
    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }
}
