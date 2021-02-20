package com.jsf.common.exception;

/**
 * @ClassName JsfDaoException
 * @Description
 * @Author caicw
 * @Date 2021/2/20 17:23
 */
public class JsfDaoException extends JsfException {
    public JsfDaoException() {
        super();
    }

    public JsfDaoException(String message) {
        super(message);
    }

    public JsfDaoException(Exception e) {
        super(e);
    }

    public JsfDaoException(String msg, Exception e) {
        super(msg, e);
    }

    public JsfDaoException(int code, String msg) {
        super(code, msg);
    }

    public JsfDaoException(int code, Exception e) {
        super(code, e);
    }
}
