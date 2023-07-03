package in.sesslynjohnson.minimal.dao;

import in.sesslynjohnson.minimal.model.User;

public class UserDAO {

	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}

	/**
	 * 
	 * @param newUser
	 */
	
	public void create(User newUser) {
		User[] arr = UserList.listOfUsers;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				arr[i] = newUser;
				break;
			}
		}
	}

	/**
	 * 
	 * @param id
	 * @param updateUser
	 */
	
	public void update(int id, User updateUser) {
		User[] arr = UserList.listOfUsers;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == id) {
				arr[i].setFirstName(updateUser.getFirstName());
				arr[i].setLastName(updateUser.getLastName());
				arr[i].setPassword(updateUser.getPassword());
				break;
			}

		}
	}
	
	public void delete(int id) {
		User[] arr = UserList.listOfUsers;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == id) {
				arr[i].setActive(false);
				break;
			}

		}
	}
	
	//Find by id
	public User findById(int userId) {
		User[] arr = UserList.listOfUsers;
		User userMatch = null;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getId() == userId) {
				userMatch = user;
				break;
			}
	   }
		return userMatch;
	}
	
	//Find by email
	public User findByEmail(String userEmail) {
		User[] arr = UserList.listOfUsers;
		User userMatch = null;
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				continue;
			}
			if (user.getEmail() == userEmail) {
				userMatch = user;
				break;
			}
	   }
		return userMatch;
	}
}
