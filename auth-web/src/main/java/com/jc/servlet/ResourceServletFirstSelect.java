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
import java.util.List;

/**
 * Created by THINK on 2017/8/7.
 */
@WebServlet(name = "ResourceServletFirstSelect",value = "/toAddResource")
public class ResourceServletFirstSelect extends HttpServlet {
    ResourccesDao resourccesDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        resourccesDao= SqlSessionHelp.SqlSessionHelp().getMapper(ResourccesDao.class);
        List<Resourcces> firstlist=resourccesDao.findFirstResources();
        request.setAttribute("firstlist",firstlist);
        request.getRequestDispatcher("addResources.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
