package org.example.orderservice.service;

import org.example.orderservice.dto.OrderDto;
import org.example.orderservice.jpa.OrderEntity;

public interface OrderService {
	OrderDto createOrder(OrderDto orderDetails);
	OrderDto getOrderByOrderId(String orderId);
	Iterable<OrderEntity> getOrdersByUserId(String userId);
}