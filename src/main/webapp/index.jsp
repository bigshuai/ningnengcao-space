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
    <jsp:include page="/templates/inc/header-default.jsp" flush="true"/>

    <div id="container">
        <img src="https://i.alipayobjects.com/e/201211/1cqKb32QfE.png" width="44" height="44" alt="H">
        <img src="https://i.alipayobjects.com/e/201211/1cqKb2rJHI.png" width="44" height="44" alt="e">
        <img src="https://i.alipayobjects.com/e/201211/1cqKeZrUpg.png" width="44" height="44" alt="l">
        <img src="https://i.alipayobjects.com/e/201211/1cqM4u3Ejk.png" width="44" height="44" alt="l">
        <img src="https://i.alipayobjects.com/e/201211/1cqKoKV2Sa.png" width="44" height="44" alt="o">
        <img src="https://i.alipayobjects.com/e/201211/1cqKb4JU4K.png" width="44" height="44" alt=",">
        <img src="https://i.alipayobjects.com/e/201211/1cqKojFDLY.png" width="44" height="44" alt="S">
        <img src="https://i.alipayobjects.com/e/201211/1cqKb2sBO8.png" width="44" height="44" alt="e">
        <img src="https://i.alipayobjects.com/e/201211/1cqKb2LmXk.png" width="44" height="44" alt="a">
        <img src="https://i.alipayobjects.com/e/201211/1cqKb1jcWC.png" width="44" height="44" alt="J">
        <img src="https://i.alipayobjects.com/e/201211/1cqKojb72y.png" width="44" height="44" alt="S">
    </div>

    ${DOMAIN}<br/>
    ${JS_BASE_URL}<br/>
    ${CSS_BASE_URL}<br/>
    ${IMG_BASE_URL}<br/>
    ${PLUGIN_BASE_URL}<br/>
    <h1>欢迎</h1>=========<br/>
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


    <jsp:include page="/templates/inc/footer-default.jsp" flush="true"/>
    <script>
        //seajs.use('/js/app', function(init){
        //    alert(init.message);
        //});

        //Set configuration
        seajs.config({
            alias: {
                "jquery": "/plugin/jquery/1.10.1/jquery.js"
            }
        });

        // For development
        seajs.use("/js/main");
    </script>

    <%--<script src="/plugin/jquery/1.10.1/jquery-1.8.1.js"></script>--%>
    <%--<script>--%>
        <%--$(function(){--%>
            <%--alert(111111);--%>
        <%--});--%>
    <%--</script>--%>
</body>
</html>
