

<%-- <div class="container">
<body bgcolor="green">
<s:form action="login" method="post">
<s:textfield id="a" label="Enter Name" name="name"></s:textfield>
<s:textfield label="Enter Password" name="password"></s:textfield>
<s:password id="a"  label ="Enter Password" name="password"  ></s:password>
<s:submit id="button" value="Login"></s:submit>
<a id="register" href="register.jsp">RegisterNewUser</a>


</s:form> --%>


<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }
        
        .login-container {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        
        .login-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        
        .login-container input[type="text"],
        .login-container input[type="password"] {
            width: 94%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        
        .login-container input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4caf50;
            border: 0;
            border-radius: 3px;
            color: #fff;
            cursor: pointer;
        }
        
        .login-container input[type="submit"]:hover {
            background-color: #45a049;
        }
        
        .login-container p {
            text-align: center;
        }
        
        .error{
        color:red;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login Form</h2>
        <form action="login">
            <input type="text" class="name-field"   name="name" placeholder="Enter your name here" required="required" >
            
            <div>
            <input type="password" id="password" name="password" placeholder="Enter your password" required="required" >
            <span id="passwordError" class=error></span>
            </div>
            <input type="submit" value="Login">
        </form>
        <p>Not registered? <a href="register.jsp">Create an account</a></p>
    </div>
  
   <script src="JS/validate.js"></script> 
</body>
</html>



