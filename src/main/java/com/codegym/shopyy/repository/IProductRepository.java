package com.codegym.shopyy.repository;


import com.codegym.shopyy.model.Product;
import com.codegym.shopyy.model.SubCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {

    Page<Product> findByName(String name, Pageable pageable);

    Page<Product> findAllBySubCategory(SubCategory subCategory, Pageable pageable);

    Page<Product> findAllByOrderByPriceAsc(Pageable pageable);

    Page<Product> findAllByOrderByPriceDesc(Pageable pageable);

    Page<Product> findAllByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice, Pageable pageable);

    Optional<Product> findById(Long id);

    Product save(Product product);

    void deleteById(Long id);

}
