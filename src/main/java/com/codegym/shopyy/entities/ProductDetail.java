package com.codegym.shopyy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    @JsonIgnoreProperties({"productDetails"})
    private Product product;

    @ManyToOne
    @JoinColumn(name = "color_id", nullable = false)
    @JsonIgnoreProperties({"productDetails"})
    private Color color;

    @ManyToOne
    @JoinColumn(name = "size_id", nullable = false)
    @JsonIgnoreProperties({"productDetails"})
    private Size size;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String mainImage;

    @ManyToOne
    @JoinColumn(name = "sub_category_id", nullable = false)
    @JsonIgnoreProperties({"products", "category"})
    private SubCategory subCategory;

    @Column(nullable = false)
    private String returnPolicy;

    @Column(nullable = false)
    private String shippingDetails;

    @Column(nullable = false)
    private int purchaseQuantity;

    @Column(nullable = false)
    private int stock;
}
