package com.pocket.exception;

/**
 * @auther Akie
 * @date 2019/10/21 17:02
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("帖子不见啦，看看其他吧");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
