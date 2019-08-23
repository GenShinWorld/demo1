package com.example.demo.vo;

import com.example.demo.entity.Order;

import java.util.List;

public class OrderVo {
    private List<Order> orderList;
    private Long total;

    @Override
    public String toString() {
        return "OrderVo{" +
                "orderList=" + orderList +
                ", total='" + total + '\'' +
                '}';
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
