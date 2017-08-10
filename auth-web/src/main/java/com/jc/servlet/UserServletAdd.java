package com.jc.servlet;

import com.jc02.dao.UserinfoDao;
import com.jc02.entity.Roleinfo;
import com.jc02.entity.Userinfo;
import com.jc02.util.SqlSessionHelp;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/8.
 */
@WebServlet(name = "UserServletAdd",urlPatterns="/AddUser")
public class UserServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userName=request.getParameter("uname");
        String uPwd=request.getParameter("upass");
        String roleName=request.getParameter("rname");
        UserinfoDao dao= SqlSessionHelp.SqlSessionHelp().getMapper(UserinfoDao.class);
        Roleinfo roleinfo=(Roleinfo)request.getSession().getAttribute("role");
        Userinfo user=new Userinfo();
        Roleinfo r=new Roleinfo();
        user.setUname(userName);
        user.setUpass(uPwd);
        roleinfo.setRname(roleName);
        user.setRoleinfo(roleinfo);
        int num=dao.insertUser(user);
        if(num==1){
            response.sendRedirect("userlist");
        }else{
            response.getWriter().append("Sorry!").close();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
