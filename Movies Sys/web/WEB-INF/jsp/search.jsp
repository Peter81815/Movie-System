<%-- 
    Document   : search
    Created on : Mar 17, 2019, 6:12:30 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>

<h1>Searching by Movies table id</h1>


   <form method="POST" action="search.htm" >
   <label class="txt">Input id:</label>
  <input type="text" name="keyword"><br>
  <input type="hidden" value="search" name="option" />
  <input type="hidden" value="transferSearch" name="select" />
  
<!--  <input type="radio" name="option" value="title" checked> Search By Title<br>
  <input type="radio" name="option" value="actor"> Search By Actor<br>
  <input type="radio" name="option" value="actress">Search By Actress<br>-->
  
  <input type="submit" value="Search Movies">
</form:form> 

</body>
</html>
