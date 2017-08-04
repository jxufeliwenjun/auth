package com.hzit.dao;

import com.hzit.entity.Roleresource;

import java.util.List;

/**
 * Created by THINK on 2017/8/3.
 */
public interface RoleresourceDao {
    public List<Roleresource> findAll();

    public Roleresource findByRoleId(int roleid);

    public Roleresource findByResourceid(int resourceid);

    public int update(Roleresource roleresource);

    public int delete(String roleid);
}
