package com.uguryasar.edu.marketing.controller.dto;

public class StatusDto {

    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public StatusDto setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public StatusDto setMessage(String message) {
        this.message = message;
        return this;
    }
}
