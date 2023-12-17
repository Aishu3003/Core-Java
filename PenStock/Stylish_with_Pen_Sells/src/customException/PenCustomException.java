package customException;

public class PenCustomException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	public PenCustomException (String mesg)
	{
		super(mesg);
	}
	
}
