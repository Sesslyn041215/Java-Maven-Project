package in.sesslynjohnson.minimal;

import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.service.UserService;

public class App {

	public static void main(String[] args) {
		try {
			UserService userService = new UserService();

			User newUser = new User();
			newUser.setId(1);
			newUser.setFirstName("Sesslyn");
			newUser.setLastName("Johnson");
			newUser.setEmail("sesslyn2004@gmail.com");
			newUser.setPassword("Sess@1512");
			newUser.setActive(true);

			userService.create(newUser);
			userService.getAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
}

}
