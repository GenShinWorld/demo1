package com.example.demo.mapper;

import com.example.demo.entity.Car;
import com.example.demo.entity.CarImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarDao {
    List<Car> selectAll(@Param("carId") String id);
    List<CarImg> CarImg();
}
