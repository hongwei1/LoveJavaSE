package ThinkingInJava4.strings;

//: strings/ReplacingStringTokenizer.java
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplacingStringTokenizer
{
	public static void main(String[] args)
	{
		String input = "But I'm not dead yet! I feel happy!";
		StringTokenizer stoke = new StringTokenizer(input);
		while (stoke.hasMoreElements())
		{
			System.out.print(stoke.nextToken() + " "); // 1 tokens
		}
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(input.split(" "))); // 2 regular
		System.out.println();
		Scanner scanner = new Scanner(input); // 3 scanner
		while (scanner.hasNext())
		{
			System.out.print(scanner.next() + " ");
		}
	}
} /*
	 * Output: But I'm not dead yet! I feel happy! [But, I'm, not, dead, yet!, I, feel, happy!] But I'm not dead yet! I feel happy!
	 */// :~
