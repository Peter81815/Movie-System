<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>

<h1>Welcome to our Movie Store</h1>
<p>Please make your selection below</p>
<form action="home.htm" method="post">
<select id="select" name="select">
  <option value ="Browse">Browse Movies</option>
  <option value ="Add">Add new movie to Database</option>
  
</select>
    <input type="submit" value="submit" />
<!--<button type="button" onclick="getOption()">Send</button>-->
</form>

<!--<script type="text/javascript">
              function getOption(){
                var option = document.getElementById("select");
                if(option.value == "Add"){
                    window.location.href = ("add.jsp");
                }
                if(option.value == "Browse"){
                    window.location.href = ("search.jsp");
                }
                
            }
</script>-->
</body>
</html>