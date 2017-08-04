package com.jc02.test;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年08月03日 - 18:53　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import com.jc02.dao.RoleinfoDao;
import com.jc02.entity.Roleinfo;
import com.jc02.util.SqlSessionHelp;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestRoleinfoMapper {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelp.SqlSessionHelp();
        RoleinfoDao dao=session.getMapper(RoleinfoDao.class);
        List<Roleinfo> list=dao.findAll();
        for (Roleinfo string : list) {
            System.out.println(string);
        }

      /* Roleinfo roleinfo=dao.findByrid("4");
        System.out.println(roleinfo);*/

      /* roleinfo.setRname("人事主管");
        dao.update(roleinfo);
        System.out.println(roleinfo);
        session.commit();
*/
      /*  Roleinfo roleinfo1=new Roleinfo();
        roleinfo1.setRid(5);
        roleinfo1.setRname("就业主管");
        dao.insert(roleinfo1);
        session.commit();
        System.out.println(roleinfo1);
*/



    }
}

