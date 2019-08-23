package com.example.demo.service.impl;


import com.example.demo.entity.Car;
import com.example.demo.entity.CarImg;
import com.example.demo.mapper.CarDao;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao;

    @Override
    public List<Car> selectAll(String id) {
        return carDao.selectAll(id);
    }

    @Override
    public List<CarImg> CarImg() {
        return carDao.CarImg();
    }
}
