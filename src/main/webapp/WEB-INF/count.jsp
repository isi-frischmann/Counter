<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Counter</title>
</head>
<body>

<h3>You have visited our Homepage <c:out value="${ count }"/> times</h3>

<a href="/your_server/addTwo">Add 2 to your counter</a><br>

<a href="/your_server/back">Reset</a>

</body>
</html>