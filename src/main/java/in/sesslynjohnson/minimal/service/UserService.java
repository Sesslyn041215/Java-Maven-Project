package in.sesslynjohnson.minimal.service;

import java.util.Set;
import in.sesslynjohnson.minimal.dao.UserDAO;
import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.validation.UserValidator;

public class UserService {
	public Set<User> getAll() {
		UserDAO userDao = new UserDAO();
		Set<User> userList = userDao.findAll();
		for (User user : userList) {
			System.out.println(user);
		}
		return userList;
	}

	public void create(User newUser) throws Exception {
		UserValidator.Validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}
	
	public void update(int id, User updatedUser) {
		updatedUser.setFirstName("Sess");
		updatedUser.setLastName("Ruby");
		updatedUser.setPassword("Pappu@1215");
	
		UserDAO userDao = new UserDAO();
		userDao.update(id, updatedUser);
		
	}
	
	public void delete(int userId) {
		UserDAO userDao = new UserDAO();
		userDao.delete(userId);
	}
	
	public User findById(int userId) {
		UserDAO userDao = new UserDAO();
		return userDao.findById(userId);	
	}
//	
//	public User findByEmail(String userEmail) {
//		UserDAO userDao = new UserDAO();
//		userDao.findByEmail(userEmail);
//	}
}
