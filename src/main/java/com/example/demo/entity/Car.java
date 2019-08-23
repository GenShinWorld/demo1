package com.example.demo.entity;

public class Car {
    private String carId;
    private String categoryId;
    private String carCard;
    private String carOwner;
    private String carWhere;
    private String carColor;
    private String carScore;
    private String carLevel;
    private String carStatus;
    private String carNum;
    private String carImg;
    private String carPrice;
    private String carDeposit;
    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", carCard='" + carCard + '\'' +
                ", carOwner='" + carOwner + '\'' +
                ", carWhere='" + carWhere + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carScore='" + carScore + '\'' +
                ", carLevel='" + carLevel + '\'' +
                ", carStatus='" + carStatus + '\'' +
                ", carNum='" + carNum + '\'' +
                ", carImg='" + carImg + '\'' +
                ", carPrice='" + carPrice + '\'' +
                ", carDeposite='" + carDeposit + '\'' +
                '}';
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }


    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarDeposite() {
        return carDeposit;
    }

    public void setCarDeposite(String carDeposite) {
        this.carDeposit = carDeposite;
    }

    public String getCarWhere() {
        return carWhere;
    }

    public void setCarWhere(String carWhere) {
        this.carWhere = carWhere;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarCard() {
        return carCard;
    }

    public void setCarCard(String carCard) {
        this.carCard = carCard;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarScore() {
        return carScore;
    }

    public void setCarScore(String carScore) {
        this.carScore = carScore;
    }

    public String getCarLevel() {
        return carLevel;
    }

    public void setCarLevel(String carLevel) {
        this.carLevel = carLevel;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg;
    }
}
