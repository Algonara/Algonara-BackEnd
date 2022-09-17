package com.spring.algonara.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_content_id")
    private Long id;

    @Column
    private String productImageUrl;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
