package ThinkingInJava4.exceptions;

//: exceptions/FinallyWorks.java
// The finally clause is always executed.

class ThreeException extends Exception
{
}

public class FinallyWorks
{
	static int count = 0;

	public static void main(String[] args)
	{
		while (true)
		{
			try
			{
				// Post-increment is zero first time:
				if (count++ == 0)
				{
					throw new ThreeException();
				}
				System.out.println("No exception " + count);
			}
			catch (ThreeException e)
			{
				System.out.println("ThreeException");
			}
			finally
			{
				System.out.println("In finally clause" + count);
				if (count == 4)
				{
					break; // out of "while"
				}
			}
		}
	}
} /*
	 * Output: ThreeException In finally clause No exception In finally clause
	 */// :~
