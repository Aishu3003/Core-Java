package validations;

import java.util.Map;
import java.time.LocalDate;
import java.util.HashMap;
import customException.TaskManagerCustomException;
import com.app.Task;
import java.time.format.DateTimeParseException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import utility.SortTaskByDate;

public class TaskManagerValidations 
{
	public static void validId(int taskId,Map<Integer,Task> taskManager) throws TaskManagerCustomException
	{
		if(!taskManager.containsKey(taskId))
			throw new TaskManagerCustomException("Invalid task id! Try Again...");
		
		
	}
	
	public static LocalDate validAndParseDate(String date) throws DateTimeParseException
	{
		return LocalDate.parse(date);
	}
	
	public static Task validAllInputs(String taskName, String description, String taskDate)throws TaskManagerCustomException
	{
		LocalDate tdate = validAndParseDate(taskDate);
		return new Task(taskName,description,tdate);
	}
	
	public static void deleteTask(int taskId, Map<Integer,Task> taskManager) throws TaskManagerCustomException
	{
		validId(taskId,taskManager);
		if(taskManager.containsKey(taskId))
			taskManager.remove(taskId);
		/*
		 * Iterator<Map.Entry<Integer, Task>> itr = taskManager.entrySet().iterator();
		 * 
		 * while(itr.hasNext()) { Task t = itr.next().getValue();
		 * 
		 * if() itr.remove(); }
		 */
		
		System.out.println("Successfully task deleted!");
		
	}
	
	public static void updateTaskStatus(int taskId,String status, Map<Integer,Task> taskManager) throws TaskManagerCustomException
	{
		validId(taskId,taskManager);
		if(taskManager.containsKey(taskId))
		{
			Task t = taskManager.get(taskId);
			t.setStatus(status);
		}
		
		System.out.println("Work Status Updated!!");
		
		
	}
	
	
	public static void displayAllPendigTasks( Map<Integer,Task> taskManager ) throws TaskManagerCustomException
	{
		for(Map.Entry<Integer,Task> entry : taskManager.entrySet())
		{
			if(entry.getValue().getStatus().equalsIgnoreCase("pending"))
				System.out.println("Id : "+entry.getKey()+" "+entry.getValue());
		}
	}
	
	public static void displayTodayPendingTasks( Map<Integer,Task> taskManager ) throws TaskManagerCustomException
	{
		
		for(Map.Entry<Integer,Task> entry : taskManager.entrySet())
		{
			if(entry.getValue().getTaskDate().equals(LocalDate.now()))
				System.out.println("Id : "+entry.getKey()+" "+entry.getValue());
		}
	}
	
	
	public static void displaySortedTaskByDate( Map<Integer,Task> taskManager ) throws TaskManagerCustomException
	{
		List<Task> lTask = new ArrayList<>(taskManager.values());
		
		Collections.sort(lTask,new SortTaskByDate());
		
		for(Map.Entry<Integer,Task> entry : taskManager.entrySet())
		{
			System.out.println("Id : "+entry.getKey()+" "+entry.getValue());

		}
	}
	
	public static void displayAllTasks( Map<Integer,Task> taskManager ) throws TaskManagerCustomException
	{
		for(Map.Entry<Integer,Task> entry : taskManager.entrySet())
		{
			System.out.println("Id : "+entry.getKey()+" "+entry.getValue());

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
