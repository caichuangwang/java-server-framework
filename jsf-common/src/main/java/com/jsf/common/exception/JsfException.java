package com.jsf.common.exception;

/**
 * @ClassName JsfException
 * @Description
 * @Author caicw
 * @Date 2021/2/20 17:23
 */
public class JsfException extends RuntimeException {
    /**
     * 异常代码
     */
    private int code;

    public JsfException() {
        super();
    }

    public JsfException(String message) {
        super(message);
    }

    public JsfException(Exception e) {
        super(e);
    }

    public JsfException(String msg, Exception e) {
        super(msg, e);
    }

    public JsfException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public JsfException(int code, Exception e) {
        super(e);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
