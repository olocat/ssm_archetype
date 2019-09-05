<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: AKA
  Date: 2019/9/2
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Index</title>
</head>
<body>
<table title="User" border="1">
	<thead>
	<tr>
		<th>ID</th>
		<th>username</th>
	</tr>
	</thead>
	<c:forEach items="${list}" var="user">
		<tr>
			<th>${user.id}</th>
			<th>${user.username}</th>
		</tr>
	</c:forEach>
</table>
</body>
</html>
