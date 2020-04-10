package Five.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Five.entity.User;

@WebServlet("/buy")
public class BuyServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		
		User user = (User) session.getAttribute("user");
		
		if(user == null){
			response.sendRedirect("jsp3.login.jsp");
		}else{
			response.sendRedirect("jsp3.buysuccess.jsp");
		}
		
	}

}
