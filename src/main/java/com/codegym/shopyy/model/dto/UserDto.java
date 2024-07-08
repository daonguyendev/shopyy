package com.codegym.shopyy.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String gender;
    private Date dob;
    private String image;

}
