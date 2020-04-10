package Five.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Five.entity.User;


@WebServlet("/denglu")
public class SessionServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//用户名     admin 	密码     123 
		if(username.equals("admin") && password.equals("123")){
			HttpSession session = request.getSession();
			
			User user = new User(username, password);
			session.setAttribute("user", user);
		}
		
		response.sendRedirect("index.jsp");
	}
	
	
}
