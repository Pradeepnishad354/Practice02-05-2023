<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>  


body, html {
  height: 100%;
  margin: 0;
}

.bgimg {
  background-image: url('image/welcome.jpg');
  height: 80%;
  background-position: center;
  background-size: cover;
  position: relative;
  color: white;
  font-family: "Courier New", Courier, monospace;
  font-size: 25px;
}

.topleft {
  position: absolute;
  top: 0;
  left: 16px;
}

.bottomleft {
  position: absolute;
  bottom: 0;
  left: 16px;
}

.middle {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  text-align: center;
}

hr {
  margin: auto;
  width: 40%;
}

#a{
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}

#b{

background-color: pink;
border:none;
color:red;
text-align:right;
padding:20px 30px;

text-decoration: none;
display: inline-block;
font-size: 30px;



}


</style>





</head>
<%-- <body>
<h1>This is welcome page</h1>

Welcome: <s:property value="name"/>
<a href="stu_add.jsp">Add Student</a>
<a href="student">ListStudent</a>
</body>
</html> --%>

<body>

<div class="bgimg">
  <div class="topleft">
  <div id="b">Welcome: <s:property value="name"/></div>
    <p><a id="a"href="stu_add.jsp">Add Student</a>
    <a id="a" href="student">ListStudent</a>
    </p>
  </div>
  <div class="middle">
 
    <hr>
    
  </div>
  <div class="bottomleft">
    
  </div>
</div>


</body>
</html>
