package com.hzit.dao;

import com.hzit.entity.Urinfo;

import java.util.List;

/**
 * Created by THINK on 2017/8/3.
 */
public interface UrinfoDao {
    public List<Urinfo> findAll();

    public List<Urinfo> findByUid(int uid);

    public List<Urinfo> findByRid(int rid);

    public int insertUid(Urinfo urinfo);

    public int updateUid(Urinfo urinfo);

    public int deleteUid(int uid);

}
