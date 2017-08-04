package com.hzit.entity;

/**
 * Created by THINK on 2017/8/3.
 */
public class Roleinfo {
    private  int rid;

    @Override
    public String toString() {
        return "Roleinfo{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }

    private String rname;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}
