package com.etc.entity;

import java.util.Date;

public class Reminder {
    private Integer id;

    private Integer userid;

    private Integer busid;

    private Date remdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBusid() {
        return busid;
    }

    public void setBusid(Integer busid) {
        this.busid = busid;
    }

    public Date getRemdate() {
        return remdate;
    }

    public void setRemdate(Date remdate) {
        this.remdate = remdate;
    }
}