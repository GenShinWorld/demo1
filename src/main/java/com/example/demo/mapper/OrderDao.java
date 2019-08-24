package com.example.demo.mapper;

import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    List<Order> queryByTime();
    List<Order> queryall(Integer pageNum,Integer pageSize);
    List<Order> selectPart(Integer pageNum,Integer pageSize);
    List<Order> queryById(@Param("userId") String userId,@Param("carId") String carId,Integer pageNum,Integer pageSize);
}
