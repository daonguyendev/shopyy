<<<<<<< HEAD:src/main/java/com/codegym/shopyy/model/User.java
package com.codegym.shopyy.model;
=======
package com.codegym.shopyy.entities;
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96:src/main/java/com/codegym/shopyy/entities/User.java


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToMany;
<<<<<<< HEAD:src/main/java/com/codegym/shopyy/model/User.java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
=======
import jakarta.persistence.JoinTable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96:src/main/java/com/codegym/shopyy/entities/User.java
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"cart", "role"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String gender;

    private Date dob;

    private String image;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @JsonIgnore
    @JsonIgnoreProperties("user")
    private Cart cart;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @OnDelete(action = OnDeleteAction.CASCADE)
<<<<<<< HEAD:src/main/java/com/codegym/shopyy/model/User.java

    private Set<Role> roles = new HashSet<Role>();
=======
    private Set<Role> roles = new HashSet<>();
>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96:src/main/java/com/codegym/shopyy/entities/User.java
}
