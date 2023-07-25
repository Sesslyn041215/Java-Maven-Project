package in.sesslynjohnson.minimal.service;

import java.time.format.DateTimeParseException;
import in.sesslynjohnson.minimal.dao.TaskDAO;
import in.sesslynjohnson.minimal.exception.ValidationException;
import in.sesslynjohnson.minimal.model.Task;
import in.sesslynjohnson.minimal.validation.TaskValidator;
import java.util.Set;

public class TaskService {
	public Set<Task> getAll() {
		TaskDAO taskDao = new TaskDAO();
		Set<Task> taskList = taskDao.findAll();
		for (Task task : taskList) {
			System.out.println(task);
		}
		return taskList;
	}


	public void create(Task newTask) throws Exception {
		try {
			TaskValidator.Validate(newTask);
		} catch (DateTimeParseException e) {
			throw new ValidationException("Invalid date format or Invalid Date");
		}

		TaskValidator.Validate(newTask);
		TaskDAO taskDao = new TaskDAO();
		taskDao.create(newTask);
	}

	public void update(int id, Task updateTask) throws Exception {
		TaskValidator.Validate(updateTask);
		TaskDAO taskDao = new TaskDAO();
		taskDao.update(id, updateTask);
	}
	
	
	public void delete(int taskId) {
		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(1);
	}

	public void findById(int taskId) {
		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(taskId);
	}

}
