package com.pocket.enums;

/**
 * @auther Akie
 * @date 2019/10/29 17:03
 */
public enum NotificationStatusEnum {
    UNREAD(0),
    READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }}
