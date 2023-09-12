package com.qa.ims.persistence.domain;

public class Order {

    private Long id;
    private int orderDate;
    private int orderPrice;

    public Order(Long id, int orderDate, int orderPrice) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

}
