package com.codegym.shopyy.service;

import com.codegym.shopyy.model.ProductDetail;
import com.codegym.shopyy.repository.IProductDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Override
    public Iterable<ProductDetail> findAllByOrderByPrice() {
        return productDetailRepository.findAllByOrderByPrice();
    }

    @Override
    public Iterable<ProductDetail> findAllByPriceBetween(int from, int to) {
        return productDetailRepository.findAllByPriceBetween(from, to);
    }

}
