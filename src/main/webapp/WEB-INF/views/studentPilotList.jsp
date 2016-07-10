<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Pilot enrolled</title>
</head>
<body>
	<h1>Students enrolled for Training</h1>
	<table>
	<c:forEach var="sp" items="${spList}">
	<tr>
		<td>${sp.firstName}</td>
		<td>${sp.lastName}</td>
		<td><a href="editSP/${sp.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
	<form action="addStudentPilots">
	<a href="addStudentPilot"> Add Student Pilot</a></form>
</body>
</html>