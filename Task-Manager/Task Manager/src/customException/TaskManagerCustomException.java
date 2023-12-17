package customException;

public class TaskManagerCustomException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	public TaskManagerCustomException(String mesg)
	{
		super(mesg);
	}
}
