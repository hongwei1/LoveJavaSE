package ThinkingInJava4.Operators;

class Dog
{
	String name;
	String says;

	void setName(String n)
	{
		this.name = n;
	}

	void setSays(String s)
	{
		this.says = s;
	}

	void showName()
	{
		System.out.println(this.name);
	}

	void speak()
	{
		System.out.println(this.says);
	}
}

public class DogTest
{
	public static void main(String[] args)
	{
		Dog spot = new Dog();
		spot.setName("Spot");
		spot.setSays("Ruff!");
		Dog scruffy = new Dog();
		scruffy.setName("Scruffy");
		scruffy.setSays("Wurf!");
		spot.showName();
		spot.speak();
		scruffy.showName();
		scruffy.speak();
	}
}