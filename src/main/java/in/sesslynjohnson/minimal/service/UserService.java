package in.sesslynjohnson.minimal.service;

import in.sesslynjohnson.minimal.dao.UserDAO;
import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.validation.UserValidator;

public class UserService {

	public User[] getAll() {
		UserDAO userDao = new UserDAO();
		User[] userList = userDao.findAll();
		for (int i = 0; i < userList.length; i++){
			System.out.println(userList[i]);
		}
		return userList;
	}

	public void create(User newUser) throws Exception{
		UserValidator.Validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}

	public void update(User updateUser) throws Exception{
		UserValidator.Validate(updateUser);
		UserDAO userDao = new UserDAO();
		userDao.update(2, updateUser);
	}
	
	public void delete(int userId) {
		UserDAO userDao = new UserDAO();
		userDao.delete(1);
	}

	public User findById(int userId) {
		UserDAO userDao = new UserDAO();
		User user = userDao.findById(1);
		return user;
	}
	
	public User findByEmail(int userEmail) {
		UserDAO userDao = new UserDAO();
		User user = userDao.findByEmail("sesslyn2004@gmail.com");
		return user;
	}

}
