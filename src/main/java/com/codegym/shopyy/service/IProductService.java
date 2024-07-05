package com.codegym.shopyy.service;

import com.codegym.shopyy.dto.request.ProductRequestDto;
import com.codegym.shopyy.dto.response.ResponsePage;
import com.codegym.shopyy.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;

import java.util.Optional;

public interface IProductService {

    Page<Product> findByName(Pageable pageable, String name);

    Iterable<Product> findAll(Pageable pageable);

    Optional<Product> findById(Long id);

    ResponsePage save(ProductRequestDto productRequestDto);

    void deleteById(Long id);
}
