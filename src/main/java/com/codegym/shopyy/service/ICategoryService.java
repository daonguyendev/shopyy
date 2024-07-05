package com.codegym.shopyy.service;

import com.codegym.shopyy.dto.request.CategoryRequestDto;
import com.codegym.shopyy.dto.response.ResponsePage;
import com.codegym.shopyy.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface ICategoryService {

    Page<Category> findByName(Pageable pageable, String name);

    Iterable<Category> findAll(Pageable pageable);

    Optional<Category> findById(Long id);

    ResponsePage save(CategoryRequestDto categoryRequestDto);

    void deleteById(Long id);
}
