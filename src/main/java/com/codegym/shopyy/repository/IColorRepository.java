package com.codegym.shopyy.repository;

import com.codegym.shopyy.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IColorRepository extends JpaRepository<Color, Long> {
}
