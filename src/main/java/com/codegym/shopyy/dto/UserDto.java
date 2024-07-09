package com.codegym.shopyy.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
