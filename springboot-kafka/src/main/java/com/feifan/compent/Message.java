package com.feifan.compent;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Donald
 * @create 2020-03-08 23:09
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 7205363110870938594L;
    private long id;
    private String Msg;
    private Date sendTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
