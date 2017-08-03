package com.hzit.dao;

import com.hzit.entity.Resourcces;

import java.util.List;

/**
 * Created by THINK on 2017/8/3.
 */
public interface ResourccesDao {
    public List<Resourcces> findResourcces(int userid);

}
