package com.codegym.shopyy.converter.impl;

import com.codegym.shopyy.converter.ISubCategoryConverter;
import com.codegym.shopyy.dto.request.SubCategoryRequestDto;
<<<<<<< HEAD
import com.codegym.shopyy.model.Category;
import com.codegym.shopyy.model.SubCategory;
import com.codegym.shopyy.repository.ICategoryRepository;
=======
import com.codegym.shopyy.entities.SubCategory;
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SubCategoryConverterImpl implements ISubCategoryConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubCategoryConverterImpl.class);

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public SubCategory dtoToEntity(SubCategoryRequestDto subCategoryRequestDto) {
        LOGGER.debug("SubCategoryConverterImpl -> dtoToEntity");
        SubCategory subCategory = new SubCategory();
        BeanUtils.copyProperties(subCategoryRequestDto, subCategory);

        Optional<Category> categoryOptional = categoryRepository.findById(subCategoryRequestDto.getCategory());
        if (categoryOptional.isPresent()) {
            subCategory.setCategory(categoryOptional.get());
        } else {
            throw new IllegalArgumentException("Category with ID " + subCategoryRequestDto.getCategory() + " not found.");
        }

        return subCategory;
    }
}
