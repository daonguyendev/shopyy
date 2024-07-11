package com.codegym.shopyy.repository;

<<<<<<< HEAD:src/main/java/com/codegym/shopyy/repository/RoleRepository.java
import com.codegym.shopyy.model.Role;
=======
import com.codegym.shopyy.entities.Role;
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96:src/main/java/com/codegym/shopyy/repository/IRoleRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
