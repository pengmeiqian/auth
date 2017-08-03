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

       /*Roleinfo cardinfo=dao.findBycardid("4");
        System.out.println(cardinfo);
*/

    }
}

