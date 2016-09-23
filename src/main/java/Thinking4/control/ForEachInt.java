package Thinking4.control;

import thinkinginjava4.net.mindview.util.Print;
import thinkinginjava4.net.mindview.util.Range;

public class ForEachInt
{
	public static void main(String[] args)
	{
		for (int i : Range.range(10))
		{
			Print.printnb(i + " ");
		}
		Print.print();
		for (int i : Range.range(5, 10))
		{
			Print.printnb(i + " ");
		}
		Print.print();
		for (int i : Range.range(5, 20, 3))
		{
			Print.printnb(i + " ");
		}
		Print.print();
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9 5 6 7 8 9 5 8 11 14 17
	 */// :~
