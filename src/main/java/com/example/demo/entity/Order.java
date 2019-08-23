package com.example.demo.entity;

import java.util.Date;

public class Order {
    private String orderId;
    private String carId;
    private String userId;
    private String create_time;
    private String end_time;
    private String return_time;
    private String get_time;

    public String getGet_time() {
        return get_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", carId='" + carId + '\'' +
                ", userId='" + userId + '\'' +
                ", create_time='" + create_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", return_time='" + return_time + '\'' +
                ", get_time='" + get_time + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", get_time=" + get_time +
                '}';
    }

    public void setGet_time(String get_time) {
        this.get_time = get_time;
    }

    private String totalPrice;

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getReturn_time() {
        return return_time;
    }

    public void setReturn_time(String return_time) {
        this.return_time = return_time;
    }
}
