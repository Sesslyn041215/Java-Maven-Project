package in.sesslynjohnson.minimal.validation;

import java.lang.Exception;
import in.sesslynjohnson.minimal.model.User;

public class UserValidator {
	
    public static void Validate(User user) throws Exception{
    	if(user == null) {
    		throw new Exception("Invalid User Input");
    	}
    	if(user.getEmail() == null || " ".equals(user.getEmail().trim())) {
    		throw new Exception("Email cannot be null or empty");
    	}
    	if(user.getPassword() == null || " ".equals(user.getPassword().trim())) {
    		throw new Exception("Password cannot be null or empty");
    	}
    	if(user.getFirstName() == null || " ".equals(user.getFirstName().trim())) {
    		throw new Exception("FirstName cannot be null or empty");
    	}

    }
	
}
