<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student add </title>
<style>
body{
font-family: Arial,Helvetica, sans-serif;
background-color: black
}


* {
  box-sizing: border-box;
}

/* // add padding for conatiner */

.container{
padding: 15px;
background-color: white;


}

input[type=text]{
  width: 80%;
  padding: 10px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

.registerbtn:hover {
  opacity: 1;
}

.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 10%;
  opacity: 0.9;
}


a {
  color: dodgerblue;
}

</style>

</head>
<body>
<form action="updates" method="post"> 
<div class="container">
<h1>Update Student</h1>
<hr>

 <label   for="id" ><b>Id</b></label>

<s:textfield  placeholder="Enter your id" value="%{#application.a}" name="s.id" readonly="true"/><br>	




<label for="name" ><b>Name</b></label>
<s:textfield  placeholder="Enter your name" value="%{#application.b}" name="s.name" /><br>

<label for="age" ><b>Age</b></label>
<s:textfield  placeholder="Enter your age" value="%{#application.c}" name="s.age" /><br>

<label for="email" ><b>Email</b></label>
<s:textfield  placeholder="Enter your email" value="%{#application.d}" name="s.email" /><br>



<label for="city" ><b>City</b></label>
<s:textfield  placeholder="Enter your city" value="%{#application.e}" name="s.city"/><br>

<button type="submit" class="registerbtn">UpdateStudent</button>
	
</div>
</form>





</body>
</html>