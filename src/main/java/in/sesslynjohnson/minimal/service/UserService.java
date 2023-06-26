package in.sesslynjohnson.minimal.service;

import in.sesslynjohnson.minimal.dao.UserDAO;
import in.sesslynjohnson.minimal.model.User;

public class UserService {

	public User[] getAll() {
		
		UserDAO userDao = new UserDAO();
		
		User[] userList = userDao.findAll();

		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i]);
		}

		return userList;
	}

	public void create() {

		User newUser = new User();
		newUser.setId(151220);
		newUser.setFirstName("Sesslyn");
		newUser.setLastName("Johnson");
		newUser.setEmail("sesslyn2004@gmail.com");
		newUser.setPassword("Sess@1512");
		newUser.setActive(true);

		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}

}
