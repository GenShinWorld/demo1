package com.example.demo.entity;

import java.util.Date;

public class Comment {
    private String carId;
    private String userId;
    private String score;
    private Date create_time;
    private String text;

    @Override
    public String toString() {
        return "Comment{" +
                "carId='" + carId + '\'' +
                ", userId='" + userId + '\'' +
                ", score='" + score + '\'' +
                ", create_time=" + create_time +
                ", text='" + text + '\'' +
                '}';
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
