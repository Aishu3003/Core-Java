package utility;
import java.util.Comparator;
import com.app.Task;

public class SortTaskByDate implements Comparator<Task>
{

	public int compare(Task t1, Task t2)
	{
		if(t1.getTaskDate().isBefore(t2.getTaskDate()))
			return 1;
		
		else if(t1.getTaskDate().isBefore(t2.getTaskDate()))
			return -1;
		
		return 0;
	}
}
