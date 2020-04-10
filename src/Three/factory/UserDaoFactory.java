package Three.factory;

import java.util.ResourceBundle;

import Three.dao.UserDao;

public class UserDaoFactory {

	public static UserDao getUserDaoInstance() {
		UserDao dao = null;
		try {
			//
			ResourceBundle rb = ResourceBundle.getBundle("Three.factory.user");
			String str = rb.getString("UserDaoInfo");

			Class<UserDao> forName = (Class<UserDao>) Class.forName(str);
			dao = forName.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}

}
