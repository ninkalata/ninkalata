<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerCode" value="${tempCustomer.code}" />
</c:url>
	<a href="${deleteLink}"
	onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false" class="btn btn-danger btn-sm">Delete</a>
</body>
</html>