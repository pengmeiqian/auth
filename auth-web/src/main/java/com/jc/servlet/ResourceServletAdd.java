package com.jc.servlet;

import com.jc02.dao.ResourccesDao;
import com.jc02.entity.Resourcces;
import com.jc02.entity.Userinfo;
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
@WebServlet(name = "ResourceServletAdd",value="/addResource")
public class ResourceServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Userinfo userinfo=(Userinfo)request.getSession().getAttribute("user");
        String rname=request.getParameter("rname");
        String rurl=request.getParameter("rurl");
        String resource=request.getParameter("resource");
        String rorder=request.getParameter("rorder");
        String rdes=request.getParameter("rdes");

        Resourcces r=new Resourcces();
        r.setRname(rname);
        r.setResurl(rurl);
        r.setCreateMan(userinfo.getUname());
        r.setRedsdes(rdes);
        r.setResorderno(rorder);
        r.setParentID(resource);
        ResourccesDao dao= SqlSessionHelp.SqlSessionHelp().getMapper(ResourccesDao.class);
        int num=dao.insert(r);
        SqlSessionHelp.SqlSessionHelp().commit();
        if(num==1){
            response.sendRedirect("resourcelist");
        }else{
            response.getWriter().append("Sorry!").close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
