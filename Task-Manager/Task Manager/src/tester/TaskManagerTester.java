package tester;

import java.util.Scanner;
import java.util.Map;
import java.time.LocalDate;
import java.util.HashMap;
import static validations.TaskManagerValidations.*;
import com.app.Task;
//import java.io.BufferedInputStream;
//import java.io.FileReade;

public class TaskManagerTester {

	public static void main(String[] args) {

		Map<Integer, Task> taskManager = new HashMap<>();
		boolean exit = true;

		taskManager.put(11, new Task("Read","Reading a book",LocalDate.parse("2023-10-25")));
		taskManager.put(12, new Task("Run","Running is good for Health",LocalDate.parse("2023-09-02")));
		taskManager.put(13, new Task("pick","pick up the phone",LocalDate.parse("2022-03-20")));
		taskManager.put(14, new Task("Handle","Handling an Exception",LocalDate.parse("2022-05-24")));
		taskManager.put(15, new Task("Paint","Painting a  wall",LocalDate.parse("2021-07-02")));
		taskManager.put(16, new Task("Draw","Drawing a picture",LocalDate.parse("2023-10-25")));
		taskManager.put(17, new Task("Write","Writing a book",LocalDate.parse("2020-03-20")));
		
		try (Scanner sc = new Scanner(System.in)) 
		{
			
			while (exit) {
				System.out.println(
						"\n\n1. Add New Task\n2. Delete a Task\n3. Update task staus\n4. Display all pending tasks\n5. Display all pending tasks for today"
								+ "\n6. display all tasks sorted by taskDate\n7. Display All Task\n8. Exit\n\n");

				
				
				try
				{
					
					switch (sc.nextInt()) {
					
					case 1:
						System.out.println("Enter Task Id : ");
						validId(sc.nextInt(),taskManager);
						
						System.out.println("Enter taskName : ");
						String task = sc.nextLine();
						
						System.out.println("Enter description : ");
						String desc = sc.nextLine();
						
						System.out.println("Enter date(YYYY-MM-DD) : ");
						String date = sc.next();
						
						validAllInputs(task,desc,date);
						
						break;
						
					case 2:
						System.out.println("Enter Task Id : ");
						deleteTask(sc.nextInt(),taskManager);			
						break;
						
					case 3:
						System.out.println("Enter Task Id :");
						int id = sc.nextInt();
						
						validId(id,taskManager);
						
						System.out.println("Enter task status(In Progress | completed ) : ");
						sc.nextLine();
						String s = sc.nextLine();
						
						updateTaskStatus(id,s,taskManager);
					
						break;
						
					case 4:
						displayAllPendigTasks(taskManager);
						break;
						
					case 5:
						displayTodayPendingTasks(taskManager);
						break;
						
					case 6:
						displaySortedTaskByDate(taskManager);
						break;
						
					case 7:
						displayAllTasks(taskManager);
						break;
						
					case 8:
						exit = false;
						break;
						
						
					}
				}
				
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}

		}

	}

}
