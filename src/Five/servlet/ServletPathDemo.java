package Five.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//request.getServletPath();
public class ServletPathDemo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getServletPath();
		System.out.println(path);
		
		if("/register.do".equals(path)){
			//ע�� register.do
			System.out.println("��ִ̨��ע����ز���");
		}else if("/login.do".equals(path)){
			//��¼  login.do
			System.out.println("��ִ̨�е�¼��ز���");
		}else if("/delete.do".equals(path)){
			//ɾ�� delete.do
			System.out.println("��ִ̨��ɾ����ز���");
		}
	}

}
