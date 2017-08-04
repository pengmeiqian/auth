package com.jc.servlet;

import com.jc02.entity.Resourcces;
import com.jc02.entity.Userinfo;
import com.jc02.util.SqlSessionHelp;
import com.jc02.dao.ResourccesDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * Created by Administrator on 2017/8/4.
 */
@WebServlet(name = "GetResourcesByUserServlet",urlPatterns = "/getResource")
public class GetResourcesByUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
        ResourccesDao resourcesDao=SqlSessionHelp.SqlSessionHelp().getMapper(ResourccesDao.class);
        Userinfo userInfo=(Userinfo)request.getSession().getAttribute("user");
        if(userInfo !=null){
            //获取当前登录用户所拥有的资源
            List<Resourcces> reslist= (List<Resourcces>) resourcesDao.findByUserId(userInfo.getUid());
            request.setAttribute("reslist",reslist);

            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}
