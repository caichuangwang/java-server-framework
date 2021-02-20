package com.jsf.common.viewmodel;

import com.jsf.common.enums.JsfEnum;

/**
 * @ClassName JsfReturn
 * @Description 全局数据传输
 * @Author caicw
 * @Date 2021/2/20 18:53
 */
public class JsfReturn {
    /**
     * 操作码
     */
    private int code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;

    public JsfReturn() {
        setCode(JsfEnum.SUCCESS.getCode());
        setMsg(JsfEnum.SUCCESS.getMsg());
    }

    public static JsfReturn successData(Object data) {
        JsfReturn r = new JsfReturn();

        r.setData(data);

        return r;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
