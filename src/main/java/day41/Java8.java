package day41;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Java8
{
	public static void main(String[] args)
	{

		Arrays.asList("a", "b", "d", "-------").forEach(e -> System.out.print(e));
		Arrays.asList("a", "b", "d", "-------").forEach((String e) -> System.out.print(e));
		Arrays.asList("a", "b", "d").forEach(e -> {
			System.out.print(e);
			System.out.print(e);
		});

		Receiver south = request -> "aaaa";// 2 south is a receiver!
		Sender north = south::respond;
		System.out.println(north);
		String send = north.send("aaa");

		final Car car = Car.create(Car::new);
		final List<Car> cars = Arrays.asList(car);

		// 1
		Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));

		// 2
		Arrays.asList("a", "b", "d").forEach(e -> {
			System.out.print(e);
			System.out.print(e);
		});

		// 3
		String separator = ",";
		Arrays.asList("a", "b", "d").forEach(e -> System.out.print(e + separator));

		// 4
		// Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		Arrays.asList("a", "b", "d").sort((e1, e2) -> {
			System.out.println(e1.compareTo(e2));
			return e1.compareTo(e2);
		});

		Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
		System.out.println(defaulable.notRequired());

		defaulable = DefaulableFactory.create(OverridableImpl::new);
		System.out.println(defaulable.notRequired());
	}

	@FunctionalInterface
	public interface FunctionalDefaultMethods
	{
		void method();

		default void defaultMethod()
		{
		}
	}

	private interface Defaulable
	{
		// Interfaces now allow default methods, the implementer may or
		// may not implement (override) them.
		default String notRequired()
		{
			return "Default implementation";
		}
	}

	@FunctionalInterface
	interface OnlyOne
	{
		void getName();

	}

	private static class DefaultableImpl implements Defaulable
	{
	}

	private static class OverridableImpl implements Defaulable
	{
		@Override
		public String notRequired()
		{
			return "Overridden implementation";
		}
	}

	private interface DefaulableFactory
	{
		// Interfaces now allow static methods
		// static Defaulable create(Supplier<Defaulable> supplier)
		// {
		// return supplier.get();
		// }
		static Defaulable create(Supplier<Defaulable> supplier)
		{
			return supplier.get();
		}
	}

	public static class Car
	{
		public static Car create(final Supplier<Car> supplier)
		{
			return supplier.get();
		}

		public static void collide(final Car car)
		{
			System.out.println("Collided " + car.toString());
		}

		public void follow(final Car another)
		{
			System.out.println("Following the " + another.toString());
		}

		public void repair()
		{
			System.out.println("Repaired " + toString());
		}
	}
}
