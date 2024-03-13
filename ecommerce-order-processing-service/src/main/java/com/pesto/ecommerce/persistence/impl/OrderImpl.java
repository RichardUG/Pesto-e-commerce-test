package com.pesto.ecommerce.persistence.impl;

import com.pesto.ecommerce.model.Order;
import com.pesto.ecommerce.persistence.OrderPersistence;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderImpl implements OrderPersistence {

    private Map<Long, Order> orders = new HashMap<>();
    private long idCounter = 0;

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order getOrderById(Long id) {
        return orders.get(id);
    }

    @Override
    public void placeOrder(Order order) {
        order.setId(++idCounter);
        orders.put(order.getId(), order);
    }

    @Override
    public void updateOrder(Order order) {
        orders.put(order.getId(), order);
    }

    @Override
    public void cancelOrder(Long id) {
        orders.remove(id);
    }
}
