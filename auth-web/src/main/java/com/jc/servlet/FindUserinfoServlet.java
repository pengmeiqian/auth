package com.jc.servlet;

import com.jc02.dao.UserinfoDao;
import com.jc02.entity.Userinfo;
import com.jc02.util.SqlSessionHelp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/7.
 */
@WebServlet(name = "FindUserinfoServlet", urlPatterns = "/finduserinfoandrolename")
public class FindUserinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        UserinfoDao dao= SqlSessionHelp.SqlSessionHelp().getMapper(UserinfoDao.class);
        List<Userinfo> list=dao.findAllUserAndRole();
       request.setAttribute("li",list);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
