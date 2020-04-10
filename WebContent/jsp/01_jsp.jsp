<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 声明区 -->
	<%! private int a = 10;
		public String show(){
			System.out.println(a);
			return "你好";
		}
	%>
	
	<!-- 小脚本/Java代码区 不能写方法 方法只能写在声明区  这只是输出在控制台上-->
	<% 
		show();
		System.out.println("这就是小脚本的作用");
	%>
	<!-- 表达式/输出表达式  输出的内容显示在页面上 
		输出内容是变量或者是有返回值的方法。
	-->
	<%= a %>
	<%= show() %>

</body>
</html>