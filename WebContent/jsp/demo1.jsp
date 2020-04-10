<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		内置对象于作用域的使用
	 -->
	<%
		//四大作用域
		request.setAttribute("msg", "request的信息");
		session.setAttribute("msg", "session的信息");
		pageContext.setAttribute("msg", "pagecontext的信息");
		application.setAttribute("msg", "application的信息");
	%>

	<!-- 作用域取值 -->
	<%=request.getAttribute("msg")%>
	<%=session.getAttribute("msg")%>
	<%=pageContext.getAttribute("msg")%>
	<%=application.getAttribute("msg")%>
	
	<!-- 第二种取值方式  EL表达式 -->
	<!-- 取值方式是从范围小的开始取  依次 -->
	${msg }
	
	<!-- 转发 -->
	<%
		request.getRequestDispatcher("forward.jsp").forward(request, response);
	%>
	
	
	<!-- 重定向 -->
	<%
		response.sendRedirect("redirect.jsp");
	%>
	

</body>
</html>