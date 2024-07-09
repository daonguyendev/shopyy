package com.codegym.shopyy.service;

import com.codegym.shopyy.model.Color;
import java.util.Optional;

public interface IColorService {

    Iterable<Color> findAll();

    Color save(Color color);

    Optional<Color> findById(Long id);

    void remove(Long id);

}
