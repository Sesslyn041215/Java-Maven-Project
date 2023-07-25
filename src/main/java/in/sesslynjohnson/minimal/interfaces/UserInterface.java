package in.sesslynjohnson.minimal.interfaces;

import java.util.Set;

import in.sesslynjohnson.minimal.model.User;


public interface UserInterface extends Base<User>{
	
	public abstract	Set<User> findAll();
	public abstract User findById(int id);

}