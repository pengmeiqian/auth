package com.jc02.entity;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年08月03日 - 18:14　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Urinfo {
    private int rid;
    private int uid;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Urinfo{" +
                "rid=" + rid +
                ", uid=" + uid +
                '}';
    }
}

