<%@page import="java.util.Date"%>
<%@page import="in.co.cg.servlet.model.resume.Resume"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<% Resume resume=(Resume)request.getAttribute("ResumeModel"); %>
<head>

<meta charset="ISO-8859-1">
<title><%=resume.getfName()%> <%=resume.getlName()%> Resume</title>

<style>
body{
background-color: black;}
.resume{
padding:50px;
background-color: white;
margin-left: 20%;
margin-right: 20%;
}
.details{
font-size: small;
}
h3{

text-align: center;}
</style>
</head>
<body>

<div class="resume">
<h2><%=resume.getfName()%> <%=resume.getlName()%></h2> 
<div class="details"><%= resume.getAddress()%></div>
<div class="details"><%= resume.getGender()%></div>
<div class="details"><%= resume.getDob()%></div>
<div class="details"><%= resume.getEmail()%></div>
<div class="details"><%= resume.getContactNo()%></div>
<div class="details"><%= resume.getWebsite()%></div>
<%String imgSrc= resume.getImageSource();%>
<img src=imgSrc height="50
" width="35"/>
<h3> Summary</h3>
<p><%= resume.getSummary() %></p>
<hr>
<h3> Highest Qualification</h3>
<p><%= resume.gethQualification() %></p>
<hr>
<h3> Skills</h3>
<%String skill[]=resume.getSkills();
for(String ski:skill)
	out.println("<li>"+ski+"</li>"); %>
	<hr>
<h3> Hobbies</h3>
<%String hobb[]=resume.getHobbies();
for(String hob:hobb)
	out.println("<li>"+hob+"</li>"); %>
<div class="currdate"> <%Date date=new Date();%><%=date%></div>
</div>
</body>
</html>