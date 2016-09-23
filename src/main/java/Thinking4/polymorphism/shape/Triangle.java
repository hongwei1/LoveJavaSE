//: polymorphism/shape/Triangle.java
package Thinking4.polymorphism.shape;

import static Thinking4.net.mindview.util.Print.print;

public class Triangle extends Shape
{
	@Override
	public void draw()
	{
		print("Triangle.draw()");
	}

	@Override
	public void erase()
	{
		print("Triangle.erase()");
	}
} /// :~
