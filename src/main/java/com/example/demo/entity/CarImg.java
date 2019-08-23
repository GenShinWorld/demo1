package com.example.demo.entity;

public class CarImg {
    private String carId;
    private String img;

    public String getCarId() {
        return carId;
    }

    @Override
    public String toString() {
        return "CarImg{" +
                "carId='" + carId + '\'' +
                ", img='" + img + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String status;
}
