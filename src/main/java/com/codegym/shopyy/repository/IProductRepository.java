package com.codegym.shopyy.repository;


import com.codegym.shopyy.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {

    Page<Product> findByName(Pageable pageable, String name);
    
    Optional<Product> findById(Long id);

    Product save(Product product);

    void deleteById(Long id);

}
