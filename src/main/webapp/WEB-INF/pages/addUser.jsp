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
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>

</head>
<body>
<h1>
    Добавление пользователя
</h1>

<form:form action="/addUser" commandName="user">

<table>
        <tr>
            <td>
                <form:label path="name">
                    <spring:message text="Ввести ФИО"/>
                </form:label>
            </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="age">
                    <spring:message text="Возраст"/>
                </form:label>
            </td>
            <td>
                <form:input path="age" />
            </td>
        </tr>
    <tr>
        <td>
            <form:label path="admin">
                <spring:message text="Является админом"/>
            </form:label>
        </td>
        <td>
            <form:input path="admin" />
        </td>
    </tr>
    <tr>
        <td>
            <form:label path="createdDate">
                <spring:message text="Дата регистрации"/>
            </form:label>
        </td>
        <td>
            <form:input path="createdDate" />
        </td>
    </tr>

    <br/>
        <tr>
            <td colspan="2">
                <input type="submit"
                       value="<spring:message text="Добавить пользователя"/>" />
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
