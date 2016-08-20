/**
 * 
StringBuilderTest.java
形式参数的变化
stringbuilder练习.bmp
string内存图.bmp
-------------------------------------------8种基本数据包装类--------------------------------------
WrapperDemo.java
	1 基本数据类型对象包装类--用于描述该对象的类就称为基本数据类型对象包装类。
		为了方便操作基本数据类型值，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作。
		Integer --  Contructor -- 2
		 	    --  Methods    -- 34
			byte		Byte
			short	   	Short
			int			Integer
			long		Long
			float		Float
			double		Double
			char		Character
			boolean		Boolean
	2 该包装对象主要用基本类型和字符串之间的转换。
		基本类型--->字符串 --2
			1,基本类型数值+""
			2,用String类中的静态方法valueOf(基本类型数值);
		字符串--->基本类型 --2
			1,静态方法 
				包装类中  xxx parseXxx("xxx类型的字符串");*****
					int parseInt("111");
					long parseLong("111");
					boolean parseBoolean("true");
					只有Character没有parse方法 
			2,非静态的方法 
				如果字符串被Integer进行对象的封装。
				可使用另一个非静态的方法，intValue();
				将一个Integer对象转成基本数据类型值。
	3 整数不同的进制体现。
		十进-->其他进制。
			toBinaryString
			toOctalString
			toHexString
		其他制-->十进制。
			parseInt("string",radix) 
	4 包装类的计算和比较
WrapperDemo2.java
	5 自动拆箱装箱
		jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
WrapperTest.java
-------------------------------------------集合API--------------------------------------
集合框架_1.txt
	1 集合类的由来：
		对象用于封装特有数据，对象多了需要存储，如果对象的个数不确定，就使用集合容器进行存储。
	2 集合特点：
		1，用于存储对象的容器。
		2，集合的长度是可变的。
		3，集合中不可以存储基本数据类型值。
		tips:数组和集合类同是容器，有何不同？
			数组虽然也可以存储对象，但长度是固定的；
			集合长度是可变的。
			数组中可以存储基本数据类型，集合只能存储对象。 
		
集合框架.bmp
	3 集合框架:集合容器因为内部的数据结构不同，有多种具体容器，不断的向上抽取，就形成了集合框架。
	框架的顶层Collection接口,常见方法：
		1，添加。
			boolean add(Object obj):
			boolean addAll(Collection coll):
		2，删除。
			boolean remove(object obj):
			boolean removeAll(Collection coll);
			void clear();
		3，判断：
			boolean contains(object obj):
			boolean containsAll(Colllection coll);
			boolean isEmpty():判断集合中是否有元素。 
		4，获取：
			int size():
			Iterator iterator():取出元素的方式：迭代器。
			该对象必须依赖于具体容器，因为每一个容器的数据结构都不同。
			所以该迭代器对象是在容器中进行内部实现的。
			对于使用容器者而言，具体的实现不重要，只要通过容器获取到该实现的迭代器的对象即可，
			也就是iterator方法。
			
			Iterator接口就是对所有的Collection容器进行元素取出的公共接口。
			其实就是抓娃娃游戏机中的夹子！
		5，其他：
			boolean retainAll(Collection coll);取交集。
			Object[] toArray():将集合转成数组。 
			
CollectionDemo.java
	practice all the basic methods.
IteratorDemo.java
	the iterator ： only 4 methods
	迭代器原理：集合框架.bmp
-------------------------------------------1List---------------------	
	Collection
		|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
		|--Set：元素不能重复,无序。
ListDemo.java	
	List:特有的常见方法：有一个共性特点就是都可以操作角标。
		1，添加
			void add(index,element);
			void add(index,collection);
		2，删除；
			Object remove(index):
		3，修改：
			Object set(index,element);
		4，获取：
			Object get(index);
			int indexOf(object);
			int lastIndexOf(object);
			List subList(from,to);
	list集合是可以完成对元素的增删改查。
	
	List:
		|--Vector:内部是数组数据结构，是同步的。增删，查询都很慢！
		|--ArrayList:内部是数组数据结构，是不同步的。替代了Vector。查询的速度快。
		|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。
		
	作业：
	1，自己去查文档演示Vector中的elements()方法。
	
	2，LinkedList中的，addFirst addLast getFirst，getLast  removeFirst removeLast。
		
	3，既然集合是存储对象的，请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
	并取出。将姓名和年龄打印出来。

ListDemo2.java
	listIterator ：增加功能 9 methods
		add(E e) ，hasPrevious() ，previous() ，	set(E e) 
Test16.txt
集合框架.bmp
 */
/**
 * <h2>10 Most Sought-after Skills in Web Development</h2>
 * 
 * @author zhanghongwei
 *
 */
package itcastday16;