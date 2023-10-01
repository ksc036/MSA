package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto creatOrder(OrderDto orderDetails);
    OrderDto getOrderByUserId(String userId);

    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
