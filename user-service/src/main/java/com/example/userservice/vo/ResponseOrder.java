package com.example.userservice.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseOrder {
    private String productId;
    private Integer qty; //양
    private Integer unitPrice; //단가
    private Integer totalPrice; //총계
    private Date createdAt;

    private String orderId;

}
