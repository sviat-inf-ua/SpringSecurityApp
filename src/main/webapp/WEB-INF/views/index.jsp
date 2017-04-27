<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Hello its index page !!!</h1>

<div>
    div class="row">
    <div class="col-md-3 col-xs-12"></div>
    <div class="col-md-7 col-xs-12">
<c:forEach items="${producerGpus}" var="producerGpu">
    <div class="col-md-4 col-xs-4">${producerGpu.name}</div>
    <div class="col-md-4 col-xs-4"></div>
    </div>
</c:forEach>
</div>

<%--<c:forEach items="${producerGpus}" var="producerGpu">--%>
    <%--<div class="row">--%>
    <%--<div class="col-md-4 col-xs-4">${producerGpu.name}</div>--%>
    <%--</div>--%>
<%--</c:forEach>--%>

</body>
</html>
