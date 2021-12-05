<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="/styles/css/styleformat.css" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Room Tenants</title>
</head>
<body>
<h1>Room Tenant Details</h1>
<hr>
This is room tenant details page of spring boot data from to db app.

<table border="1">
<tr><th>Tenant Id</th><th>Tenant Name</th><th>Tenant Age</th><th>Tenant Occupation</th></tr>
<c:forEach var="rt" items="${tenantsList }">
<tr><td>${rt.rtid }</td><td>${rt.rtname }</td><td>${rt.rtage }</td><td>${rt.rtoccupation }</td></tr>
</c:forEach>
</table>

<br>
<br>
<br>
<a href="/home"><button>Home</button></a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/welcome"><button>Welcome</button></a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/addtenant"><button>Add New Tenant</button></a>

</body>
</html>