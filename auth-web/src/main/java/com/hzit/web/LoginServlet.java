package com.hzit.web;

import com.hzit.dao.UserinfoDao;
import com.hzit.util.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 袁闯 on 2017/8/4.
 */
@WebServlet(name = "LoginServlet",value="/loginServlet")
public class LoginServlet extends HttpServlet {

    UserinfoDao userinfoDao= SqlSessionHelper.getSqlSession().getMapper(UserinfoDao.class);


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");



        System.out.println("有个请求来了！");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
