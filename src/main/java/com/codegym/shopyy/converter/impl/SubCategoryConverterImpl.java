package com.codegym.shopyy.converter.impl;

import com.codegym.shopyy.converter.ISubCategoryConverter;
import com.codegym.shopyy.dto.request.SubCategoryRequestDto;
import com.codegym.shopyy.model.SubCategory;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubCategoryConverterImpl implements ISubCategoryConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubCategoryConverterImpl.class);

    @Override
    public SubCategory dtoToEntity(SubCategoryRequestDto subCategoryRequestDto) {
        LOGGER.debug("SubCategoryConverterImpl -> dtoToEntity");
        SubCategory subCategory = new SubCategory();
        BeanUtils.copyProperties(subCategoryRequestDto, subCategory);
        return subCategory;
    }
}
