<<<<<<< HEAD:src/main/java/com/codegym/shopyy/model/Role.java
package com.codegym.shopyy.model;

=======
package com.codegym.shopyy.entities;
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96:src/main/java/com/codegym/shopyy/entities/Role.java

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
