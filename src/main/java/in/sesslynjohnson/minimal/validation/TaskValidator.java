package in.sesslynjohnson.minimal.validation;

import java.lang.Exception;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import in.sesslynjohnson.minimal.exception.ValidationException;
import in.sesslynjohnson.minimal.model.Task;
import in.sesslynjohnson.minimal.util.StringUtil;

public class TaskValidator {
  
    public static void Validate(Task task) throws Exception {
        if (task == null) {
            throw new ValidationException("Invalid Task Input");
        }
        
        StringUtil.rejectIfInvalidString(task.getName(), "Name");
        StringUtil.rejectIfInvalidString(task.getDueDate(), "DueDate");
        
        String date = task.getDueDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dueDate = LocalDate.parse(date, formatter);
        
        LocalDate currentDate = LocalDate.now();
        if (dueDate.equals(currentDate) || dueDate.isBefore(currentDate)) {
            throw new ValidationException("Due date should be in the future");
        }
		
    }
}
