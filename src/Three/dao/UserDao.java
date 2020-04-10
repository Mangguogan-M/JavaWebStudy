package Three.dao;

import java.util.List;

import Three.entity.User;

public interface UserDao {

	/**
	 * 添加用户信息
	 * 
	 * @param user
	 * @return
	 */
	public boolean add(User user);

	// 删除
	public boolean del(int id);

	// 列表查询
	public List<User> findAll();

}
