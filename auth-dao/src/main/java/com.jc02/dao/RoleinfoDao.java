package com.jc02.dao;

import com.jc02.entity.Roleinfo;

import java.util.List;

/**
 * Created by THINK on 2017/8/3.
 */
public interface RoleinfoDao {
    public List<Roleinfo> findAll();

    public Roleinfo findByrid(String rid);

    public int insert(Roleinfo roleinfo);

    public int update(Roleinfo roleinfo);

    public int delete(String rid);
}
