package com.jc02.test;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年08月03日 - 18:36　                    
 *  |    @description   测试用户表　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import com.jc02.dao.UserinfoDao;
import com.jc02.entity.Userinfo;
import com.jc02.util.SqlSessionHelp;
import org.apache.ibatis.session.SqlSession;

import java.util.logging.Logger;

public class TestUserinfo {
    public static void main(String[] args) {
        SqlSession session=SqlSessionHelp.SqlSessionHelp();
        UserinfoDao dao=session.getMapper(UserinfoDao.class);
        Logger logger=Logger.getLogger("TestUserinfo.class");

        int num=0;
        //增加一个用户
        Userinfo u=new Userinfo();
        u.setUid(4);
        u.setUname("张三");
        u.setUpass("123");
        u.setUstatus("1");
        num=dao.insertUser();
        session.commit();
        System.out.println("增加用户成功，受到影响的行数是"+num);


    }


}
