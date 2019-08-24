package com.example.demo.service;

import com.example.demo.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> queryByTime();
    List<Order> queryall(Integer pageNum,Integer pageSize);
    List<Order> selectPart(Integer pageNum,Integer pageSize);
    List<Order> queryById( String userId, String carId,Integer pageNum,Integer pageSize);
}
