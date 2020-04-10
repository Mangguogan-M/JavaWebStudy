package Three.main;

import java.util.List;

import Three.entity.User;
import Three.service.UserService;

public class UserSystemMain {
	public static void main(String[] args) {

		UserService service = new UserService();

		List<User> list = service.findAll();
		for (User user : list) {
			System.out.println(user);
		}

	}
}
