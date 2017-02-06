package day41;

import java.io.File;
import java.io.IOException;
//1 Java 8新特性终极指南  http://www.importnew.com/11908.html#intro
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaImportnew
{
	public static void main(String[] args) throws ScriptException
	{
		// 2.1 Lambda表达式与Functional接口
		Arrays.asList("a", "b", "d", "-------").forEach(e -> System.out.print(e));
		Arrays.asList("a", "b", "d", "-------").forEach((String e) -> System.out.print(e));
		Arrays.asList("a", "b", "d").forEach(e -> {
			System.out.print(e);
			System.out.print(e);
		});

		String separator = ",";
		Arrays.asList("a", "b", "d").forEach((String e) -> System.out.print(e + separator));

		final String separator1 = ",";
		Arrays.asList("a", "b", "d").forEach((String e) -> System.out.print(e + separator1));

		Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));
		Arrays.asList("a", "b", "d").sort((e1, e2) -> {
			int result = e1.compareTo(e2);
			return result;
		});

		// public interface Functional

		// 2.2 接口的默认方法与静态方法
		System.out.println();
		Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
		System.out.println(defaulable.notRequired());

		defaulable = DefaulableFactory.create(OverridableImpl::new);
		System.out.println(defaulable.notRequired());

		// 2.3 方法引用
		// 1构造器引用 Class::new
		final Car car = Car.create(Car::new);
		final List<Car> cars = Arrays.asList(car);
		// 2静态方法引用 Class::static_method
		cars.forEach(Car::collide);
		// 3 特定类的任意对象的方法引用 Class::method
		cars.forEach(Car::repair);
		// 4 特定对象的方法引用 instance::method
		final Car police = Car.create(Car::new);
		cars.forEach(police::follow);

		// 2.4 重复注解
		for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class))
		{
			System.out.println(filter.value());
		}

		// 4.1Optional
		// 4.1.1两个小例子来演示如何使用Optional类：一个允许为空值，一个不允许为空值
		Optional<String> fullName = Optional.ofNullable(null);
		System.out.println("Full Name is set? " + fullName.isPresent());
		System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));// orElseGet 接受回调函数
		System.out.println("Full Name: " + fullName.orElse("[none]"));// 接受参数
		// map()函数对当前Optional的值进行转化，然后返回一个新的Optional实例。
		System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

		Optional<String> firstName = Optional.of("Tom");
		System.out.println("First Name is set? " + firstName.isPresent());
		System.out.println("First Name: " + firstName.orElseGet(() -> "[none]"));
		System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
		System.out.println(firstName.map(s -> "Hey " + s + "!").orElseGet(() -> "Hey Stranger!"));
		System.out.println();

		// 4.2 day41.Streams.main(String[])

		// 4.3
		// Get the system clock as UTC offset
		final Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());

		// Get the local date and local time
		final LocalDate date = LocalDate.now();
		final LocalDate dateFromClock = LocalDate.now(clock);

		System.out.println(date);
		System.out.println(dateFromClock);

		// Get the local date and local time
		final LocalTime time = LocalTime.now();
		final LocalTime timeFromClock = LocalTime.now(clock);

		System.out.println(time);
		System.out.println(timeFromClock);

		// Get the local date/time
		final LocalDateTime datetime = LocalDateTime.now();
		final LocalDateTime datetimeFromClock = LocalDateTime.now(clock);

		System.out.println(datetime);
		System.out.println(datetimeFromClock);

		// Get the zoned date/time
		final ZonedDateTime zonedDatetime = ZonedDateTime.now();
		final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now(clock);
		final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime
				.now(ZoneId.of("America/Los_Angeles"));

		System.out.println(zonedDatetime);
		System.out.println(zonedDatetimeFromClock);
		System.out.println(zonedDatetimeFromZone);

		// 4.3.2
		// Get duration between two dates
		final LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 16, 0, 0, 0);
		final LocalDateTime to = LocalDateTime.of(2015, Month.APRIL, 16, 23, 59, 59);

		final Duration duration = Duration.between(from, to);
		System.out.println("Duration in days: " + duration.toDays());
		System.out.println("Duration in hours: " + duration.toHours());

		// 4.4 JavaScript引擎Nashorn
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");

		System.out.println(engine.getClass().getName());
		System.out.println("Result:" + engine.eval("function f() { return 1; }; f() + 1;"));

		// 4.5 Base64

		// 4.6 并行（parallel）数组
		//
		long[] arrayOfLong = new long[20000];

		// 使用了parallelSetAll()方法来对一个有20000个元素的数组进行随机赋值
		Arrays.parallelSetAll(arrayOfLong, index -> ThreadLocalRandom.current().nextInt(1000000));
		Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// 然后，调用parallelSort方法
		Arrays.parallelSort(arrayOfLong);
		// 这个程序首先打印出前10个元素的值，之后对整个数组排序。
		Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + " "));
		System.out.println();

	}

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filters
	{
		Filter[] value();
	}

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Filters.class)
	public @interface Filter
	{
		String value();
	};

	@Filter("filter1")
	@Filter("filter2")
	public interface Filterable
	{
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

	@FunctionalInterface // 默认方法与静态方法并不影响函数式接口的契约
	public interface Functional
	{
		void method();
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
		static Defaulable create(Supplier<Defaulable> supplier) // TODO ?1Supplier 是什么类??
		{
			return supplier.get();
		}
	}

}

class Streams
{
	public static void main(String[] args) throws IOException
	{
		// 4.2
		final Collection<Task> tasks = Arrays.asList( //
				new Task(Status.OPEN, 5), //
				new Task(Status.OPEN, 13), //
				new Task(Status.CLOSED, 8) //
		);
		// Calculate total points of all active tasks using sum()
		// Calculate total points of all active tasks using sum()
		final long totalPointsOfOpenTasks = tasks //
				.stream() // 第一，task集合被转换化为其相应的stream表示
				.filter(task -> task.getStatus() == Status.OPEN) // 然后，filter操作过滤掉状态为CLOSED的task。:遍历元素时会产生了一个新的stream对象
				.mapToInt(Task::getPoints) // 下一步，mapToInt操作通过Task::getPoints这种方式调用每个task实例的getPoints方法把Task的stream转化为Integer的stream。
				.sum(); // 最后，用sum函数把所有的分数加起来，得到最终的结果。

		System.out.println("Total points: " + totalPointsOfOpenTasks);

		// Calculate total points of all tasks //
		final double totalPoints = tasks //
				.stream() //
				.parallel() //
				.map(task -> task.getPoints()) // or map( Task::getPoints )
				.reduce(0, Integer::sum); //

		System.out.println("Total points (all tasks): " + totalPoints);

		// Group tasks by their status //
		// 经常会有这个一个需求：我们需要按照某种准则来对集合中的元素进行分组
		final Map<Status, List<Task>> map = tasks //
				.stream() //
				.collect(Collectors.groupingBy(Task::getStatus)); //
		System.out.println(map);

		// Calculate the weight of each tasks (as percent of total points)
		// 计算整个集合中每个task分数（或权重）的平均值来结束task的例子
		final Collection<String> result = tasks//
				.stream() // Stream< String >
				.mapToInt(Task::getPoints) // IntStream
				.asLongStream() // LongStream
				.mapToDouble(points -> points / totalPoints) // DoubleStream
				.boxed() // Stream< Double >
				.mapToLong(weigth -> (long) (weigth * 100)) // LongStream
				.mapToObj(percentage -> percentage + "%") // Stream< String>
				.collect(Collectors.toList()); // List< String >

		System.out.println(result);

		// 从文本文件中逐行读取数据这样典型的I/O操作也很适合用Stream API来处理。
		final Path path = new File("src/main/java/day41/JavaImportnew.java").toPath();
		try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8))
		{

			// 一个stream对象调用onClose方法会返回一个在原有功能基础上新增了关闭功能的stream对
			lines.onClose(() -> System.out.println("Done!")).forEach(System.out::println);
		}

	}

	private enum Status
	{
		OPEN, CLOSED
	};

	private static final class Task
	{
		private final Status status;
		private final Integer points;

		Task(final Status status, final Integer points)
		{
			this.status = status;
			this.points = points;
		}

		public Integer getPoints()
		{
			return points;
		}

		public Status getStatus()
		{
			return status;
		}

		@Override
		public String toString()
		{
			return String.format("[%s, %d]", status, points);
		}
	}
}

class Base64s
{
	public static void main(String[] args)
	{
		final String text = "Base64 finally in Java 8!";

		final String encoded = Base64.getEncoder()
				.encodeToString(text.getBytes(StandardCharsets.UTF_8));
		System.out.println(encoded);

		final String decoded = new String(Base64.getDecoder().decode(encoded),
				StandardCharsets.UTF_8);
		System.out.println(decoded);
	}
}