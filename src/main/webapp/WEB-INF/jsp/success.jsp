<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>New User</title>
    </head>
    <body>
        
        <h2>User created on <s:property value="nowDate" /></h2>
        
        <p>
            Your name recorded was: <h3><s:property value="userOrig.name" /></h3>
        </p>
        
        <h2><a href="/my-app-4-context">Menu Principal</a></h2>
        
    </body>
</html>