<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" href="/styles/css/styleformat.css" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Tenant</title>
</head>
<body>
<h1>Add New Tenant Page</h1>
<hr>
This is add new tenant page of spring boot data from to db app.
<form:form modelAttribute="form">
        <form:errors path="" element="div" />
        <div>
            <form:label path="rtid">Tenant ID</form:label>
            <form:input path="rtid" />
            <br>
            <br>

            <form:label path="rtname">Tenant Name</form:label>
            <form:input path="rtname" />
            <br>
            <br>

            <form:label path="rtage">Tenant Age</form:label>
            <form:input path="rtage" />
            <br>
            <br>

            <form:label path="rtoccupation">Tenant Occupation</form:label>
            <form:input path="rtoccupation" />
            <br>
            <br>
        </div>
        <div>
            <input type="submit" value="Add New Tenant"/>
        </div>
    </form:form>

<br>
<br>
<br>
<a href="/home"><button>Home</button></a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/welcome"><button>Welcome</button></a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/roomtenantdetails"><button>Room Tenant Details</button></a>

</body>
</html>