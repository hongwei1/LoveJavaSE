package Thinking4.initialization;

import Thinking4.net.mindview.util.Print;

class Bowl
{
	Bowl(int marker)
	{
		Print.print("Bowl(" + marker + ")");
	}

	void f1(int marker)
	{
		Print.print("f1(" + marker + ")");
	}
}

class Table
{
	static Bowl bowl1 = new Bowl(1);

	Table()
	{
		Print.print("Table()");
		Table.bowl2.f1(1);
	}

	void f2(int marker)
	{
		Print.print("f2(" + marker + ")");
	}

	static Bowl bowl2 = new Bowl(2);
}

class Cupboard
{
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);

	Cupboard()
	{
		Print.print("Cupboard()");
		Cupboard.bowl4.f1(2);
	}

	void f3(int marker)
	{
		Print.print("f3(" + marker + ")");
	}

	static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization
{
	public static void main(String[] args)
	{
		Print.print("Creating new Cupboard() in main");
		new Cupboard();
		Print.print("Creating new Cupboard() in main");
		new Cupboard();
		StaticInitialization.table.f2(1);
		StaticInitialization.cupboard.f3(1);
	}

	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
} /*
	 * Output: Bowl(1) Bowl(2) Table() f1(1) Bowl(4) Bowl(5) Bowl(3) Cupboard() f1(2) Creating new Cupboard() in main Bowl(3) Cupboard() f1(2) Creating new
	 * Cupboard() in main Bowl(3) Cupboard() f1(2) f2(1) f3(1)
	 */// :~
