package com.jc02.entity;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年08月03日 - 16:49　                    
 *  |    @description   用户表　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class Userinfo {
    private int uid;
    private String uname;
    private String upass;
    private String ustatus;
    private WeiXinInfo weiXinInfo;
    private Roleinfo roleinfo;
    public WeiXinInfo getWeiXinInfo() {
        return weiXinInfo;
    }

    public void setWeiXinInfo(WeiXinInfo weiXinInfo) {
        this.weiXinInfo = weiXinInfo;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    public Roleinfo getRoleinfo() {
        return roleinfo;
    }

    public void setRoleinfo(Roleinfo roleinfo) {
        this.roleinfo = roleinfo;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", ustatus='" + ustatus + '\'' +
                ", weiXinInfo=" + weiXinInfo +
                ", roleinfo=" + roleinfo +
                '}';
    }
}
