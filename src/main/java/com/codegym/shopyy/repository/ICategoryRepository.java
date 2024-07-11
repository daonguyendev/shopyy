package com.codegym.shopyy.repository;

<<<<<<< HEAD
import com.codegym.shopyy.model.Category;
=======
import com.codegym.shopyy.entities.Category;
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {

    Page<Category> findByName(String name, Pageable pageable);

    Optional<Category> findById(Long id);

    Category save(Category computer);

    void deleteById(Long id);

    @Modifying
    @Query("DELETE FROM SubCategory sc WHERE sc.category.id = :categoryId")
    void deleteSubCategoriesByCategoryId(@Param("categoryId") Long categoryId);

}
