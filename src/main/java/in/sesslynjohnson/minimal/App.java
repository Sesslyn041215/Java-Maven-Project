package in.sesslynjohnson.minimal;

import in.sesslynjohnson.minimal.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UserService userService = new UserService();
       
       userService.create();
       
       userService.getAll();
       
	}

}
