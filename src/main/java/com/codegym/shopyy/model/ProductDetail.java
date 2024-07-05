package com.codegym.shopyy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String mainImage;

    @ElementCollection
    @CollectionTable(name = "related_images", joinColumns = @JoinColumn(name = "product_detail_id"))
    @Column(name = "image_url")
    private List<String> relatedImages;

//    @ManyToMany
//    @JoinTable(
//            name = "product_detail_color",
//            joinColumns = @JoinColumn(name = "product_detail_id"),
//            inverseJoinColumns = @JoinColumn(name = "color_id")
//    )
//    @JsonIgnoreProperties({"products"})
//    private List<Color> colors;

//    @ManyToMany
//    @JoinTable(
//            name = "product_detail_size",
//            joinColumns = @JoinColumn(name = "product_detail_id"),
//            inverseJoinColumns = @JoinColumn(name = "size_id")
//    )
//    @JsonIgnoreProperties({"products"})
//    private List<Size> sizes;

    @Column(nullable = false)
    private String returnPolicy;

    @Column(nullable = false)
    private String shippingDetails;

    @Column(nullable = false)
    private int purchaseQuantity;

    @Column(nullable = false)
    private int stock;
}
