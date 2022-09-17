package com.spring.algonara.controller;

import com.spring.algonara.requestDto.UserSignUpRequestDto;
import com.spring.algonara.responseDto.ApiResponseMessage;
import com.spring.algonara.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * 회원가입 요청 api
     */
    @PostMapping("/api/users/signup")
    public ResponseEntity<ApiResponseMessage> userSignUp(@RequestBody UserSignUpRequestDto userSignUpRequestDto){
        userService.userSignUp(userSignUpRequestDto);

        ApiResponseMessage message = new ApiResponseMessage("Success", "회원 가입 완료", "", "");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
