package in.sesslynjohnson.minimal.service;

import in.sesslynjohnson.minimal.dao.UserDAO;
import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.validation.UserValidator;

public class UserService {

	public User[] getAll() {

		UserDAO userDao = new UserDAO();

		User[] userList = userDao.findAll();

		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i]);
		}

		return userList;
	}

	public void create(User newUser) throws Exception{
		UserValidator.Validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}

	public void update() {
		User updateUser = new User();
		UserDAO userDao = new UserDAO();
		userDao.update(2, updateUser);

	}

}
