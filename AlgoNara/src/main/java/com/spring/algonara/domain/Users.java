package com.spring.algonara.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id")
    private Long id;

    @Column
    private String userEmail;

    @Column
    private String userId;

    @Column
    private String userName;

    @Column
    private String code;

    @Column
    private String password;

    @Column
    private boolean policy;

    @Column
    private String refreshToken;

    // == 생성 메서드 == //
    public static Users createUser(String userEmail, String userId, String userName, String code, String password, boolean policy){
        Users users = new Users();
        users.userDataSetting(userEmail, userId, userName, code, password, policy);
        return users;
    }

    // == 유저 setter 메서드 == //
    private void userDataSetting(String userEmail, String userId, String userName, String code, String password, boolean policy){
        this.userEmail = userEmail;
        this.userId = userId;
        this.userName = userName;
        this.code = code;
        this.password = password;
        this.policy = policy;
    }
}
