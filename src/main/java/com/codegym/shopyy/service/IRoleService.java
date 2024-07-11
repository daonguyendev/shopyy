package com.codegym.shopyy.service;

<<<<<<< HEAD
import com.codegym.shopyy.dto.request.RoleDto;
=======
import com.codegym.shopyy.dto.RoleDto;
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96

import java.util.Optional;

public interface IRoleService {
    Iterable<RoleDto> findAll();
    Optional<RoleDto> findById(Long id);
    void save(RoleDto roleDto);
    void remove(Long id);
}
