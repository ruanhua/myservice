package com.cn.myservice.common;

/**
 * @author xxy
 * @date 2020-06-28 13:00
 */
public enum ApiCode {

    // 请求成功
    SUCCESS(200, "请求成功"),
    // 权限不足
    AUTH_ERROR(411, "用户未拥有该任务权限"),
    // 系统异常
    ERROR(500, "系统异常"),
    // 参数错误
    PARAM_ERROR(600, "参数错误"),

    ;
    private final int code;
    private final String message;

    ApiCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}
