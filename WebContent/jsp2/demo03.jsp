<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- include 动作
	<jsp:include page="引入文件的地址"></jsp:include>
	include动作引入的jsp文件，在转换期是没有被引入的，只有代码执行到这个位置时，才会动态编译载入
		 --%>
	<h1>这是demo02的页面</h1>
	<jsp:include page="demo02.jsp"></jsp:include>
	
	<br>
	<hr>
	
	<%-- userBean setProperty getProperty
		<jsp:useBean id="别名" class="全限定名" scope="作用域"></jsp:useBean>
		<jsp:setProperty property="属性名称" name="别名" value="值"/>
	 --%>
	
	<jsp:useBean id="u" class="Two.entity.User" scope="request"></jsp:useBean>
	<jsp:setProperty property="uid" name="u" value="1"/>
	<jsp:setProperty property="uname" name="u" value="admin"/>
	<jsp:setProperty property="upass" name="u" value="123"/>
	
	
	<jsp:getProperty property="uid" name="u"/>
	<jsp:getProperty property="uname" name="u"/>
	<jsp:getProperty property="upass" name="u"/>
	
	<%-- 转发 --%>
	<jsp:forward page="forword.jsp">
		<jsp:param value="wawa" name="gname"/>
		<jsp:param value="300" name="gprice"/>
	</jsp:forward>
	
	
	
</body>
</html>