package com.codegym.shopyy.service;

import com.codegym.shopyy.model.ProductDetail;

public interface IProductDetailService extends IService<ProductDetail>{
    Iterable<ProductDetail> findAllByOrderByPrice();
    Iterable<ProductDetail> findAllByPriceBetween(int from, int to);
}

