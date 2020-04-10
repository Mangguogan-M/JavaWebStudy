package Five.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*<servlet>
	<servlet-name>ResponseServlet</servlet-name>
	<servlet-class>com.tl.servlet.ResponseServlet</servlet-class>
</servlet>

<servlet-mapping>
	<servlet-name>ResponseServlet</servlet-name>
	<url-pattern>/testresponse</url-pattern>
</servlet-mapping>*/

@WebServlet("/testresponse.jsp")
public class ResponseServlet extends HttpServlet{
	
	
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		
		// ������Ӧ��������
		response.setContentType("text/html;charset=UTF-8");

		
		PrintWriter out = response.getWriter();
		  out.write("\r\n");
		  out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
		  out.write("<html>\r\n");
		  out.write("<head>\r\n");
		  out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
		  out.write("<title>Insert title here</title>\r\n");
		  out.write("</head>\r\n");
		  out.write("<body>\r\n");
		  out.write("\t<!-- \r\n");
		  out.write("\t\taction��  �ύ�ĵ�ַ\r\n");
		  out.write("\t\tmethod���ύ��ʽ        get��post�����ύ��ʽ\r\n");
		  out.write("\t\t\r\n");
		  out.write("\t\tform��ֻ��ͨ�� submit �������ύ    button ����ʹ\r\n");
		  out.write("\t\t\r\n");
		  out.write("\t\tlogin?username=admin&password=123\r\n");
		  out.write("\t -->\r\n");
		  out.write("\t<form action=\"login\" method=\"get\">\r\n");
		  out.write("\t\t�û���:<input type=\"text\" name=\"username\"><br>\r\n");
		  out.write("\t\t����:<input type=\"text\" name=\"password\"><br>\r\n");
		  out.write("\t\t<input type=\"submit\" value=\"��¼\">\r\n");
		  out.write("\t</form>\r\n");
		  out.write("\r\n");
		  out.write("</body>\r\n");
		  out.write("</html>");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
