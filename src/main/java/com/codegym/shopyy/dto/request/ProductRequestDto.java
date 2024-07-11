package com.codegym.shopyy.dto.request;

import com.codegym.shopyy.model.Color;
import com.codegym.shopyy.model.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDto {

    private Long id;

    private String name;

    private BigDecimal price;

    private String description;

    private Integer quantity;

    private String img;

    private Long subCategory;

    private List<Color> colors;

    private List<Size> sizes;

}
