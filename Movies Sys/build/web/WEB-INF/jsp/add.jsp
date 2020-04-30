<%-- 
    Document   : add
    Created on : Mar 17, 2019, 6:12:17 PM
    Author     : root
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
<!--<style>
* {box-sizing: border-box}
body {font-family: "Lato", sans-serif;}

/* Style the tab */
.txt {
  float: left;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
  width: 20%;
  height: 30px;
  text-align: center;
}
.er{
  float: left;
  padding: 0px 12px;
  border: 1px solid #ccc;
  color:red;
  width: 20%;
  border-left: none;
  height: 30px;
}

/* Style the tab content */
.field {
  float: left;
  padding: 0px 12px;
  border: 1px solid #ccc;
  width: 60%;
  border-left: none;
  height: 30px;
}
#addBtn {
    width: 200px;
    height: 50px;
    text-size-adjust: auto;
}
</style>-->
</head>
<body >
<h1>Please enter the details below:</h1>
<form:form commandName="MovieItem" action="add.htm" method="post">
            <label>Movie Title: </label> 
            <form:input path="title" type="text" />
            <form:errors path="title" /><br>
            
            <label>Lead Actor: </label> 
            <form:input path="actor" type="text" />
            <form:errors path="actor" /><br>
            
            <label>Lead Actress: </label> 
            <form:input type="text" path="actress" />
            <form:errors path="actress" /><br>
            
            <label>Genre: </label> 
            <form:input type="text" path="genre" />
            <form:errors path="genre" /><br>
            
            <label>Year: </label> 
            <form:input type="text" path="year" />
            <form:errors path="year" /><br>
            
            
           
            <input type="hidden" value="submitMovie" name="formtype" />

            <input type="submit" id="addBtn" value="Add Movie">
        </form:form>


</body>
</html>