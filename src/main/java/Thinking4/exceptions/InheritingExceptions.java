package Thinking4.exceptions;

//: exceptions/InheritingExceptions.java
// Creating your own exceptions.

class SimpleException extends Exception
{
	public SimpleException()
	{
		super();
	}

	public SimpleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SimpleException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public SimpleException(String message)
	{
		super(message);
	}

	public SimpleException(Throwable cause)
	{
		super(cause);
	}

	private static final long serialVersionUID = 1L;
}

public class InheritingExceptions
{
	public void f() throws SimpleException
	{
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args)
	{
		InheritingExceptions sed = new InheritingExceptions();
		try
		{
			sed.f();
		}
		catch (SimpleException e)
		{
			System.out.println("Caught it! :::");
			System.err.println("Caught it! :::");
		}
	}
} /*
	 * Output: Throw SimpleException from f() Caught it!
	 */// :~
