package in.sesslynjohnson.minimal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.service.UserService;

public class TestCreateUser {
	@Test
     public void testCreateUserWithValidataInput(){
    	UserService userService = new UserService();

 		User newUser = new User();
 		newUser.setId(1);
 		newUser.setFirstName("Sesslyn");
 		newUser.setLastName("Johnson");
 		newUser.setEmail("sesslyn2004@gmail.com");
 		newUser.setPassword("Sess@1512");
 		newUser.setActive(true);
        assertDoesNotThrow(()->{
    	   userService.create(newUser);
        });
 		
 		
     }
	@Test
	public void testCreateUserWithInvalidataInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(null);
		});
		String expectedMessage = "Invalid User Input";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithEmailNull() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(1);
		newUser.setFirstName("Sesslyn");
		newUser.setLastName("Johnson");
		newUser.setEmail(null);
		newUser.setPassword("Sess@1512");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testUserEmailWithEmailEmpty() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(1);
		newUser.setFirstName("Sesslyn");
		newUser.setLastName("Johnson");
		newUser.setEmail("");
		newUser.setPassword("Sess@1512");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
}
