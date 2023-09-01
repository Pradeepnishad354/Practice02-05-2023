<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  padding: 15px;
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
<form action="add" method="post"> 
<div class="container">
<h1>Add Student</h1>
<hr>

<label for="id" ><b>Id</b></label>
<input type="text" placeholder="Enter your id" name="id" id="id" required="required"><br>	


<label for="name" ><b>Name</b></label>
<input type="text" placeholder="Enter your name" name="name" id="name" required="required">	<br>

<label for="age" ><b>Age</b></label>
<input type="text" placeholder="Enter your age" name="age" id="age" required="required"><br>	

<label for="email" ><b>Email</b></label>
<input type="text" placeholder="Enter your email" name="email" id="email" required="required">	<br>



<label for="city" ><b>City</b></label>
<input type="text" placeholder="Enter your city" name="city" id="city" required="required">	<br>

<button type="submit" class="registerbtn">SaveStudent</button>
</div>
</form>





</body>
</html>