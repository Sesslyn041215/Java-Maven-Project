package in.sesslynjohnson.minimal.interfaces;

import java.util.Set;
import in.sesslynjohnson.minimal.model.Task;
import in.sesslynjohnson.minimal.model.User;
public interface TaskInterface extends Base<Task>{
	public abstract	Set<Task> findAll();
	public abstract Task findById(int id);
}
