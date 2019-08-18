<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
		<div style="width:500px;border:1px solid lightgray;margin:200px auto;padding:80px">
			
			系统出现了异常，异常原因是：
			${requestScope.exception}<br>
			出现异常的地址是:
			${requestScope.url} 
		</div>
</body>
</html>