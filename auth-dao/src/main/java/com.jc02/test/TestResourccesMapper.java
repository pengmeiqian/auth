package com.jc02.test;

import com.jc02.dao.ResourccesDao;
import com.jc02.entity.Resourcces;
import com.jc02.util.SqlSessionHelp;
import org.apache.ibatis.session.SqlSession;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年08月03日 - 18:44
 * |    @description   测试资源信息表
 * +---------------------------------Oooo-----------------------------+
 */
public class TestResourccesMapper {

    public static void main(String[] args) {
        SqlSession session=SqlSessionHelp.SqlSessionHelp();
        ResourccesDao dao=session.getMapper(ResourccesDao.class);
        int num=0;
        //查询
        Resourcces resourcces=dao.findByRoleId("1");
        System.out.println(resourcces);

        //增加
        /*Resourcces resourcces=new Resourcces();
		resourcces.setRname("服务");
        resourcces.setResurl("http://server.com");
        resourcces.setRedsdes("就业");
		num=dao.insert(resourcces);
		session.commit();
		System.out.println("受到影响的行数为"+num);*/

        //删除
        /*num=dao.delete("4");
        session.commit();
        System.out.println("受到影响的行数为"+num);*/

        //修改
        resourcces.setRid(1);
        resourcces.setRname("就业服务");
        resourcces.setResurl("http://baidu.com");
        resourcces.setRedsdes("就业模块");
        num=dao.update(resourcces);
        session.commit();
        System.out.println("受到影响的行数为"+num);
    }
}
