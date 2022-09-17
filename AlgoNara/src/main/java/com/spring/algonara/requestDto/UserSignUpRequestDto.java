package com.spring.algonara.requestDto;

import lombok.Data;

@Data
public class UserSignUpRequestDto {
    private String userEmail;
    private String userId;
    private String userName;
    private String code;
    private String password;
    private String passwordCheck;
    private boolean policy;
}
