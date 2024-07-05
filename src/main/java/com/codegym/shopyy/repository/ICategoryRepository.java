package com.codegym.shopyy.repository;

import com.codegym.shopyy.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {

    Page<Category> findByName(Pageable pageable, String name);

    Optional<Category> findById(Long id);

    Category save(Category computer);

    void deleteById(Long id);


}
