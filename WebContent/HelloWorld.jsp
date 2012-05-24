<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
 <%@ taglib prefix="security"  uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World!</title>
</head>
<body>
<p>  Hello </p>
<p><a href="<s:url action='basicPackage/hello'/>">Hello World</a></p>
<p><a href="<s:url action='basicPackage/chapterOne'/>">Chapter One</a></p>
<p><a href="<s:url action='basicPackage/mindReader'/>">MindReader</a></p>
<p><a href="<s:url action='databaseWork/addPerson'/>">Add Person DB</a></p>
<p><a href="<s:url action='databaseWork/getPerson'/>">Get Person DB</a></p>
<p><a href="<s:url action='databaseWork/updatePerson'/>">Update Person DB</a></p>
<p><a href="<s:url action='basicPackage/helloMessageAction'/>">Hello Message(RMI)</a></p>
<p><a href="<s:url action='basicPackage/JMSTest'/>">JMS Test</a></p>
<p><a href="<s:url action='basicPackage/rpcJmsService'/>">RPC JMS Test</a></p>
<p><a href="<s:url action='basicPackage/email'/>">Send Email</a></p>
<p><a href="<s:url action='basicPackage/jndi'/>">Test jndi</a></p>
</body>
</html>