//: polymorphism/shape/Circle.java
package Thinking4.polymorphism.shape;

import static Thinking4.net.mindview.util.Print.print;

public class Circle extends Shape
{
	@Override
	public void draw()
	{
		print("Circle.draw()");
	}

	@Override
	public void erase()
	{
		print("Circle.erase()");
	}
} /// :~
