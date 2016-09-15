package day07;

class MainDemo
{
	public static void main(String[] args) // new String[0]
	{
		System.out.println(args);// [Ljava.lang.String;@c17164
		System.out.println(args.length);
		for (int x = 0; x < args.length; x++)
		{
			System.out.println(args[x]);
		}
	}
}
