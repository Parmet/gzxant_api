package com.gzxant.gzxant_api.common.request;

import java.io.Serializable;

/**
 * 接口返回数据模型
 *
 * @author hfb
 * @date 2017/9/18
 */
public class R implements Serializable {
    private static final long serialVersionUID = -6248298306422072592L;
    /**
     * 表示接口调用成功
     */
    public static final int SUCCESS = 0;
    /**
     * 表示接口调用失败
     */
    public static final int FAIL = 1;
    /**
     * 表示没有权限调用该接口
     */
    public static final int NO_PERMISSION = 2;

    public static final String NO_LOGIN_MSG = "请登录！";
    public static final String NO_PERMISSION_MSG = "没有权限！";
    public static final String SUCC_MSG = "操作成功！";
    public static final String FAIL_MSG = "操作失败！";

    private String message = SUCC_MSG;
    private int state = SUCCESS;
    /**
     * 返回的数据
     */
    private Object data;

    public R() {
        super();
    }

    public R(Object data) {
        super();
        this.data = data;
    }

    /**
     * 包装异常信息
     *
     * @param e
     */
    public R(Throwable e) {
        super();
        this.message = e.getMessage();
        this.state = FAIL;
    }

    public R(String message) {
        super();
        this.message = message;
        this.state = FAIL;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", state=" + state +
                ", data=" + data +
                '}';
    }
}
