package com.wxj.test.datasourcetest.entity;

import java.io.Serializable;

/*
 * Created by wxj on 2020/3/2 0002 13:49
 */
public class DataSourceEntity implements Serializable {
    private static final  long serialVersionUID = 1L;
    private String code;

    private  String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
