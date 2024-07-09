package com.codegym.shopyy.controller;

import com.codegym.shopyy.model.ProductDetail;
import com.codegym.shopyy.service.IProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/productDetail")
public class ProductDetailController {
    @Autowired
    IProductDetailService productDetailService;

    @GetMapping
    public ResponseEntity<Iterable<ProductDetail>> findAll() {
        return new ResponseEntity<>(productDetailService.findAll(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity add(@RequestBody ProductDetail productDetail) {
        productDetailService.save(productDetail);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDetail> findById(@PathVariable Long id) {
        return new ResponseEntity<>(productDetailService.findById(id).get(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDetail> edit(@RequestBody ProductDetail productDetail, @PathVariable Long id) {
        productDetail.setId(id);
        productDetailService.save(productDetail);
        return new ResponseEntity<>(productDetailService.findById(id).get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        productDetailService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
