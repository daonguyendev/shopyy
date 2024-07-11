package com.codegym.shopyy.repository;

import com.codegym.shopyy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Query(nativeQuery = false,
            value = "select u " +
                    "from User u " +
                    "where u.fullName like :fullname")
    List<User> findByFullName(@Param("fullname") String fullname);

//    @Query(nativeQuery = false,
//            value = "SELECT r.name FROM Role r " +
//                    "INNER JOIN User u ON r.id = u.role.id " +
//                    "WHERE u.username = :username")
    List<String> findRolesByUsername(@Param("username") String username);
}
