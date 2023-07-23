package in.sesslynjohnson.minimal.interfaces;

import java.util.Set;

import in.sesslynjohnson.minimal.model.UserEntity;
public interface Base {
	
	public abstract <T> T  findAll();
	public abstract void create();
	public abstract void update();
	public abstract void delete();
	public abstract <T> T findById(int id);

}

