package com.codegym.shopyy.service;

import com.codegym.shopyy.model.SubCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;


public interface ISubCategoryService {

    Page<SubCategory> findByName(Pageable pageable, String name);

    Optional<SubCategory> findById(Long id);

    SubCategory save(SubCategory subCategory);

    void deleteById(Long id);
}
