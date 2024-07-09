package com.codegym.shopyy.repository;

import com.codegym.shopyy.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISizeRepository extends JpaRepository<Size, Long> {
}
