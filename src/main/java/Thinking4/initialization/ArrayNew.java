package Thinking4.initialization;

//: initialization/ArrayNew.java
// Creating arrays with new.
import java.util.Arrays;
import java.util.Random;

import Thinking4.net.mindview.util.Print;

public class ArrayNew
{
	public static void main(String[] args)
	{
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		Print.print("length of a = " + a.length);
		Print.print(Arrays.toString(a));
	}
} /*
	 * Output: length of a = 18 [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	 */// :~
