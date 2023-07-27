<%--
  Created by IntelliJ IDEA.
  User: chandini
  Date: 18/07/23
  Time: 5:03 pm
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="com.example.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.UserList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>User Details</title>
</head>
<body>
<h1>User List</h1>
<table>
    <thead>
    <tr>
    <th>Name</th>
    <th>Email</th>
    </tr>
    </thead>
    <tbody>
    <%-- JSP Scriptlet --%>
    <%
        List<User> userList = UserList.getUsers();
        for (User user : userList) {
    %>
    <tr>
        <td><%= user.getName() %></td>
        <td><%= user.getEmail() %></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
