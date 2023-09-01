<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<%-- <%@ taglib uri="/struts-tags" prefix="s" %>  --%> 
  
<%-- <h3>All Records:</h3>  
<s:iterator  value="student">  
<fieldset>  
<s:property value="id"/><br/>  
<s:property value="name"/><br/>  
<s:property value="age"/><br/>  
<s:property value="email"/><br/>  
<s:property value="city"/><br/>  
</fieldset>  
</s:iterator>  
 --%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>




table{
font-family: arial;
border-collapse: collapse;
width:80%

}
td,th{
border: 1px solid ;
text-align: left;
padding: 8px;


}

.delete-btn{
 background-color: red;
  border: none;
  color: white;
  padding: 15px 11px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;

}
.update-btn{
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 11px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}

.list-btn{

background-color: blue; /* Green */
  border: none;
  color: white;
  padding: 15px 11px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;


}

#delete{

 color: green;
            font-weight: bold;
            margin-top: 10px;
}

</style>
</head>
<body>
 
 <h1>List Of Student</h1>
 
<table id="myTable">
<thead>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Age</th>
    <th>Email</th>
    <th>City</th>
    <th>Action</th>
  </tr>
  </thead>
<s:iterator  value="student">
   <tr>
    <td><s:property value="id"/></td>
    <td><s:property value="name"/></td>
    <td><s:property value="age"/></td>
    <td><s:property value="email"/></td>
    <td><s:property value="city"/></td>
    
    <td>
    
    <a class=delete-btn href="deleteStudent?id=<s:property value="id" />">Delete</a>
    
    
  <%--   <a class=update-btn href="updateStudent?id=<s:property value="id" />">Update</a> --%>
   
    <a  onclick="deleteData()" class=update-btn href="update?id=<s:property value="id" />">Update</a>
   
   
   
   <a class=list-btn href="stu_add.jsp">AddData</a></td>
   <%-- <a href="updatedetails.action?submitType=updatedata&id=<s:property value="id"/>">
								<button class="button-update">Update</button>
							</a>
    --%>
  </tr>
  </s:iterator>
</table> 

<script>


</script>

</body>
</html>




