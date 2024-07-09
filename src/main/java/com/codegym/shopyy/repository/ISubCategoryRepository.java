package com.codegym.shopyy.repository;

import com.codegym.shopyy.model.Category;
import com.codegym.shopyy.model.SubCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ISubCategoryRepository extends PagingAndSortingRepository<SubCategory, Long> {

    Page<SubCategory> findByName(Pageable pageable, String name);

    Page<SubCategory> findAllByCategory(Category category, Pageable pageable);

    Optional<SubCategory> findById(Long id);

    SubCategory save(SubCategory subCategory);

    void deleteById(Long id);

}
