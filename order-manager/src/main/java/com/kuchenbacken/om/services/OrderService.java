package com.kuchenbacken.om.services;

import com.kuchenbacken.om.enums.OrderStatus;
import com.kuchenbacken.om.models.Order;

public interface OrderService {
    void submit(Order order);

    void get(Order order);

    OrderStatus getStatus(Order order);

    void updateStatus(Order order, OrderStatus newStatus);
}
