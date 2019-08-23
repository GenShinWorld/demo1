package com.example.demo.service;

import com.example.demo.entity.Car;
import com.example.demo.entity.CarImg;

import java.util.List;

public interface CarService {
    List<Car> selectAll(String id);
    List<CarImg> CarImg();
}
