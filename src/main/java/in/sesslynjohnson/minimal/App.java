package in.sesslynjohnson.minimal;

import in.sesslynjohnson.minimal.model.Task;
import in.sesslynjohnson.minimal.model.User;
import in.sesslynjohnson.minimal.service.TaskService;
import in.sesslynjohnson.minimal.service.UserService;

public class App {

	public static void main(String[] args) {
		try {
			UserService userService = new UserService();

			User newUser = new User();
			newUser.setFirstName("Sesslyn");
			newUser.setLastName("Johnson");
			newUser.setId(15);
			newUser.setEmail("sesslyn2004@gmail.com");
			newUser.setPassword("Sess@1512");
			newUser.setActive(true);

			userService.create(newUser);
			userService.getAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		try {
			TaskService taskService = new TaskService();
	 		Task newTask = new Task();
	 		newTask.setId(1);
	 		newTask.setDueDate("2023-07-10");
	 		newTask.setName("Practice");
	 		newTask.setActive(true);

			taskService.create(newTask);
			taskService.getAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
}

}
