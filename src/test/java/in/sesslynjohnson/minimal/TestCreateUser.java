package in.sesslynjohnson.minimal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.sesslynjohnson.minimal.exception.ValidationException;
import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.service.UserService;

public class TestCreateUser {
	@Test
    public void testCreateUserWithValidataInput(){
    	UserService userService = new UserService();
 		User newUser = new User();
 		newUser.setFirstName("Ajun");
 		newUser.setLastName("drcuzz");
 		newUser.setEmail("ajun@gmail.com");
 		newUser.setPassword("ajun@2306");
        assertDoesNotThrow(()->{
    	   userService.create(newUser);
        });	
     }
	@Test
	public void testCreateUserWithInvalidataInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class,()->{
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
		
		Exception exception = assertThrows(ValidationException.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithEmailEmpty() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(1);
		newUser.setFirstName("Sesslyn");
		newUser.setLastName("Johnson");
		newUser.setEmail("");
		newUser.setPassword("Sess@1512");
		newUser.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithPasswordNull() {
		UserService userService = new UserService();
		User newUser = new User();
		newUser.setId(1);
		newUser.setFirstName("Sesslyn");
		newUser.setLastName("Johnson");
		newUser.setEmail("sesslyn2004@gmail.com");
		newUser.setPassword(null);
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Password cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}	
   @Test
	public void testCreateUserWithPasswordEmpty() {
		UserService userService = new UserService();
		User newUser = new User();
		newUser.setId(1);
		newUser.setFirstName("Sesslyn");
		newUser.setLastName("Johnson");
		newUser.setEmail("sesslyn2004@gmail.com");
		newUser.setPassword("");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "Password cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}	
    @Test
	public void testCreateUserWithFirstNameNull() {
		UserService userService = new UserService();
		User newUser = new User();
		newUser.setId(1);
		newUser.setFirstName(null);
		newUser.setLastName("Johnson");
		newUser.setEmail("sesslyn2004@gmail.com");
		newUser.setPassword("Sess@1512");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "FirstName cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}	
    @Test
	public void testCreateUserWithFirstNameEmpty() {
		UserService userService = new UserService();
		User newUser = new User();
		newUser.setId(1);
		newUser.setFirstName("");
		newUser.setLastName("Johnson");
		newUser.setEmail("sesslyn2004@gmail.com");
		newUser.setPassword("Sess@1512");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "FirstName cannot be null or empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}

}
