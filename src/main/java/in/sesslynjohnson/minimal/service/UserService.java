package in.sesslynjohnson.minimal.service;

import in.sesslynjohnson.minimal.dao.UserDAO;
import in.sesslynjohnson.minimal.model.User;

public class UserService {

	public User[] getAll() {
          UserDAO userDao = new UserDAO();
          User[] userList = userDao.findAll();
          for(int i=0; i<userList.length; i++) {
        	  System.out.println(userList[i]);
          }
         
          return userList;
	}
	
}
