package com.sky.util;

import java.io.Serializable;

/**
 * @Author: Ningxb
 * @Date: 2021-01-09 00:53
 * @description: ${description}
 */
public class RespResult<T> implements Serializable {
    //响应数据结果集
    private T data;

    /**
     * 状态码
     * 20000 操作成功
     * 50000 操作失败
     * 50001 系统错误
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
