package com.jc02.dao;

import com.jc02.entity.Resourcces;

import java.util.List;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年08月03日 - 17:08
 * |    @description   资源信息表接口
 * +---------------------------------Oooo-----------------------------+
 */
public interface ResourccesDao {
    public List<Resourcces> findByUserId(int uid);

    public List<Resourcces> findAllResource();

    public List<Resourcces> findFirstResources();

    public int insert(Resourcces resourcces);

    public int update(Resourcces resourcces);

    public int delete(String rid);
}
