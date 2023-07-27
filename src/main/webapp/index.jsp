<%@ page import="com.example.User" %>
<%@ page import="com.example.UserList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Entries</title>
</head>
<body>
<h1>User Entries</h1>

<form action="myservlet" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <br>
    <input type="submit" value="Add User">
</form>

<hr>

<%--<h2>User List</h2>--%>
<%--<table>--%>
<%--    <thead>--%>
<%--    <th>--%>
<%--        <th>Name</th>--%>
<%--        <th>Email</th>--%>
<%--    </th>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    &lt;%&ndash; JSP Scriptlet &ndash;%&gt;--%>
<%--    <%--%>
<%--        List<User> userList = UserList.getUsers();--%>
<%--        for (User user : userList) {--%>
<%--    %>--%>
<%--    <tr>--%>
<%--        <td><%= user.getName() %></td>--%>
<%--        <td><%= user.getEmail() %></td>--%>
<%--    </tr>--%>
<%--    <%--%>
<%--        }--%>
<%--    %>--%>
<%--    </tbody>--%>
<%--</table>--%>
</body>
</html>

