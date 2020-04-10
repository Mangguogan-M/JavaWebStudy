package Seven.listensers;

import java.awt.Event;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class listeners implements HttpSessionListener {

	private int userNumber = 0;

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		session.setAttribute("userNumber", userNumber++);

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		session.setAttribute("userNumber", userNumber--);

	}

}
