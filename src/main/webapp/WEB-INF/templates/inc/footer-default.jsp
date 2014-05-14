<%--
  Created by IntelliJ IDEA.
  User: chenyuan
  Date: 4/25/14
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="${PLUGIN_BASE_URL}/seajs/2.1.1/sea.js"></script>
<script>
    //Set configuration
    seajs.config({
        alias: {
            "jquery": "/plugin/jquery/1.10.1/jquery.js"
        }
    });
</script>