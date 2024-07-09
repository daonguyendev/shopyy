package com.codegym.shopyy.repository;

import com.codegym.shopyy.model.entity.Role;
import com.codegym.shopyy.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Query("select u " +
            "from User u " +
            "where u.fullName like :fullname")
    List<User> findByFullName(@Param("fullname") String fullname);

    @Query(nativeQuery = false,
            value = "SELECT u.roles FROM User u " +
                    "WHERE u.username = :username")
    List<Role> findRolesByUsername(@Param("username") String username);
}
