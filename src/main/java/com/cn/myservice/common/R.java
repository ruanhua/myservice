package com.cn.myservice.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author xxy
 * @date 2020-06-28 13:18
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class R<T> implements Serializable {
    private static final long serialVersionUID = 8676275589024982403L;
    /** 业务码 */
    private int code;
    /** 信息 */
    private String message;
    /** 返回数据 */
    private T data;

    public static <T> R<T> success() {
        return success(null);
    }

    public static <T> R<T> success(T data) {
        ApiCode ac = ApiCode.SUCCESS;
        return result(ac, data);
    }

    public static <T> R<T> success(int code, String msg) {
        return result(code, msg, null);
    }

    public static <T> R<T> error(String msg) {

        return result(ApiCode.ERROR.code(), msg, null);
    }

    public static <T> R<T> error(ApiCode apiCode, String msg) {
        return result(apiCode.code(), msg, null);
    }

    public static <T> R<T> error(int code, String msg) {
        return result(code, msg, null);
    }

    public static <T> R<T> error(ApiCode errorCode) {

        return result(errorCode, null);
    }

    public static <T> R<T> result(ApiCode errorCode, T data) {
        return result(errorCode.code(), errorCode.message(), data);
    }

    private static <T> R<T> result(int code, String msg, T data) {
        //添加线程时间戳获取并释放
        return new R<>(code, msg, data);
    }

}
