package com.pesto.ecommerce.model;
import java.util.Date;
import java.util.List;
public class Order {
    private Long id;
    private Date orderDate;
    private List<Product> products;

    public Order() {
    }

    public Order(Long id, Date orderDate, List<Product> products) {
        this.id = id;
        this.orderDate = orderDate;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", products=" + products +
                '}';
    }
}
