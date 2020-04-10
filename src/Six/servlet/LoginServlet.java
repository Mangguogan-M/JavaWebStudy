package Six.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Six.dao.UserDao;
import Six.dao.UserDaoImpl;
import Six.entity.User;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {

	UserDao dao = new UserDaoImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		User user = new User(null, username, password);
		User u = dao.login(user);

		if (u != null) {
			resp.sendRedirect("jsp4/list.jsp");
		} else {
			resp.sendRedirect("jsp4/login.jsp");
		}

	}

}
