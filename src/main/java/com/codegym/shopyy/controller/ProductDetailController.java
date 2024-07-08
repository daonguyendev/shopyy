package com.codegym.shopyy.controller;

import com.codegym.shopyy.model.ProductDetail;
import com.codegym.shopyy.service.IProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/productDetail")
public class ProductDetailController {
    @Autowired
    IProductDetailService productDetailService;

    @GetMapping
    public ResponseEntity<Iterable<ProductDetail>> findAll() {
        return new ResponseEntity<>(productDetailService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return new ResponseEntity(productDetailService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/order-by-price")
    public ResponseEntity<Iterable<ProductDetail>> findAllByOrderByPrice() {
        return new ResponseEntity<>(productDetailService.findAllByOrderByPrice(), HttpStatus.OK);
    }

    @GetMapping("/price-between")
    public ResponseEntity<Iterable<ProductDetail>> findAllByPriceBetween(@RequestParam int from, @RequestParam int to) {
        return new ResponseEntity<>(productDetailService.findAllByPriceBetween(from, to), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity add(@RequestBody ProductDetail productDetail) {
        productDetailService.save(productDetail);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody ProductDetail productDetail) {
        Optional<ProductDetail> oldProduct = productDetailService.findById(id);
        if (!oldProduct.isPresent()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        productDetail.setId(id);
        productDetailService.save(productDetail);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        Optional<ProductDetail> oldProduct = productDetailService.findById(id);
        if (!oldProduct.isPresent()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        productDetailService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
