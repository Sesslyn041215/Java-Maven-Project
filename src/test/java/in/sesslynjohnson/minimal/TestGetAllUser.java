package in.sesslynjohnson.minimal;

import java.util.Set;
import org.junit.jupiter.api.Test;
import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.service.UserService;

public class TestGetAllUser {
	
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
	
    @Test
	public void testUpdateUser() {
		UserService userService = new UserService();
        User newUser = new User();
		newUser.setFirstName("Ruby");
		newUser.setLastName("Johnson");
		userService.update(3, newUser);
	}
    
    @Test
   	public void testDeleteUser() {
   		UserService userService = new UserService();
        User newUser = new User();
   		userService.delete(7);
   	}
	
    @Test
	public void getFindByEmailId() {
		UserService userService = new UserService();
		User arr =  userService.findByEmail("sesslyn@gmail.com");
	    System.out.println(arr);
	}
}

