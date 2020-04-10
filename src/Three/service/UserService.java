package Three.service;

import java.util.List;

import Three.dao.UserDao;
import Three.entity.User;
import Three.factory.UserDaoFactory;

public class UserService {
	private UserDao dao;

	public UserService() {
		this.dao = UserDaoFactory.getUserDaoInstance();
	}

	public List<User> findAll() {
		return dao.findAll();
	}

}
