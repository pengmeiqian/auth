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

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TestUserinfo {
    public static void main(String[] args) {
        SqlSession session=SqlSessionHelp.SqlSessionHelp();
        UserinfoDao dao=session.getMapper(UserinfoDao.class);
        Logger logger=Logger.getLogger("TestUserinfo.class");

        int num=0;
        //增加一个用户
        Userinfo u=new Userinfo();
       /* u.setUid(12);
        u.setUname("张三");
        u.setUpass("123");
        u.setUstatus("1");
        num=dao.insertUser(u);
        System.out.println(num);
        session.commit();
        System.out.println("增加用户成功，受到影响的行数是"+num);*/

        //查找一个用户

        Userinfo userinfo=new Userinfo();
        userinfo.setUname("李四");
        userinfo.setUpass("123456");
        u=dao.checkLogin(userinfo);
        System.out.println(u.getUid());

        //修改一个用户
     /*   u.setUname("李四");
        u.setUstatus("0");
        u.setUpass("123456");
        num=dao.updateUser(u);
        session.commit();
        System.out.println("修改用户成功，受到影响的行数是"+num);*/

        //查找所有的用户
     /*   List<Userinfo> user=new ArrayList<Userinfo>();
        user=dao.findAllUser();
        for(Userinfo s:user){
            System.out.println(s);
        }
        session.commit();*/

        //删除一个用户
        /*num=dao.deleteUser("12");
        session.commit();
        System.out.println("删除用户成功，受到影响的行数为"+num);*/




    }


}
