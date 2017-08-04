package com.jc02.dao;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年08月03日 - 16:53　                    
 *  |    @description   用户类的接口　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import com.jc02.entity.Userinfo;

import java.util.List;

public interface UserinfoDao {
    public boolean Login(String uname,String upass);

    public int insertUser(Userinfo userinfo);

    public int deleteUser(String uid);
    public int updateUser(Userinfo userinfo);

    public List<Userinfo> findAllUser();

    public Userinfo findUser(String uid);
}
