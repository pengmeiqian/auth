package com.jc02.entity;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年08月03日 - 16:47　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Roleinfo {
    private int rid;
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
    @Override
    public String toString() {
        return "Roleinfo{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }
}

