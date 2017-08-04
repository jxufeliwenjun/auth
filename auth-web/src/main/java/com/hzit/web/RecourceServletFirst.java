package com.hzit.web;

import com.hzit.dao.ResourccesDao;
import com.hzit.entity.Resourcces;
import com.hzit.util.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 袁闯 on 2017/8/4.
 */
@WebServlet(name = "RecourceServletFirst",value ="/toAddResource")
public class RecourceServletFirst extends HttpServlet {
    ResourccesDao resourccesDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        resourccesDao= SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        List<Resourcces> firstlist=resourccesDao.findFirstResources();
        request.setAttribute("firstlist",firstlist);
        request.getRequestDispatcher("addResources.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
