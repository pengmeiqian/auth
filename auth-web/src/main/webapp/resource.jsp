<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>权限管理系统</title>
  <link rel="stylesheet" type="text/css" href="Css/identify.css" />
  <link rel="stylesheet" type="text/css" href="Css/layout.css" />
  <link rel="stylesheet" type="text/css" href="Css/account.css" />
  <link rel="stylesheet" type="text/css" href="Css/style.css" />
  <link rel="stylesheet" type="text/css" href="Css/control_index.css" />
  <script type="text/javascript" src="Js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="Js/layer/layer.js"></script>
  <script type="text/javascript" src="Js/haidao.offcial.general.js"></script>
  <script type="text/javascript" src="Js/select.js"></script>
  <script type="text/javascript" src="Js/haidao.validate.js"></script>
</head>

<body>
<div class="view-topbar">
  <div class="topbar-console">
    <div class="tobar-head fl">
      <a href="#" class="topbar-logo fl">
        <span><img src="Images/logo.png" width="20" height="20"/></span>
      </a>
      <a href="index.html" class="topbar-home-link topbar-btn text-center fl"><span>管理权限管理系统</span></a>
    </div>
  </div>
  <div class="topbar-info">
    <ul class="fr">

      <li class="fl topbar-info-item">
        <div class="dropdown">
          <a href="#" class="topbar-btn">
            <span class="fl text-normal">小朱</span>
            <span class="icon-arrow-down"></span>
          </a>
          <ul class="dropdown-menu">
            <li><a href="login.html">退出</a></li>
          </ul>
        </div>
      </li>
    </ul>
  </div>
</div>
<div class="view-body">
  <div class="view-sidebar">
    <div class="sidebar-content">
      <!--一级菜单循环从这里开始 ，动态循环显示一级菜单-->
      <c:forEach var="fr" items="${reslist}">
        <c:if test="${fr.parentID==0}">
          <div class="sidebar-nav">
            <div class="sidebar-title">
              <a href="#">
                <span class="icon"><b class="fl icon-arrow-down"></b></span>
                <span class="text-normal">${fr.rname}</span>
              </a>
            </div>
            <ul class="sidebar-trans">
              <!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->

              <c:forEach var="sr" items="${reslist}">
                <c:if test="${sr.parentID==fr.rid}">

                  <li>
                    <a href="${sr.resurl}">
                      <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                      <span class="text-normal">${sr.rname}</span>
                    </a>
                  </li>
                </c:if>
              </c:forEach>
            </ul>
          </div>
        </c:if>
      </c:forEach>
    </div>
  </div>
  <div class="view-product">
    <div class="authority">
      <div class="authority-head">
        <div class="manage-head">
          <h6 class="layout padding-left manage-head-con">用户管理
            <span class="fr text-small text-normal padding-top">发布时间：2016-07-08</span>
            <span class="fr margin-large-right padding-top text-small text-normal">最新版本：<em class="text-main">2.4.0.160708</em></span>
          </h6>
        </div>
      </div>
      <div class="authority-content">
        <div class="list-content show">
          <a href="/toAddResource"><input type="submit" value="新增模块" class="submit fl"></a><br>
          <div class="offcial-table tr-border margin-big-top clearfix">
            <div class="tr-th clearfix">
              <div class="th w20">
                资源名称
              </div>
              <div class="th w20">
                资源URL
              </div>
              <div class="th w20">
                资源描述
              </div>
              <div class="th w20">
                资源序号
              </div>
              <div class="th w20">
                操作
              </div>
            </div>
            <c:forEach var="r" items="${allresource}" >
            <div class="tr clearfix border-bottom-none">
              <div class="td w20">
                ${r.rname}
              </div>
              <div class="td w20">
                ${r.resurl}
              </div>
              <div class="td w20">
                  ${r.redsdes}
              </div>
              <div class="td w20">
                  ${r.resorderno}
              </div>
              <div class="td w20">
                <a href="#"  class="button-word2 btn_ajax_confirm">编辑</a>|
                <a href="dodeleteResource.action?pid=${r.rid}"  class="button-word2 btn_ajax_confirm">删除</a>
              </div>
            </div>
            </c:forEach>
          </div>
        </div>
        <div class="show-page padding-big-right">
          <div class="page">
            <div class="page">
              <ul class="offcial-page margin-top margin-big-right">
                <li>共<em class="margin-small-left margin-small-right">1</em>条数据</li>
                <li>每页显示<em class="margin-small-left margin-small-right">15</em>条</li>
                <li><a class="next disable">上一页</a></li>
                <li></li>
                <li><a class="next disable">下一页</a></li>
                <li><span class="fl">共<em class="margin-small-left margin-small-right">1</em>页</span></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<script>
  $(".sidebar-title").live('click', function() {
    if ($(this).parent(".sidebar-nav").hasClass("sidebar-nav-fold")) {
      $(this).next().slideDown(200);
      $(this).parent(".sidebar-nav").removeClass("sidebar-nav-fold");
    } else {
      $(this).next().slideUp(200);
      $(this).parent(".sidebar-nav").addClass("sidebar-nav-fold");
    }
  });
</script>
</body>

</html>