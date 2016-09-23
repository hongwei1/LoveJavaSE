/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package day38.dsaj.primer;

/**
 * Our version of the classic Hello World.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class Universe
{

	public static void main(String[] args)
	{
		System.out.println("Hello Universe!");
		final int i = 2;
		int fact = fact(i);
		System.out.println(fact);
		int myFac = myFactorial(i);
		System.out.println(myFac);

		int elementData[] = { 1, 2, 3, 1, 0, 0, 0 };// 5+2-1=6
		int j = elementData[0];
		String aString = "1111";

	}

	/**
	 *
	 * f(n)=n*(n-1)*(n-2)*...*3*2*1
	 *
	 * @param i
	 * @return
	 */
	private static int myFactorial(int n)
	{
		int sum = 1;

		for (int i = n; i > 1; i--)
		{
			sum = sum * i;
		}
		return sum;
	}

	static int fact(int i)
	{
		if (i == 0)
		{
			return 1;
		}
		return i * fact(i - 1);
	}

}
