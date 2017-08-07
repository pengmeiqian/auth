package com.jc02.entity;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年08月05日 - 11:32　                    
 *  |    @description   微信表　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class WeiXinInfo {
    private String weixinhao;
    private String weixinnicheng;
    private String weixinimg;
    private Userinfo userinfo;

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    public String getWeixinhao() {
        return weixinhao;
    }

    public void setWeixinhao(String weixinhao) {
        this.weixinhao = weixinhao;
    }

    public String getWeixinnicheng() {
        return weixinnicheng;
    }

    public void setWeixinnicheng(String weixinnicheng) {
        this.weixinnicheng = weixinnicheng;
    }

    public String getWeixinimg() {
        return weixinimg;
    }

    public void setWeixinimg(String weixinimg) {
        this.weixinimg = weixinimg;
    }

    @Override
    public String toString() {
        return "WeiXinInfo{" +
                "weixinhao='" + weixinhao + '\'' +
                ", weixinnicheng='" + weixinnicheng + '\'' +
                ", weixinimg='" + weixinimg + '\'' +
                ", userinfo=" + userinfo +
                '}';
    }
}
