package com.jc.servlet;

import com.jc02.dao.ResourccesDao;
import com.jc02.entity.Resourcces;
import com.jc02.util.SqlSessionHelp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/7.
 */
@WebServlet(name = "ResourceServletDelete",value = "/dodeleteResource.action")
public class ResourceServletDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("pid");
        ResourccesDao dao= SqlSessionHelp.SqlSessionHelp().getMapper(ResourccesDao.class);
        int b= dao.delete(id);
        SqlSessionHelp.SqlSessionHelp().commit();
        if (b==1){
            response.sendRedirect("resourcelist");
        }else {
            response.getWriter().append("Sorry!");//
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
