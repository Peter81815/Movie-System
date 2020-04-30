<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search result</title>
</head>

<u>Search results</u>

<table border=1>
<tr><th>Movie Title</th><th>Lead Actor</th>
<th>Lead Actress</th><th>Genre</th><th>Year</th>
</tr>

<%--<c:forEach var="movie" items="${movie}">--%>
<tr>
    <td><c:out value="${movie.getTitle()}"></c:out>
</td>

<td>${movie.getActor()}
</td>

<td>${movie.getActress()}
</td>

<td>${movie.getGenre()}
</td>
<td>${movie.getYear()}
</td>
</tr>
<%--</c:forEach>--%>

</table>

<a href='index.htm'>Back to home page</a>
</body>
</html>