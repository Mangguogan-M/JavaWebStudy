package Five.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testservlet")
public class ServletDemo extends HttpServlet{

	@Override
	public void init() throws ServletException {
			System.out.println("��ʼ��");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
			System.out.println("����");
	}

	@Override
	public void destroy() {
		System.out.println("����");
	}

	

}
