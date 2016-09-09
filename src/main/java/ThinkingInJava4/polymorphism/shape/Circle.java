//: polymorphism/shape/Circle.java
package ThinkingInJava4.polymorphism.shape;

import static ThinkingInJava4.net.mindview.util.Print.print;

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
