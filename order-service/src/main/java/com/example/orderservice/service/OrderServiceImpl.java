package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.jpa.OrderEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public OrderDto creatOrder(OrderDto orderDetails) {
        return null;
    }

    @Override
    public OrderDto getOrderByUserId(String userId) {
        return null;
    }

    @Override
    public Iterable<OrderEntity> getOrdersByUserId(String userId) {
        return null;
    }
}
