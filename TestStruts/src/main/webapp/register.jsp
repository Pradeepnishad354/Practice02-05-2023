
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    
    
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }
        
        .register-container {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        
        .register-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        
        .register-container input[type="text"],
        .register-container input[type="password"],
        .register-container input[type="email"] {
            width: 94%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 2px;
        }
        
        .register-container input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4caf50;
            border: 0;
            border-radius: 3px;
            color: #fff;
            cursor: pointer;
        }
        
        .register-container input[type="submit"]:hover {
            background-color: #45a049; 
            
        }
        
        .register-container p {
            text-align: center;
        }
        
        .error{
        color:red;
        
        }
        
    </style>
</head>
<body>
    <div class="register-container">
        <h2>Registration Form</h2>
        <form action="register"   onsubmit="return validateForm()"  method="post">
            <div>      
            <input type="text" id="name" name="name" placeholder="Enter your  Name" >
            <span id=nameError class="error"></span>
            </div>
            <div>
            <input type="password" id="password" name="password" placeholder="Enter your Password" >
            <span id="passwordError" class="error"></span>
            </div>
            <div>
            <input type="email" id="email" name="email" placeholder="Enter Your Email" >
             <span id="emailError" class="error"></span>
             </div>
            <input type="submit" value="Register">
        </form>
        <p>Already registered? <a href="index.jsp">Login</a></p>
    </div>
    
   
    <script src="JS/validate.js"></script>
    
</body>
</html>





