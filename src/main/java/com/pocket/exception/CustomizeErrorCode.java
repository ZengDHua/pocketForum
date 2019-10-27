package com.pocket.exception;

/**
 * @auther Akie
 * @date 2019/10/21 17:02
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(1001,"帖子不见啦，看看其他吧"),
    TARGET_PARAM_NOT_FOUND(1002,"未选中任何帖子或评论进行回复"),
    NO_LOGIN(1003,"当前操作需要登录，请登录后重试"),
    SYS_ERROR(1004,"服务器GG啦，稍后再来吧"),
    TYPE_PARAM_WRONG(1005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(1005,"回复的评论不存在"),
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }


    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
