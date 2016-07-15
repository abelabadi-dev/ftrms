<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of Student Detail</h1>
	<table>
		<c:forEach var="item" items="${spList}">
			<tr>
				<td>${item.firstName}</td>
				<td>${item.lastName}</td>
				<td>${item.gender}</td>
				<td>${item.dateofBirth}</td>
				<td>${item.callSign}</td>
				<td>${item.licenseNo}</td>
				<td>${item.medicalLicenseNo}</td>
				
				<%-- <td><a href="update/sp/${item.id}">edit</a></td>  --%>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>