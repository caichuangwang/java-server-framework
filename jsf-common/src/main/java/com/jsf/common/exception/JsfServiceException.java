package com.jsf.common.exception;

/**
 * @ClassName JsfServiceException
 * @Description 服务层异常类
 * @Author caicw
 * @Date 2021/2/20 17:23
 */
public class JsfServiceException extends JsfException {
    public JsfServiceException() {
        super();
    }

    public JsfServiceException(String message) {
        super(message);
    }

    public JsfServiceException(Exception e) {
        super(e);
    }

    public JsfServiceException(String msg, Exception e) {
        super(msg, e);
    }

    public JsfServiceException(int code, String msg) {
        super(code, msg);
    }

    public JsfServiceException(int code, Exception e) {
        super(code, e);
    }
}
