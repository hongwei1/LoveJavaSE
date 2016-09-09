package ThinkingInJava4.Operators;

class Dog1
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

public class DogCompare
{
	public static void main(String[] args)
	{
		Dog1 spot = new Dog1();
		spot.setName("Spot");
		spot.setSays("Ruff!");
		Dog1 scruffy = new Dog1();
		scruffy.setName("Scruffy");
		scruffy.setSays("Wurf!");
		spot.showName();
		spot.speak();
		scruffy.showName();
		scruffy.speak();
		Dog1 butch = new Dog1();
		butch.setName("Butch");
		butch.setSays("Hello!");
		butch.showName();
		butch.speak();
		System.out.println("Comparison: ");
		System.out.println("spot == butch: " + (spot == butch));
		System.out.println("spot.equals(butch): " + spot.equals(butch));
		System.out.println("butch.equals(spot): " + butch.equals(spot));
		System.out.println("Now assign: spot = butch");
		spot = butch;
		System.out.println("Compare again: ");
		System.out.println("spot == butch: " + (spot == butch));
		System.out.println("spot.equals(butch): " + spot.equals(butch));
		System.out.println("butch.equals(spot): " + butch.equals(spot));
		System.out.println("Spot: ");
		spot.showName();
		spot.speak();
		System.out.println("Butch: ");
		butch.showName();
		butch.speak();

	}
}