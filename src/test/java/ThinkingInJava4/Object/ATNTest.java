package ThinkingInJava4.Object;

// TIJ4 Chapter Object, Exericise 3, page 90
// object/ATNTest.java
// Find the code fragments involving ATypeName and turn them into a program
// that compiles and runs.

public class ATNTest
{
	public static void main(String[] args)
	{
		class ATypeName
		{
			int i;
			double d;
			boolean b;

			void show()
			{
				System.out.println(this.i);
				System.out.println(this.d);
				System.out.println(this.b);
			}
		}
		ATypeName a = new ATypeName();
		a.i = 3;
		a.d = 2.71828;
		a.b = false;
		a.show();
	}
}
