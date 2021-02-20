package com.jsf.server.controller;

import com.jsf.common.exception.JsfException;
import com.jsf.common.viewmodel.JsfReturn;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName JsfControllerAdvice
 * @Description 全局异常处理
 * @Author caicw
 * @Date 2021/2/20 19:49
 */
@RestControllerAdvice
public class JsfControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    public JsfReturn exceptionHandler(Exception e) {
        return null;
    }

    @ExceptionHandler(value = JsfException.class)
    public JsfReturn jsfExceptionHandler(JsfException e) {
        return null;
    }
}
