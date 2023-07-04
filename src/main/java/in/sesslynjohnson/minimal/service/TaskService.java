package in.sesslynjohnson.minimal.service;

import in.sesslynjohnson.minimal.dao.TaskDAO;
import in.sesslynjohnson.minimal.model.Task;
import in.sesslynjohnson.minimal.validation.TaskValidator;

public class TaskService {
     public Task[] getAll() {
    	 TaskDAO taskDao = new TaskDAO();
    	 Task[] taskList = taskDao.findAll();
 		for (int i = 0; i < taskList.length; i++){
 			System.out.println(taskList[i]);
 		}
 		return taskList;
     }
     
     public void create(Task newTask) throws Exception{
    	 TaskValidator.Validate(newTask);
    	 TaskDAO taskDao = new TaskDAO();
    	 taskDao.create(newTask);
     }
     
     public void update(Task updateTask) throws Exception {
    	TaskValidator.Validate(updateTask);
 		TaskDAO taskDao = new TaskDAO();
 		taskDao.update(2, updateTask);
 	}
 	
 	public void delete(int taskId) {
 		TaskDAO taskDao = new TaskDAO();
 		taskDao.delete(1);
 	}

 	public Task findById(int taskId) {
 		TaskDAO taskDao = new TaskDAO();
 		Task task = taskDao.findById(1);
 		return task;
 	}
 	
}
