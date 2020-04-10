<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>这是demo02的页面</h1>

	<!-- 
		算术运算符
	 -->
	
	${6 + 8 }
	${9 - 8 }
	${2 * 4 }
	${9 / 3 }
	
	${'10' + '11' }
	<%-- ${'a' + 'b' } --%>
	
	
	<!-- 
		关系运算符
	 -->
	 <br>
	 <hr>
	 
	 ${8 gt 9 }
	 ${18>=9 }
	 ${5<9 }
	 ${9<=6 }
	 ${5 eq 5 }
	 ${5!=3 }
	 
	 <br>
	 <hr>
	 
	 <!-- 
	 	逻辑运算符
	  -->
	 ${false && false }
	 ${false and false }
	 ${true || false }
	 ${true or false }
	 ${!true }
	 ${not true }
	 
	 <br>
	 <hr>
	 <!-- 三元运算符 -->
	 
	 ${3>1 ? '大于1' : '小于1' }
	 
	 <br>
	 <hr>
	 <!-- 特殊运算符 -->
	 ${empty user }

</body>
</html>