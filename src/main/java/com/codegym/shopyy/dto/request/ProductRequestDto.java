package com.codegym.shopyy.dto.request;

import com.codegym.shopyy.model.Color;
import com.codegym.shopyy.model.Size;
import com.codegym.shopyy.model.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDto {

    private Long id;

    private String name;

    private Double price;

    private String description;

    private int quantity;

    private String avatar;

    private SubCategory subCategory;

    private List<Color> colors;

    private List<Size> sizes;

}
