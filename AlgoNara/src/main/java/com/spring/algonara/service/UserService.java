package com.spring.algonara.service;

import com.spring.algonara.domain.Users;
import com.spring.algonara.repository.UserRepository;
import com.spring.algonara.requestDto.UserSignUpRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    /**
     * 회원가입 요청 api
     */
    @Transactional
    public void userSignUp(UserSignUpRequestDto userSignUpRequestDto) {

        String userPassword = passwordEncoder.encode(userSignUpRequestDto.getPassword());

        Users user = Users.createUser(
                userSignUpRequestDto.getUserEmail(),
                userSignUpRequestDto.getUserId(),
                userSignUpRequestDto.getUserName(),
                userSignUpRequestDto.getCode(),
                userPassword,
                userSignUpRequestDto.isPolicy());

        userRepository.save(user);
    }
}
