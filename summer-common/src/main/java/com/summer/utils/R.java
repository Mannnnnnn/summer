package com.summer.utils;

public class R {
    private Integer code = 0;
    private String msg = "success";
    private Object data;
    private Long count = 0L;

    public static R ok() {
        return new R();
    }

    public static R ok(Object data) {
        R r = new R();
        r.data = data;
        return r;
    }

    public static R ok(Object data, Long count) {
        R r = new R();
        r.data = data;
        r.count = count;
        return r;
    }

    public static R error(Integer code, String msg) {
        R r = new R();
        r.code = code;
        r.msg = msg;
        return r;
    }

    public static R error() {
        R r = new R();
        r.code = 999;
        r.msg = "fail";
        return r;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
