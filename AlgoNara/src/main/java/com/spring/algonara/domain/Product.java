package com.spring.algonara.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column
    private String productName;

    @Column
    private String productTitle;

    @Column
    private String productImageUrl;

    @Column
    private int productPrice;

    @Column
    private String productCategory;

    @Column
    private String productDesc;

    @Column
    private String delivery;

    @Column
    private int deliveryFee;

}
