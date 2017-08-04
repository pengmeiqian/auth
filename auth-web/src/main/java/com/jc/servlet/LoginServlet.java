package com.jc.servlet;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年08月04日 - 10:46　                    
 *  |    @description   登录界面　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import com.jc02.dao.UserinfoDao;
import com.jc02.entity.Userinfo;
import com.jc02.util.SqlSessionHelp;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        SqlSession session= SqlSessionHelp.SqlSessionHelp();
        UserinfoDao dao=session.getMapper(UserinfoDao.class);
        String name=req.getParameter("username");
        String pwd=req.getParameter("password");
        Userinfo user=new Userinfo();
        user.setUname(name);
        user.setUpass(pwd);
        Userinfo userinfo=dao.checkLogin(user);
        if(userinfo==null){
           resp.sendRedirect("login.html");
        }else {
            req.getSession().setAttribute("user",userinfo);
           resp.sendRedirect("getResource");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
