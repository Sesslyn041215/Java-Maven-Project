package in.sesslynjohnson.minimal;

import java.util.Set;
import org.junit.jupiter.api.Test;
import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.service.UserService;

public class TestGetAllUser<E> {
	@Test
	public void getAllUser() {
		UserService userService = new UserService();
		Set<User> arr = userService.getAll();
		System.out.println(arr);
	}
	@Test
	public void getFindAll() {
		UserService userService = new UserService();
		User arr =  userService.findById(1);
	    System.out.println(arr);
	}
	
}

