<%--
  Created by IntelliJ IDEA.
  User: chenyuan
  Date: 4/25/14
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html lang="zh-cn">
<head>
    <title></title>
    <meta name="description" content="">
    <meta name="author" content="">
    <jsp:include page="/templates/inc/header-default.jsp" flush="true"/>
</head>
<body>
    <jsp:include page="/templates/inc/navigation-default.jsp" flush="true"/>
    <div class="container wrapper">
        <div class="row">
            <%--dashboard--%>
            <jsp:include page="/templates/inc/dashboard-default.jsp" flush="true"/>
            <%-- ******** 正文 ********--%>
            <div class="col-sm-8">
                <div class="row">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">动态列表</h3>
                        </div>
                        <ul class="list-group">
                            <c:if test="${split != null && split.list != null}">
                                <c:forEach items="${split.list}" var="tweet">
                                    <li class="list-group-item">
                                        <c:out value="${tweet.tweetId}"/><br/>
                                        <c:out value="${tweet.content}"/><br/>
                                        <c:out value="${tweet.images}"/><br/>
                                        <c:out value="${tweet.category}"/><br/>
                                        <fmt:formatDate value="${tweet.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/><br/>
                                        <c:out value="${tweet.source}"/><br/>
                                    </li>
                                </c:forEach>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </div><!-- /.tweet-main -->
        </div><!-- /.row -->
    </div> <!-- /container -->

    <!-- Modal -->
    <div class="modal fade" id="publish-tweet-box" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">发布新分享</h4>
                </div>
                <div class="modal-body">
                    <div contenteditable="true" class="tweet-box">测试...</div>
                </div>
                <div class="modal-footer">
                    <ul class="nav nav-pills pull-left">
                        <li><a href="#"><span class="glyphicon glyphicon-camera"></span></a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-expand"></span></a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-globe"></span></a></li>
                    </ul>
                    <button type="button" name="add" class="btn btn-primary">发布</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <jsp:include page="/templates/inc/footer-default.jsp" flush="true"/>
    <script>
        seajs.use("/js/app");
    </script>
</body>
</html>
