package com.pesto.ecommerce.service;

import com.pesto.ecommerce.model.Order;
import com.pesto.ecommerce.persistence.OrderPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderPersistence orderPersistence;

    public List<Order> getAllOrders() {
        return orderPersistence.getAllOrders();
    }

    public Order getOrderById(Long id) {
        return orderPersistence.getOrderById(id);
    }

    public void placeOrder(Order order) {
        orderPersistence.placeOrder(order);
    }

    public void updateOrder(Order order) {
        orderPersistence.updateOrder(order);
    }

    public void cancelOrder(Long id) {
        orderPersistence.cancelOrder(id);
    }
}