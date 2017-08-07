package com.jc02.entity;

import java.util.Date;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年08月03日 - 16:46
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Resourcces {
    private int rid;
    private String rname;
    private String resurl;
    private String resorderno;
    private String redsdes;
    private String createTime;
    private String updatetime;
    private String createMan;
    private String updateMan;
    private String parentID;

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

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    public String getResorderno() {
        return resorderno;
    }

    public void setResorderno(String resorderno) {
        this.resorderno = resorderno;
    }

    public String getRedsdes() {
        return redsdes;
    }

    public void setRedsdes(String redsdes) {
        this.redsdes = redsdes;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    @Override
    public String toString() {
        return "Resourcces{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", resurl='" + resurl + '\'' +
                ", resorderno=" + resorderno +
                ", redsdes='" + redsdes + '\'' +
                ", createTime=" + createTime +
                ", updatetime=" + updatetime +
                ", createMan='" + createMan + '\'' +
                ", updateMan='" + updateMan + '\'' +
                ", parentID=" + parentID +
                '}';
    }
}
