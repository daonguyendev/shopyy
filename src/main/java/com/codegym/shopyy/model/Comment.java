package com.codegym.shopyy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String commenterName;

    @Column(nullable = false)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "productDetail_id", nullable = false)
    @JsonIgnoreProperties({"comments"})
    private ProductDetail productDetail;
}
