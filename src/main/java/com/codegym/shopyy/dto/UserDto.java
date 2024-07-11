<<<<<<<< HEAD:src/main/java/com/codegym/shopyy/dto/request/UserDto.java
package com.codegym.shopyy.dto.request;
========
package com.codegym.shopyy.dto;
>>>>>>>> 7924e1fc9aad65f352ed912209beac4f6ffd9d96:src/main/java/com/codegym/shopyy/dto/UserDto.java

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private String fullName;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String gender;

    private Date dob;

    private String image;

    private String role;
}
