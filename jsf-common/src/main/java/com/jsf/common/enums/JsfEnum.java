package com.jsf.common.enums;

/**
 * @ClassName JsfEnum
 * @Description 全局枚举类
 * @Author caicw
 * @Date 2021/2/20 18:56
 */
public enum JsfEnum {
    /**
     * 成功
     */
    SUCCESS(200, "操作成功"),

    /**
     * 系统异常
     */
    SERVERERROR(500, "系统繁忙");

    private int code;

    private String msg;

    JsfEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
