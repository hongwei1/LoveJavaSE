package Thinking4.initialization;

import Thinking4.net.mindview.util.Print;

class Mug
{
	Mug(int marker)
	{
		Print.print("Mug(" + marker + ")");
	}

	void f(int marker)
	{
		Print.print("f(" + marker + ")");
	}
}

public class Mugs
{
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		Print.print("mug1 & mug2 initialized");
	}

	Mugs()
	{
		Print.print("Mugs()");
	}

	Mugs(int i)
	{
		Print.print("Mugs(int)");
	}

	public static void main(String[] args)
	{
		Print.print("Inside main()");
		new Mugs();
		Print.print("new Mugs() completed");
		new Mugs(1);
		Print.print("new Mugs(1) completed");
	}
} /*
	 * Output: Inside main() Mug(1) Mug(2) mug1 & mug2 initialized Mugs() new Mugs() completed Mug(1) Mug(2) mug1 & mug2 initialized Mugs(int) new Mugs(1)
	 * completed
	 */// :~
