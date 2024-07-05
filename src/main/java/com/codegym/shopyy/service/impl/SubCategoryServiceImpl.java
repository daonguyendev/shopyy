package com.codegym.shopyy.service.impl;

import com.codegym.shopyy.model.SubCategory;
import com.codegym.shopyy.repository.ISubCategoryRepository;
import com.codegym.shopyy.service.ISubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class SubCategoryServiceImpl implements ISubCategoryService {

    @Autowired
    private ISubCategoryRepository subCategoryRepository;

    @Override
    public Page<SubCategory> findByName(Pageable pageable, String name) {
        return subCategoryRepository.findByName(pageable, name);
    }

    @Override
    public Optional<SubCategory> findById(Long id) {
        return subCategoryRepository.findById(id);
    }

    @Override
    public SubCategory save(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }

    @Override
    public void deleteById(Long id) {
        subCategoryRepository.deleteById(id);
    }
}
