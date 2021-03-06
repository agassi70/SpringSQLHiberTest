<%@ page import="com.springsqlhibertest.entity.User" %>

<%--
  Created by IntelliJ IDEA.
  User: Юрий
  Date: 30.03.2015
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<html>
<head>
    <meta charset="utf-8">
    <style type="text/css">
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        </style>

</head>
<body>

<h3><p style="text-align: center">Список  пользователей</p></h3>

<c:if test="${!empty userList}">
    <table align="center" border="2">
        <tr align="center">
            <th width="60">Номер</th>
            <th width="150">ФИО пользователя</th>
            <th width="60">Возраст</th>
            <th width="40">Администратор</th>
            <th width="180">Дата</th>
            <th width="80">Редактирование</th>
            <th width="60">Удаление</th>
        </tr>
        <c:forEach items="${userList}" var="user" begin="0" end="9">
            <tr align="center">
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.admin}</td>
                <td>${user.createdDate}</td>
                <td><a href="<c:url value='/edit/${user.id}'/>" >Редактирование</a></td>
                <td><a href="<c:url value='/delete/${user.id}' />" >Удаление</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<div align="center">
<c:forEach var="i" begin="1" end="${endIndex}">
    <c:url var="pageUrl" value="/pageUser/${i}" />
    <a href="${pageUrl}"><c:out value="${i}" /></a>
</c:forEach>
</div>

<form>
    <p style="text-align: center">
        <button type="submit" formmethod="POST" formaction="/add">Добавить нового пользователя</button>
    </p>
</form>

<form>
    <p style="text-align: center">
        <button type="submit" formmethod="POST" formaction="/find">Поиск по фамилии</button>
    </p>
</form>

</body>
</html>
