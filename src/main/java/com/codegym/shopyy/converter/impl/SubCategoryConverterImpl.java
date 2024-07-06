package com.codegym.shopyy.converter.impl;

import com.codegym.shopyy.converter.ISubCategoryConverter;
import com.codegym.shopyy.dto.request.SubCategoryRequestDto;
import com.codegym.shopyy.model.SubCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubCategoryConverter implements ISubCategoryConverter {
    @Override
    public SubCategory dtoToEntity(SubCategoryRequestDto subCategoryRequestDto) {
        return null;
    }
}
