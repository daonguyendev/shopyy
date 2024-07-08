package com.codegym.shopyy.repository;

import com.codegym.shopyy.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProductDetailRepository extends JpaRepository<ProductDetail, Long> {
    Iterable<ProductDetail> findAllByOrderByPrice();

    Iterable<ProductDetail> findAllByPriceBetween(int from, int to);

//    @Query(value = "select * from productDetail order by id desc  limit 4", nativeQuery = true)
//    Iterable<ProductDetail> findTop4New();

}
