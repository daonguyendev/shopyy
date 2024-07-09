package com.codegym.shopyy.service.impl;

import com.codegym.shopyy.model.ProductDetail;
import com.codegym.shopyy.repository.IProductDetailRepository;
import com.codegym.shopyy.service.IProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductDetailService implements IProductDetailService {

    @Autowired
    IProductDetailRepository productDetailRepository;

    @Override
    public void save(ProductDetail productDetail) {
        productDetailRepository.save(productDetail);
    }

    @Override
    public Iterable<ProductDetail> findAll() {
        return productDetailRepository.findAll();
    }

    @Override
    public Optional<ProductDetail> findById(Long id) {
        return productDetailRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        productDetailRepository.deleteById(id);
    }

}
