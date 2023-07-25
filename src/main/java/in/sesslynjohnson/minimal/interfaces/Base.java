package in.sesslynjohnson.minimal.interfaces;

import java.util.Set;

import in.sesslynjohnson.minimal.model.UserEntity;
public interface Base<T> {
	
	public abstract <T> T  findAll();
	public abstract void create(T object);
	public abstract void update(int id, T object);
	public abstract void delete(int id);
	public abstract <T> T findById(int id);
	
}

