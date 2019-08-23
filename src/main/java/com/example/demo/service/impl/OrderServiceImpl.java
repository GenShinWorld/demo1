package com.example.demo.service.impl;


import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderDao;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;



    @Override
    public List<Order> queryall(Integer pageNum,Integer pageSize) {
        return orderDao.queryall(pageNum,pageSize);
    }

    @Override
    public List<Order> selectPart(Integer pageNum,Integer pageSize) {
        return orderDao.selectPart(pageNum,pageSize);
    }

    @Override
    public List<Order> queryById(String userId, String carId,Integer pageNum,Integer pageSize) {
        return orderDao.queryById(userId,carId,pageNum,pageSize);
    }
}
