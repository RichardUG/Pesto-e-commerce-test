package com.pesto.ecommerce.persistence;

import com.pesto.ecommerce.model.Order;

import java.util.List;

public interface OrderPersistence {
    List<Order> getAllOrders();

    Order getOrderById(Long id);

    void placeOrder(Order order);

    void updateOrder(Order order);

    void cancelOrder(Long id);
}
