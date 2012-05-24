<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="security"  uri="http://www.springframework.org/security/tags" %>
 Your authentication passed!
 
<p> Principal: <security:authentication property="principal.username" var="username"/>
<p> Authorities: <security:authentication property="authorities"/>
<p> Credentials: <security:authentication property="credentials"/>
<p> Details: <security:authentication property="details"/>
 
