package com.hzit.dao;

import com.hzit.entity.Userinfo;

import java.util.List;

/**
 * Created by THINK on 2017/8/3.
 */
public interface UserinfoDao {
    public List<Userinfo> findUser();

    public int addUser(Userinfo userinfo);

    public int updateUser(Userinfo userinfo);

    public int deleteUser(String uid);

    public Userinfo findUserByNameAndPwd(String name,String pwd);
}



