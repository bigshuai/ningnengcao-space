<%--
  Created by IntelliJ IDEA.
  User: chenyuan
  Date: 4/27/14
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <%--响应式后的菜单--%>
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">响应式后的菜单</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <%--<a class="navbar-brand" href="#"><img src="http://www.zhihu.com/static/img/sticky_header/new_logo.png" alt="知乎"/></a>--%>
            <a class="navbar-brand" href="#">Bootstrap</a>
        </div>

        <div class="navbar-collapse collapse">

            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control search" id="global-search" placeholder="输入关键字...">
                </div>
            </form>

            <ul class="nav navbar-nav navbar-right">
                <li>
                    <button type="button" class="btn btn-info publish" data-toggle="modal" data-target="#publish-tweet-box">
                        <span class="glyphicon glyphicon-edit"></span>
                    </button>
                </li>
                <li class="active"><a href="#">主页</a></li>
                <li><a href="#about">发现</a></li>
                <li><a href="#contact">话题</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user margin-right-5px"></span> 个人主页</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-envelope margin-right-5px"></span> 私信</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-cog margin-right-5px"></span> 设置</a></li>
                        <li class="divider"></li>
                        <%--<li class="dropdown-header">Nav header</li>--%>
                        <li><a href="#"><span class="glyphicon glyphicon-off margin-right-5px"></span> 登出</a></li>
                    </ul>
                </li>

            </ul>


        </div><!--/.nav-collapse -->
    </div>
</div>
