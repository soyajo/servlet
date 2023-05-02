<%@ page import="java.lang.reflect.Member" %><%--
  Created by IntelliJ IDEA.
  User: josoya
  Date: 2023/05/02
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
</head>
<body>
성공
<ul>
  <%--jsp--%>
  <li>id=${member.id}</li>
  <li>username=${member.username}</li>
  <li>age=${member.age}</li>
  <%-- 과거 --%>
<%--  <li>id=<%= ((Member)request.getAttribute("member")).getId() %></li>--%>
<%--  <li>username=<%= ((Member)request.getAttribute("member")).getUsername() %></li>--%>
<%--  <li>age=<%= ((Member)request.getAttribute("member")).getAge() %></li>--%>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
