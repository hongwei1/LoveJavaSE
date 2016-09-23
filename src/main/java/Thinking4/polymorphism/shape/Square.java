//: polymorphism/shape/Square.java
package Thinking4.polymorphism.shape;

import static Thinking4.net.mindview.util.Print.print;

public class Square extends Shape
{
	@Override
	public void draw()
	{
		print("Square.draw()");
	}

	@Override
	public void erase()
	{
		print("Square.erase()");
	}
} /// :~
