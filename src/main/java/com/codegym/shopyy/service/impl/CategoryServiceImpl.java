package com.codegym.shopyy.service.impl;

import com.codegym.shopyy.converter.ICategoryConverter;
import com.codegym.shopyy.dto.request.CategoryRequestDto;
import com.codegym.shopyy.dto.response.ResponsePage;
import com.codegym.shopyy.model.Category;
import com.codegym.shopyy.repository.ICategoryRepository;
import com.codegym.shopyy.service.ICategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements ICategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private ICategoryConverter categoryConverter;

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public Page<Category> findByName(Pageable pageable, String name) {
        return categoryRepository.findByName(pageable, name);
    }

    @Override
    public Iterable<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public ResponsePage save(CategoryRequestDto categoryRequestDto) {
        LOGGER.info("CategoryServiceImpl -> save invoked!!! ");
        Category category = categoryConverter.dtoEntity(categoryRequestDto);
        try {
            categoryRepository.save(category);
            return ResponsePage.builder()
                    .data(null)
                    .message("category created successfully")
                    .status(HttpStatus.OK)
                    .build();
        } catch (Exception e) {
            return ResponsePage.builder()
                    .data(null)
                    .message(e.getMessage())
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }
    }


    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}
