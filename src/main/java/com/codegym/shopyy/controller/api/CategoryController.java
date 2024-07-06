package com.codegym.shopyy.controller.api;

import com.codegym.shopyy.dto.request.CategoryRequestDto;
import com.codegym.shopyy.dto.response.ResponsePage;
import com.codegym.shopyy.model.Category;
import com.codegym.shopyy.model.SubCategory;
import com.codegym.shopyy.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping
    public ResponseEntity<Page<Category>> homeProduct(@RequestParam(defaultValue = "", required = false) String search,
                                                      @PageableDefault(page = 0, size = 3) Pageable pageable) {

        Page<Category> categoryPage;
        if (!search.isEmpty()) {
            categoryPage = categoryService.findByName(pageable, search);
        } else {
            categoryPage = (Page<Category>) categoryService.findAll(pageable);
        }

        if (categoryPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(categoryPage, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ResponsePage> save(@RequestBody CategoryRequestDto categoryRequestDto) {
        ResponsePage responsePage = categoryService.save(categoryRequestDto);
        return new ResponseEntity<>(responsePage, responsePage.getStatus());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponsePage> updateCategory(@RequestBody CategoryRequestDto categoryRequestDto) {
        Optional<Category> categoryOptional = categoryService.findById(categoryRequestDto.getId());

        if (categoryOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Category category = categoryOptional.get();
        category.setName(categoryRequestDto.getName());

        ResponsePage responsePage = categoryService.save(categoryRequestDto);
        return new ResponseEntity<>(responsePage, responsePage.getStatus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> findByIdCategory(@PathVariable Long id) {
        Optional<Category> categoryOptional = categoryService.findById(id);
        return new ResponseEntity<>(categoryOptional, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        Optional<Category> categoryOptional = categoryService.findById(id);
        if (categoryOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        categoryService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    @PostMapping("/search")
    public ResponseEntity<Map<Category, Iterable<SubCategory>>> searchCategory(@PageableDefault(page = 0) Pageable pageable,
                                                                               @RequestParam("search") Optional<String> search) {
        Map<Category, Iterable<SubCategory>> result = new HashMap<>();
        Page<Category> categoryPage;
        if (search.isPresent()) {
            categoryPage = categoryService.findByName(pageable, search.get());
            if (!categoryPage.hasContent()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } else {
            categoryPage = (Page<Category>) categoryService.findAll(pageable);
        }

        for (Category category : categoryPage) {
            Iterable<SubCategory> subCategories = categoryService.findSubCategoriesByCategory(category);
            result.put(category, subCategories);
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
