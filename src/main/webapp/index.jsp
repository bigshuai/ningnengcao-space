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

<html>
<head>
    <title></title>
</head>
<body>
    <jsp:include page="templates/inc/header-default.jsp" flush="true"/>


    ${DOMAIN}<br/>
    ${JS_BASE_URL}<br/>
    ${CSS_BASE_URL}<br/>
    ${IMG_BASE_URL}<br/>
    ${PLUGIN_BASE_URL}<br/>
    欢迎=========<br/>
    <c:if test="${tweet != null}">
        tweetId: <c:out value="${tweet.tweetId}"></c:out> <br/>
        content: <c:out value="${tweet.content}"></c:out> <br/>
        images: <c:out value="${tweet.images}"></c:out> <br/>
        userId: <c:out value="${tweet.userId}"></c:out> <br/>
        category: <c:out value="${tweet.category}"></c:out> <br/>
        createTime: <c:out value="${tweet.createTime}"></c:out>
        || createTime: <fmt:formatDate value="${tweet.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
        <br/>
        source: <c:out value="${tweet.source}"></c:out> <br/>
    </c:if>
    <jsp:include page="templates/inc/footer-default.jsp" flush="true"/>
    <script></script>
</body>
</html>
