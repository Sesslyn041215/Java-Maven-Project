package in.sesslynjohnson.minimal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.sesslynjohnson.minimal.exception.ValidationException;
import in.sesslynjohnson.minimal.model.Task;
import in.sesslynjohnson.minimal.service.TaskService;

public class TestCreateTask {
	@Test
    public void testCreateTaskWithValidataInput() {
        TaskService taskService = new TaskService();
        Task newTask = new Task();
        newTask.setId(1);
        newTask.setDueDate("2023-07-10");
        newTask.setName("Practice");
        newTask.setActive(true);

        assertDoesNotThrow(() -> {
            taskService.create(newTask);
        });
    }
	@Test
	public void testCreateTaskWithInvalidataInput() {
		TaskService taskService = new TaskService();
		Exception exception = assertThrows(ValidationException.class,()->{
			taskService.create(null);
		});
		String expectedMessage = "Invalid Task Input";
		String actualMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(actualMessage));
	}
	 @Test
		public void testCreateTaskWithNameNull() {
		 TaskService taskService = new TaskService();
		    Task newTask = new Task();
	 		newTask.setId(1);
	 		newTask.setDueDate("2023-07-10");
	 		newTask.setName(null);
	 		newTask.setActive(true);
			
			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "Name cannot be null or empty";
			String actualMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(actualMessage));
		}	
	    @Test
		public void testCreateUserWithFirstNameEmpty() {
	    	TaskService taskService = new TaskService();
	    	Task newTask = new Task();
	 		newTask.setId(1);
	 		newTask.setDueDate("2023-07-10");
	 		newTask.setName("");
	 		newTask.setActive(true);
			
			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "Name cannot be null or empty";
			String actualMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(actualMessage));
		}
	    @Test
		public void testCreateTaskWithDueDateNull() {
		 TaskService taskService = new TaskService();
		    Task newTask = new Task();
	 		newTask.setId(1);
	 		newTask.setDueDate(null);
	 		newTask.setName("Practice");
	 		newTask.setActive(true);
			
			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "DueDate cannot be null or empty";
			String actualMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(actualMessage));
		}	
	    @Test
		public void testCreateUserWithDueDateEmpty() {
	    	TaskService taskService = new TaskService();
	    	Task newTask = new Task();
	 		newTask.setId(1);
	 		newTask.setDueDate("");
	 		newTask.setName("Practice");
	 		newTask.setActive(true);
			
			Exception exception = assertThrows(Exception.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "DueDate cannot be null or empty";
			String actualMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(actualMessage));
		}
}
