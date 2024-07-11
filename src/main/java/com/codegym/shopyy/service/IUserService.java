package com.codegym.shopyy.service;

import com.codegym.shopyy.model.User;
import com.codegym.shopyy.model.dto.UpdatePasswordRequest;
import com.codegym.shopyy.model.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<UserDto> getUsers();
    UserDto getUserById(Long userId);
    Iterable<UserDto> findAll();
    Optional<UserDto> findById(Long id);
    void save(User user);
    void remove(Long id);
    boolean changePassword(UpdatePasswordRequest request);
}
