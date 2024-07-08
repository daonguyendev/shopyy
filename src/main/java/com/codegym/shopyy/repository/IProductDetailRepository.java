package com.codegym.shopyy.repository;

import com.codegym.shopyy.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDetailRepository extends JpaRepository<ProductDetail, Long> {
    Iterable<ProductDetail> findAllByOrderByPrice();

    Iterable<ProductDetail> findAllByPriceBetween(int from, int to);

}
