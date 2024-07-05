package com.codegym.shopyy.converter;

import com.codegym.shopyy.dto.request.CategoryRequestDto;
import com.codegym.shopyy.model.Category;

public interface ICategoryConverter {

    Category dtoEntity(CategoryRequestDto categoryRequestDto);
}
