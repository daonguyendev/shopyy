package com.codegym.shopyy.dto.request;

<<<<<<< HEAD
import com.codegym.shopyy.model.Color;
import com.codegym.shopyy.model.Size;

=======
import com.codegym.shopyy.entities.Color;
import com.codegym.shopyy.entities.Size;
import com.codegym.shopyy.entities.SubCategory;
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96
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
