package com.spring.algonara.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long id;

    @Column
    private String courseTitle;

    @Column
    private String courseGrade;

    @Column
    private int courseTime;

    @Column
    private String courseIntro;

    @Column
    private String courseThumbNail;

    @Column
    private String courseTeacher;

    @Column
    private String courseIntroImageUrl;

    @Column
    private String courseCategory;

    @Column
    private String courseVideoUrl;

    @Column
    private int coursePrice;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;
}
