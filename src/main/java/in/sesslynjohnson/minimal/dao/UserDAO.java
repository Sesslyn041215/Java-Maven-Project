package in.sesslynjohnson.minimal.dao;

import in.sesslynjohnson.minimal.model.User;

public class UserDAO {
	
   public User[] findAll() {
	   User[] userList = UserList.listOfUsers;
	   return userList;
   }
   
   public void create() {
	   User newUser = new User();
	   newUser.setId(15122004);
	   newUser.setFirstName("Sesslyn");
	   newUser.setLastName("Johnson");
	   newUser.setEmail("sesslyn2004@gmail.com");
	   newUser.setPassword("Sess@1512");
	   newUser.setActive(true);   
	   
	   UserList.listOfUsers[0] = newUser;
   }
   
   
}
