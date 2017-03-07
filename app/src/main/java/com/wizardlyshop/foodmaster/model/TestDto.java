package com.wizardlyshop.foodmaster.model;

/**
 * Created by Administrator on 2017-03-07.
 */
public class TestDto {
    private String userName;
    private String message;

    public TestDto() { }

    public TestDto(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
