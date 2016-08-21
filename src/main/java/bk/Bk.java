//-- wht
/**
<pre>
//BK --day01 概述
	JAVA_HOME=F:\jdk1.6.0_01
	path=%JAVA_HOME%\bin;%path%
	%path%：动态获取path环境变量的值。
	%JAVA_HOME%：动态获取名称为JAVA_HOME环境变量的值。

	dir : 列出当前目录下的文件以及文件夹
	md : 创建目录
	rd : 删除目录
	cd : 进入指定目录
	cd.. : 退回到上一级目录
	cd/ : 退回到根目录
	del : 删除文件
	exit : 推出dos命令行

//BK --day02 关键字 注释 变量 运算符
0 Note.java 		 -- p1--P19   I took the notes by going though the PPT.
1 Demo.java          -- P8 	      03-Java语言基础(注释).avi
2 VarDemo.java       -- P10--P15  10-Java语言基础(变量的基本演示).avi
3 VarDemo2.java      -- P15       11-Java语言基础(类型提升&强制转换).avi
4 OperateDemo.java   -- P17-P18   arithmetic operator eg: ++
5 OperateDemo2.java  -- P19       assignment operator

//BK --day03 1语句 if swith
0 Note.java
1 OperateDemo3.java -- P20--P22 compare and logic operator
2 OperateDemo4.java -- P23 Bit operator
3 OperateTest.java  -- P25 05-Java语言基础(位运算符练习-1).avi
4 OperateTest2.java -- P25 06-Java语言基础(位运算符练习-2).avi
5 OperateDemo5.java -- P26 07-Java语言基础(三元运算符).avi

2.6 程序流程控制
6 IfDemo.java  -- P28
7 IfDemo2.java -- P28
8 IfDemo3.java -- P28
9 IfTest.java
10 IfTest2.java

11 SwitchDemo.java
12 SwitchTest.java
13 if和switch.java

//BK --day03 2While
14 WhileDemo.java
15 DoWhileDemo.java
16 WhileTest.java  -- P32 20-Java语言基础(while练习-累加思想).avi
17 WhileTest2.java -- 21-Java语言基础(while练习-计数器思想).avi


//BK --day04 1For
18 ForDemo.java -- P33  22-Java语言基础(语句-for).avi
19 ForTest.java

1 ForForDemo.java        01-Java语言基础(语句-For循环嵌套).avi -大圈套小圈思想。
2 ForForTest.java        02-Java语言基础(语句-For循环嵌套练习).avi
3 ForFor99.java          03-Java语言基础(语句-For循环嵌套练习2).avi
4 Demo99.java            04-Java语言基础(语句-For循环嵌套练习-99乘法表&转义字符).avi
5 ForForTest2.java       05-Java语言基础(语句-For循环嵌套练习3).avi
6 BreakContinueDemo.java 06-Java语言基础(语句-break&continue).avi
	break:跳出。
		break作用的范围：要么是switch语句，要么是循环语句。
		记住：当break语句单独存在时，下面不要定义其他语句，因为执行不到。
			break跳出所在的当前循环。
			如果出现了循环嵌套，break想要跳出指定的循环，可以通过标号来完成。
	continue:继续。
		作用的范围：循环结构。
		continue：结束本次循环，继续下次循环。
		如果continue单独存在时，下面不要有任何语句，因为执行不到。

//BK --day04 2函数
7 FunctionDemo.java
	 定义函数的格式：
		 修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数2，...)
		 {
		 		执行语句;
		 		return 返回值;
		 }
	 特殊情况： 功能没有具体的返回值。
		 这时return的后面直接用分号结束。 返回值类型怎么体现呢？因为没有具体值，所以不可以写具体的数据类型。
		 在java中只能用一个关键字来表示这种情况。关键字是：void.
	 总结：没有具体返回值时，返回值类型用void来表示。
	 注意：如果返回值类型是void，那么函数中的return语句可以省略不写。
	 tips： 函数中只能调用函数，不可以在函数内部定义函数。
8 FunctionDemo2.java
9 FunctionDemo3.java
10 FunctionDemo4.java

//BK --day04 3Array
ArrayDemo.java
	1,内存的划分：--5
 		1，寄存器。
 		2，本地方法区。
 		3，方法区。
 		4，栈内存。 存储的都是局部变量,而且变量所属的作用域一旦结束，该变量就自动释放。
 		5，堆内存。 存储是数组和对象(其实数组就是对象) 凡是new建立在堆中。
 	2，堆内存特点：
 		1, 存储是数组和对象(其实数组就是对象) 凡是new建立在堆中。
 		2，每一个实体都有首地址值。
 		3，堆内存中的每一个变量都有默认初始化值，根据类型的不同而不同。
 				整数		 : 0
 				小数		 : 0.0或者0.0f，
 				boolean  : false
 				char 	 : '\u0000'
 				Reference: null
 		4，垃圾回收机制。
	3，局部代码块。限定局部变量的生命周期。

ArrayDemo2.java
	4，数组异常 -2
		1 System.out.println(arr[3]);   //ArrayIndexOutOfBoundsException:
		2 System.out.println(arr[1000]);//NullPointerException

数组内存图.bmp
	5，stack and heap structure

ArrayDemo3.java
 	6，定义数组格式--2
	 	格式1--需要一个容器，但是不明确容器的具体数据。
			int[] arr = new int[3];
		格式2--需要一个容器，存储已知的具体数据。
			int[] arr = new int[]{89,34,270,17};
 	7 数组的操作
 		对数组操作最基本的动作就是存和取。 核心思想：就是对角标的操作。

ArrayDemo4.java //BK --day05 Array 1最值 排序 折半查找 反转 查表法
	8 数组的算法
		冒泡排序.bmp
		选择排序.bmp
		选择排序2.bmp
ArrayDemo5.java
折半查找.bmp
	9 面试题
		给定一个有序的数组，如果往该数组中存储一个元素，并保证这个数组还是有序的，
		那么个元素的存储的角标为如何获取。
		{13,15,19,28,33,45,78,106};
ArrayTest.java
	10 反转
		给定一个数组，对其进行反转。
		{3,1,6,5,8,2} -->
		{2,8,5,6,1,3};
		其实就是头尾元素的位置置换。

ArrayTest2.java -查表法1
	11 获取一个整数的16进制表现形式。
ArrayTest3.java --查表法2
	12 获取一个整数的2，8，16进制表现形式。
ArrayTest4.java --查表法3

--day06 Two-dimensional array
Array2Demo.java
二维数组图解.bmp
画图题.java


//BK --day06 Class
面向对象.text
类与对象.bmp
CarDemo.java
	用java语言对现实生活中的事物进行描述。
	通过类的形式来体现的。

	怎么描述呢？
		对于事物描述通常只关注两方面。
		一个是属性，一个是行为。
		只要明确该事物的属性和行为并定义在类中即可。

	对象：其实就是该类事物实实在在存在的个体。

	类与对象之间的关系？
		类  ：事物的描述。
		对象：该类事物的实例。在java中通过new来创建的。

	描述小汽车--分析：
		1，属性。
			轮胎数。
			颜色。
		2，行为。
			运行。

	定义类其实就是在定义类中的成员。
		成员：
			成员变量<-->属性，
			成员函数<-->行为。


	成员变量和局部变量的区别：//BK --day06 class 2成员变量和局部变量的区别
		1，
			成员变量定义在类中，整个类中都可以访问。
			局部变量定义在函数，语句，局部代码块中，只在所属的区域有效。

		2，
			成员变量存在于堆内存的对象中。
			局部变量存在于栈内存的方法中。

		3，
			成员变量随着对象的创建而存在，随着对象的消失而消失。
			局部变量随着所属区域的执行而存在，随着所属区域的结束而释放。

		4，
			成员变量都有默认初始化值。
			局部变量没有默认初始化值。

对象的内存图.bmp
Demo06.java //BK --day06 Class 3基本参数&引用参数
基本和引用类型参数传递图解.bmp


PersonDemo06.java  //BK --day06 Class 4Encapsulation
14-面向对象(封装-代码示例).avi (15:40)
15-面向对象(封装-思想).avi (14:55)


//BK --day07 Class
------------------//BK --day07 Class 4Encapsulation 1Construct
ConsDemo.java
构造函数.bmp --内存调用
	构造函数：构建创造对象时调用的函数。作用：可以给对象进行初始化。
		创建对象都必须要通过构造函数初始化。

	一个类中如果没有定义过构造函数，那么该类中会有一个默认的空参数构造函数。
		如果在类中定义了指定的构造函数，那么类中的默认构造函数就没有了。

	一般函数和构造函数什么区别呢？
		构造函数：对象创建时，就会调用与之对应的构造函数，对对象进行初始化。
		一般函数：对象创建后，需要函数功能时才调用。

		构造函数：对象创建时，会调用只调用一次。
		一般函数：对象创建后，可以被调用多次。

	什么时候定义构造函数呢？
		在描述事物时，该事物一存在就具备的一些内容，这些内容都定义在构造函数中。

	构造函数可以有多个，用于对不同的对象进行针对性的初始化.
		多个构造函数在类中是以重载的形式来体现的。

	细节：
		1，构造函数如果完成了set功能。set方法是否需要:是，将来还需要改变。
		2，一般函数不能直接调用构造函数。
		3，构造函数如果前面加了void就变成了一般函数。
		4，构造函数中是可以有显示return语句的,自带return在结尾。

------------------//BK --day07 Class 4Encapsulation 2This
ThisDemo.java
this.bmp
构造函数间调用.bmp
	this : 代表对象。代表哪个对象呢？当前对象。
		   this就是所在函数所属对象的引用。
		   简单说：哪个对象调用了this所在的函数，this就代表哪个对象。

	用法：useful.
		1 当成员变量和局部变量重名，可以用关键字this来区分。
		2 this也可以用于在构造函数中调用其他构造函数。
			注意：2.1只能定义在构造函数的第一行。因为初始化动作要先执行。
				 2.2 注意递归调用this

------------------//BK --day07 Class 4Encapsulation 3Static
StaticDemo.java
	1 static的特点：
		1，static是一个修饰符，用于修饰成员。
		2，static修饰的成员被所有的对象所共享。
		3，static优先于对象存在，因为static的成员随着类的加载就已经存在了。
		4，static修饰的成员多了一种调用方式，就可以直接被类名所调用 。 类名.静态成员 。
		5，static修饰的数据是共享数据，对象中的存储的是特有数据。

	2 成员变量和静态变量的区别？ //BK --day07 Class 4Encapsulation 3Static 1成员变量和静态变量
		1，两个变量的生命周期不同。
			成员变量随着对象的创建而存在，随着对象的被回收而释放。
			静态变量随着类的加载而存在，随着类的消失而消失。

		2，调用方式不同。
			成员变量只能被对象调用。
			静态变量可以被对象调用，还可以被类名调用。

		3，别名不同。
			成员变量也称为实例变量。
			静态变量称为类变量。

		4，数据存储位置不同。
			成员变量数据存储在堆内存的对象中，所以也叫对象的特有数据.
			静态变量数据存储在方法区(共享数据区)的静态区，所以也叫对象的共享数据.
	3 静态使用的注意事项：
		1，静态方法只能访问静态成员。(非静态既可以访问静态，又可以访问非静态)
		2，静态方法中不可以使用this或者super关键字。
		3，主函数是静态的。

MainDemo.java //BK --day07 Class 4Encapsulation 3Static 2Main
	4 主函数特殊之处：
		1，格式是固定的。
		2，被JVM所识别和调用。

		public static void main(String[] args)
			public:因为权限必须是最大的。
			static:不需要对象的,直接用主函数所属类名调用即可。
			void  ：主函数没有具体的返回值。
			main  :函数名，不是关键字，只是一个jvm识别的固定的名字。
			String[] args:这是主函数的参数列表，是一个数组类型的参数，而且元素都是字符串类型。

StaticDemo2.java //BK --day07 Class 4Encapsulation 3Static 3Memery
静态内存图解.bmp

StaticDemo3.java
	5 静态什么时候用？
		1，静态变量。
			当分析对象中所具备的成员变量的值都是相同的 。
			这时这个成员就可以被静态修饰。
			只要数据在对象中都是不同的，就是对象的特有数据，必须存储在对象中，是非静态的。
			如果是相同的数据，对象不需要做修改，只需要使用即可，不需要存储在对象中，定义成静态的。

		2，静态函数。
			函数是否用静态修饰，就参考一点，就是该函数功能是否有访问到对象中的特有数据。
			简单点说，从源代码看，该功能是否需要访问非静态的成员变量，如果需要，该功能就是非静态的。
			如果不需要，就可以将该功能定义成静态的。当然，也可以定义成非静态，
			但是非静态需要被对象调用，而仅创建对象调用非静态的
			没有访问特有数据的方法，该对象的创建是没有意义。

StaticCodeDemo.java  //BK --day07 Class 4Encapsulation 3Static 4静态&构造代码块
	6  特殊代码块
		1 静态代码块。随着类的加载而执行。而且只执行一次。
			作用：
				用于给类进行初始化。
	  	2 构造代码块。可以给所有对象进行初始化的,是给对应的对象进行针对性的初始化。


TestInnerStatic.java
static 可以修饰成员，当成员是类时，也可以用static修饰 --//BK --day07 Class 4Encapsulation 3Static 5Static Inner Class


//BK --day08 Class
ArrayUtil.java  --复习，把以前的知识综合运用一下。

SingleDemo08.java  //BK --day08 Class 4Encapsulation 4单例
单例内存图解.bmp
	设计模式：对问题行之有效的解决方式。其实它是一种思想。

	1,单例设计模式。
		解决的问题：就是可以保证一个类在内存中的对象唯一性。

		应用方向：对于多个程序使用同一个配置信息对象时，就需要保证该对象的唯一性。

	如何保证对象唯一性呢？
		1，不允许其他程序用new创建该类对象。
		2，在该类创建一个本类实例。
		3，对外提供一个方法让其他程序可以获取该对象。

	步骤：
		1，私有化该类构造函数。
		2，通过new在本类中创建一个本类对象。
		3，定义一个公有的方法，将创建的对象返回。static



-----------------------//BK --day08 Class 5Inheritance
ExtendsDemo08.java //TODO 2继承和包的关系，不同包？不同继承关系的处理。
继承.bmp
	继承的好处：
		1，提高了代码的复用性。
		2，让类与类之间产生了关系，给第三个特征多态提供了前提.

	java中支持单继承。不直接支持多继承，但对C++中的多继承机制进行改良。
		单继承：一个子类只能有一个直接父类。
		多继承：一个子类可以有多个直接父类(java中不允许,进行改良)
			不直接支持，因为多个父类中有相同成员，会产生调用不确定性。
			在java中是通过"多实现"的方式来体现。

	java支持多层(多重)继承。
		C继承B，B继承A。就会出现继承体系。

	当要使用一个继承体系时，
		1，查看该体系中的顶层类，了解该体系的基本功能。
		2，创建体系中的最子类对象，完成功能的使用。

	什么时候定义继承呢？
		当类与类之间存在着所属关系的时候，就定义继承。xxx是yyy中的一种。 xxx extends yyy
		所属关系： is a 关系。
	在子父类中，成员的特点体现。
		1，成员变量。
		2，成员函数。
		3，构造函数。

ExtendsDemo2.java //BK --day08 Class 5Inheritance 1成员变量
继承中成员变量.bmp
	this和super的用法很相似。 //BK --day08 Class 5Inheritance 2Super
		1 当本类的成员和局部变量同名用this区分。
		  当子父类中的成员变量同名用super区分父类。
		2 this:代表一个本类对象的引用。
		  super：代表一个父类空间。 --见"继承中成员变量.bmp"图中，super的变量。

ExtendsDemo3.java //BK --day08 Class 5Inheritance 3成员函数
函数覆盖.bmp
	当子父类中出现成员函数一模一样的情况，会运行子类的函数。 这种现象，称为覆盖操作。这是函数在子父类中的特性。
	函数两个特性：
		1，重载。同一个类中。overload
		2，覆盖。子类中。覆盖也称为重写，覆写。override
	覆盖注意事项：
		1，子类方法覆盖父类方法时，子类权限必须要大于等于父类的权限。
		2，静态只能覆盖静态，或被静态覆盖。
		3，必须保证子父一模一样：包括返回值。
		4，父类中的私有方法不可以被覆盖。
	什么时候使用覆盖操作?  Phone class for this meaning
		当对一个类进行子类的扩展时，子类需要保留父类的功能声明，
		但是要定义子类中该功能的特有内容时，就使用覆盖操作完成.

//BK --day09 Class

ExtendsDemo4.java //BK --day09 Class 5Inheritance 4构造函数
	1子父类中的构造函数的特点。
		为什么在子类构造对象时，发现，访问子类构造函数时，父类也运行了?
		原因是：在子类的构造函数中第一行有一个默认的隐式语句。 super();

	2子类的实例化过程：子类中所有的构造函数默认都会访问父类中的空参数的构造函数。

	3为什么子类实例化的时候要访问父类中的构造函数呢？
		那是因为子类继承了父类，获取到了父类中内容(属性)，所以在使用父类内容之前，
		要先看父类是如何对自己的内容进行初始化的。

		所以子类在构造对象时，必须访问父类中的构造函数。
		为什么完成这个必须的动作，就在子类的构造函数中加入了super()语句。

	4注意：
		1 super语句必须要定义在子类构造函数的第一行,因为父类的初始化动作要先完成。
		2 如果父类中没有定义空参数构造函数，那么子类的构造函数必须用super明确要调用
			父类中哪个构造函数。同时子类构造函数中如果使用this调用了本类构造函数时，
			那么super就没有了，因为super和this都只能定义第一行。所以只能有一个。
			但是可以保证的是，子类中肯定会有其他的构造函数访问父类的构造函数。

	5so any constructs: always have two clauses.
		class Demo extends Object
		{
			Demo() {
				//super(); default call
				//return;  default call
			}
		}

ExtendsDemo5.java
子类的实例化过程图解.bmp
	一个对象实例化过程：Person p = new Person();
		1，JVM会读取指定的路径下的Person.class文件，并加载进内存，
		  并会先加载Person的父类(如果有直接的父类的情况下).
		2，在堆内存中的开辟空间，分配地址。
		3，并在对象空间中，对对象中的属性进行默认初始化。
		4，调用对应的构造函数进行初始化。
		5，在构造函数中，第一行会先到调用父类中构造函数进行初始化。
		6，父类初始化完毕后，在对子类的属性进行显示初始化。
		7，在进行子类构造函数的特定初始化。
		8，初始化完毕后，将地址值赋值给引用变量.

FinalDemo.java //BK --day09 Class 5Inheritance 5Final
继承弊端：打破了封装性,继承可以修改方法。
final关键字：
	1，final是一个修饰符，可以修饰类，方法，变量。
	2，final修饰的类不可以被继承。
	3，final修饰的方法不可以被覆盖。
	4，final修饰的变量是一个常量，只能赋值一次。
		为什么要用final修饰变量。其实在程序如果一个数据是固定的，
		那么直接使用这个数据就可以了，但是这样阅读性差，所以它该数据起个名称。
		而且这个变量名称的值不能变化，所以加上final固定。
	5,写法规范：常量所有字母都大写，多个单词，中间用_连接。
	6,BOLGS: http://wenjiesu.iteye.com/blog/799332

AbstractDemo.java //BK --day09 Class 6Abstract
AbstractTest.java--example
	1 抽象类：
		抽象：笼统，模糊，看不懂！不具体。
		Java中可以定义没有方法体的方法，该方法的具体实现由子类完成，该方法称为抽象方法，包含抽象方法的类就是抽象类。
	2 特点：
		1，方法只有声明没有实现时，该方法就是抽象方法，需要被abstract修饰。
		   抽象方法必须定义在抽象类中。该类必须也被abstract修饰。
		2，抽象类不可以被实例化。为什么？因为调用抽象方法没意义。
		3，抽象类必须有其子类覆盖了所有的抽象方法后，该子类才可以实例化。
		   否则，这个子类还是抽象类。
	3 疑惑点：
		1)，抽象类中有构造函数吗？
			有，用于给子类对象进行初始化。
		2)，抽象类可以不定义抽象方法吗？
			可以的。 但是很少见，目的就是不让该类创建对象。AWT的适配器对象就是这种类。
			通常这个类中的方法有方法体，但是却没有内容。

			abstract class Demo
			{
				void show1()
				{}

				void show2()
				{}
			}
		3)，抽象关键字不可以和那些关键字共存?
			private 不行
			static	不行  //static can be called by class name ,but abstract 通过类调用没有意义。
			final	不行  //
		4)，抽象类和一般类的异同点。
			相同点：
				抽象类和一般类都是用来描述事物的，都在内部定了成员。
			不同：
				1，一般类有足够的信息描述事物。
				   抽象类描述事物的信息有可能不足。
				2，一般类中不能定义抽象方法，只能定非抽象方法。
				   抽象类中可定义抽象方法，同时也可以定义非抽象方法。
				3，一般类可以被实例化。
				   抽象类不可以被实例化。
		5)，抽象类一定是个父类吗？
			是的。因为需要子类覆盖其方法后才可以对子类实例化。
	4 Example: AbstractTest.java
		雇员示例：
			需求：公司中程序员有姓名，工号，薪水，工作内容。
				 项目经理除了有姓名，工号，薪水，还有奖金，工作内容。
				 对给出需求进行数据建模。
		分析：
			在这个问题领域中，先找出涉及的对象。
			通过名词提炼法。
			程序员：
				属性：姓名，工号，薪水、
				行为：工作。
			经理：
				属性：姓名，工号，薪水，奖金。
				行为：工作。

			程序员和经理不存在着直接继承关系，但是程序员和经理却具有共性内容。
				可以进行抽取。因为他们都是公司的雇员
				可以将程序员和经理进行抽取.建立体系.

DemoImple.java //BK --day09 Class 7Interface
abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}
知识点： key points
	1 definition: 当一个抽象类中的方法都是抽象的时候，这时可以将该抽象类用另一种形式定义和表示，就是 接口 interface。
	  定义接口使用的关键字不是class，是interface.

	2 characteristic: 对于接口当中常见的成员：而且这些成员都有固定的修饰符。
		1，全局常量: public static final --if don't write the compiler do it
		2，抽象方法: public abstract
		由此得出结论，接口中的成员都是公共的权限

	3 implement:类与类之间是继承关系，类与接口直接是实现关系。
		接口不可以实例化,只能由实现了接口的子类并覆盖了接口中所有的抽象方法后，该子类才可以实例化。
		否则，这个子类就是一个抽象类。

	4 many implements:
		在java中不直接支持多继承，因为会出现调用的不确定性。
		所以java将多继承机制进行改良，在java中变成了多实现。
		一个类可以实现多个接口。

	5 一个类在继承另一个类的同时，还可以实现多个接口。 eg:class Q and Class Test
		接口的出现避免了单继承的局限性。            eg: class Test2
		接口与接口之间是继承关系，而且接口可以多继承。 eg:CC QQ MM ,因为没有方法体，不会影响功能。

	6 接口的特点
		接口是对外暴露的规则。
		接口是程序的功能扩展。
		接口可以用来多实现。
		类与接口之间是实现关系，而且类可以 继承一个类的同时实现多个接口。
		接口与接口之间可以有继承关系。

	7 抽象类和接口的异同点： eg: InterfaceDemo2.java
		相同点：
			都是不断向上抽取而来的。
		不同点：
			1，抽象类需要被继承，而且只能单继承。
			   接口需要被实现，而且可以多实现。
			2，抽象类中可以定义抽象方法和非抽象方法，子类继承后，可以直接使用非抽象方法。
			   接口中只能定义抽象方法，必须由子类去实现。
			3，抽象类的继承，是is  a 关系，在定义该体系的基本共性内容。
			   接口的实现,  是has a 关系，在定义体系额外功能。
		eg:犬按功能分：有导盲犬，搜爆犬- 他们是犬，具有导盲，搜爆的功能。

//BK --day10 Class
 * BookPC.java  //BK --day09 Class 7Interface 2PC-USB
 * USB.bmp

----------------//BK --day10 Class 8Polymorphism
DuoTaiDemo.java
DuoTaiDemo2.java
DuoTaiDemo3.java

----------------//BK --day10 Class 9Inner class
InnerClassDemo.java
InnerClassDemo2.java
InnerClassDemo3.java

----------------//BK --day10 Class 10Anonymous inner class
InnerClassDemo4.java
InnerClassDemo5.java
InnerClassDemo6.java

构造代码块初始化过程.bmp
Test.java
Test2.java

先初始化父类的静态代码-->初始化子类的静态代码-->
     (创建使历史，如果不创建实例，则后面的不执行)初始化父类的非静态代码-->初始化父类的构造
         -->初始化子类的非静态代码-->初始化子类的构造



//BK --day11 Exception
ExceptionDemo.java
异常抛出过程.bmp
	1 definition：
		异常:是在运行时期发生的不正常情况。在java中用类的形式对不正常情况进行了描述和封装对象。
			描述不正常的情况的类，就称为异常类。
			其实异常就是java通过面向对象的思想将问题封装成了对象,用异常类对其进行描述。

		以前:正常流程代码和问题处理代码相结合. 			eg:public static void sleep2(int time)
		现在:将正常流程代码和问题处理代码分离。提高阅读性. eg:public static void sleep(int time)

	2 体系 System
		不同的问题用不同的类进行具体的描述。 比如角标越界。空指针等等,问题很多，意味着描述的类也很多，将其共性进行向上抽取，形成了异常体系。

		1 最终问题（不正常情况）就分成了两大类。
			|--1，一般不可处理的。Error
					特点：是由JVM抛出的严重性的问题。这种问题发生一般不针对性处理。直接修改程序
					     eg:int[] arr = new int[1024*1024*800];
					     //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
			|--2，可以处理的。Exception
						 eg: int [] arr =null; sop(arr[0]);
						 //Exception in thread "main" java.lang.NullPointerException

		2 Throwable:无论是error，还是异常，问题，问题发生就应该可以抛出，让调用者知道并处理。
			该体系的特点就在于Throwable及其所有的子类都具有可抛性。

		3 可抛性到底指的是什么呢？怎么体现可抛性呢？
			其实是通过两个关键字来体现的。
			throws and throw ,凡是可以被这两个关键字所操作的类和对象都具备可抛性.

		4 该体系的特点：
			子类的后缀名都是用其父类名作为后缀，阅读性很想。

ExceptionDemo2.java
	3 运行原理 ( running principle )eg:ExceptionDemo2.java
		1 As the information said, the exception will be thrower level by level.
		  Until to the main and to JVM, if no one resolve it.

			Exception in thread "main" java.lang.NullPointerException
			at itcastday11.Demo2.method(ExceptionDemo2.java:15)
			at itcastday11.ExceptionDemo2.main(ExceptionDemo2.java:39)
		2 the sentences under the exception will not be executed.
			eg: System.out.println("over");
		3 When I know how the exception work by default, I can initialise my own exceptions.
			eg: throw new NullPointerException("数组的引用不能为空！");

ExceptionDemo3.java
	异常处理trycatch.bmp
		4 自定义异常
		如果让一个类称为异常类，必须要继承异常体系，因为只有称为异常体系的子类才有资格具备可抛性。
		才可以被两个关键字所操作，throws throw
		1 定义自己的异常就extends exception
		2 在调用自定义异常的地方用throws:谁调用，谁声明throws
			eg1: public int method(int[] arr, int index) throws FuShuIndexException// throws
			eg2: public static void main(String[] args) throws FuShuIndexException

	5 异常的分类：自定义异常时，要么继承Exception。要么继承RuntimeException。
		1，编译时被检测异常:只要是Exception和其子类都是，除了特殊子类RuntimeException体系。
				这种问题一旦出现，希望在编译时就进行检测，让这种问题有对应的处理方式。
				这样的问题都可以针对性的处理。
		2，编译时不检测异常(运行时异常):就是Exception中的RuntimeException和其子类。
				这种问题的发生，无法让功能继续，运算无法进行，更多是因为调用者的原因导致的而或者引发了内部状态的改变导致的。
				那么这种问题一般不处理，直接编译通过，在运行时，让调用者调用时的程序强制停止,让调用者对代码进行修正。
		3 throws 和throw的区别。
			1，throws使用在函数上。
			   throw使用在函数内。
			2，throws抛出的是异常类，可以抛出多个，用逗号隔开。
			   throw抛出的是异常对象。

ExceptionDemo4.java
	6 异常处理的捕捉形式： 可以对异常进行针对性处理的方式。
		1 格式	：
			try
			{
				//需要被检测异常的代码。
			}
			catch(异常类 变量)//该变量用于接收发生的异常对象
			{
				//处理异常的代码。
			}
			finally
			{
				//一定会被执行的代码。
			}
		2 多catch情况：使用的函数抛几个异常，就用几个catch接受。
			eg:catch(Exception e)//多catch父类的catch放在最下面。 {

	7 异常处理的原则：
		1，函数内容如果抛出需要检测的异常，那么函数上必须要声明。
			否则必须在函数内用trycatch捕捉，否则编译失败。

		2，如果调用到了声明异常的函数，要么trycatch要么throws，否则编译失败。

		3，什么时候catch，什么时候throws 呢？
			功能内容可以解决，用catch。
			解决不了，用throws告诉调用者，由调用者解决 。

		4，一个功能如果抛出了多个异常，那么调用时，必须有对应多个catch进行针对性的处理。
			内部又几个需要检测的异常，就抛几个异常，抛出几个，就catch几个。

ExceptionDemo5.java
	8 Finally 的使用 eg:ExceptionDemo5.java
		1 // return ; 					-- finally 执行
		  // System.exit(0);//退出jvm。   -- finally 不执行
		2 应用
			连接数据库 查询。Exception 关闭连接。
		3 try catch finally 代码块组合特点：
			* 1，try catch finally
			* 2, try catch(多个)当没有必要资源需要释放时，可以不用定义finally。
		    * 3, try finally 异常无法直接catch处理，但是资源需要关闭。
			 	void show()throws Exception {  // 没有catch必须throws
			 		try {
			 			//开启资源。 throw new Exception();
			 		} finally {
			 			//关闭资源。
			 		}
ExceptionTest.java
	9 异常的转换（封装）
	//把冒烟异常（电脑的）转换为 课程无法完成（公司的）
	catch (MaoYanException e)
		{
			System.out.println(e.toString());
			test();
			//可以对电脑进行维修。
			throw new NoPlanException("课时进度无法完成，原因："+e.getMessage());
		}

ExceptionDemo6.java
	10 异常的注意事项：
		1，子类在覆盖父类方法时，父类的方法如果抛出了异常，
		那么子类的方法只能抛出父类的异常或者该异常的子类。

		2，如果父类抛出多个异常，那么子类只能抛出父类异常的子集。



		简单说：子类覆盖父类只能抛出父类的异常或者子类或者子集。

		注意：如果父类的方法没有抛出异常，那么子类覆盖时绝对不能抛，就只能try .


//BK --day11 Object
ObjectDemo.java --1 Construction ,11 methods
	Object:所有类的根类，Object是不断抽取而来，具备着所有对象都具备的共性内容。
	1 Object构造函数： --1 by JVM, can not control
	    static {
	        registerNatives();
	    }
	    随着类的加载而加载，调用本地方法，加载到方法区。
	01-面向对象(Object类-equals方法).avi (15:13)
		default：
			1 比较对象地址
			2 默认形式：boolean equals(Object obj)，可以任意两个对象比较。
		eg: ObjectDemo.java Line 44 --53 (没overwrite equals)
	02-面向对象(Object类-equals方法覆盖).avi (15:22)
		1 Overwrite：
			根据对象的特有内容，建立判断对象是否相同的依据，传入参数还必须是Object。
			If write like this "equals(Person obj)"--It is not overwrite
		2 instanceof
			取到实例进行比较 : "Hello" instanceof String
		eg: ObjectDemo.java Line 14 --2 (overwrite equals)
	03-面向对象(Object类-hashCode方法).avi ( 8:17)
		default: 调用系统的方法。
		eg: ObjectDemo.java Line 53 --54 (overwrite equals)
	04-面向对象(Object类-getClass方法).avi (13:10)
		类对象.gif
	05-面向对象(Object类-toString方法).avi ( 4:30)

//BK --day12-13 Multithreading Thread   -- 8Cons+42Meds
1:definition
	进程：正在进行中的程序(直译). 只分配开应用程序的应用空间
	线程：就是进程中一个负责程序执行的控制单元(执行路径)；一个进程中可以多执行路径，称之为多线程。
		 每一个线程都有自己运行的内容。这个内容可以称为线程要执行的任务。
	关系：一个进程中至少要有一个线程，开启多个线程是为了同时运行多部分代码。
2：Pro and Con
	好处：解决了多部分同时运行的问题。
	弊端：线程太多回到效率的降低。其实应用程序的执行都是在做着快速的切换完成的。这个切换是随机的。
	eg:  I/O例子：点对点的聊天工具，需要在我们编写信息的同时能够接受并打印出来对方说的话。
	     如果将信息的发送和接受放在一个线程里，发送和接受两者不能兼顾。

ThreadDemo.java
3: JVM multithreading
	JVM启动时就启动了多个线程，至少有两个线程可以分析的出来。
		1，执行main函数的线程--该线程的任务代码都定义在main函数中。
		2，负责垃圾回收的线程。
	eg: ThreadDemo 中有main和多个匿名对象。匿名对象一创建就是垃圾，就等着被回收的。
	tips:垃圾回收还没结束，虚拟机就可能直接关闭，就不等垃圾回收了，所有有时只输出一个或两个值（ ThreadDemo 中的结果）

ThreadDemo2.java
4：Main Threading Example
	eg:ThreadDemo2 line 20--42 :  one main threading. No multi threading

5: Multithreading 1 -- 05-多线程(多线程创建的方式一-继承Thread类).avi (25:27)
	1 Thread Concept
		创建线程的目的是为了开启一条执行路径，去运行指定的代码和其他代码实现同时运行。
		而运行的指定代码就是这个执行路径的任务。
		JVM创建的主线程的任务都定义在了主函数中。
		而自定义的线程它的任务在哪儿呢？
		Thread类用于描述线程，线程是需要任务的。所以Thread类也对任务的描述。
		这个任务就通过Thread类中的run方法来体现。也就是说，run方法就是封装自定义线程运行任务的函数。
		run方法中定义就是线程要运行的任务代码。
		开启线程是为了运行指定代码，所以只有继承Thread类，并复写run方法。
		将运行的代码定义在run方法中即可。
	2 创建线程方式一：继承Thread类。
		步骤：
		1，定义一个类继承Thread类。
		2，覆盖Thread类中的run方法。
		3，直接创建Thread的子类对象创建线程。
		4，调用start方法开启线程并调用线程的任务run方法执行。
	eg:ThreadDemo2 line 44--68
6: Thread name and methods -- 06-多线程(Thread类中的方法&线程名称).avi (10:33)
	1 methods:
		1 getName() --Returns this thread's name.
		2 Thread.currentThread() -- Returns a reference to the currently executing thread object.
		3 Thread.currentThread().getName() -- Returns this running thread's name.
	2 可以通过Thread的getName获取线程的名称 Thread-编号(从0开始)  eg:ThreadDemo2 92 93
	  主线程的名字就是main。 eg:ThreadDemo2 89 90
	eg:ThreadDemo2 line 70--100
7: Memory using -- 07-多线程(多线程运行图解).avi (15:30)
多线程运行图.bmp
	different threads use different stack memory, and they are independent.
	If main thread meet errors ,the other threads can work properly.

	eg: ThreadDemo3.java -- exceptions happen in main and threads.

8 08-多线程(线程的状态).avi (22:40)
多线程状态图.bmp
MutiThread states
	1 concepts
	    CPU执行权 : 现在做(Yes1);
	    执行资格   ：在排队(Yes2)
		四个状态：被创建--> 执行   -->冻结   -->临时阻塞  -->消亡
		        No,No-->Yes,Yes-->No,No -->No,Yes  --> No,No
	 tips: only one thread has the execute right ,all others are in the block or freeze.
	 eg:多线程状态图.bmp

--day13 Multithreading Thread
09-多线程(创建线程的第二种方式—实现Runnable接口).avi (22:56)
ThreadDemo.java
	二:实现Runnable接口。
		1，定义类实现Runnable接口。
		2，覆盖接口中的run方法，将线程的任务代码封装到run方法中。
		3，通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数传递。
			为什么？因为线程的任务都封装在Runnable接口子类对象的run方法中。
			所以要在线程对象创建时就必须明确要运行的任务。
		4，调用线程对象的start方法开启线程。
	eg:ThreadDemo.java line 26 --54

10-多线程(第二种方式的细节).avi ( 7:41)
	Thread内部有Thread（Runnable Target)构造函数，
	eg:ThreadDemo.java line 57 --104

11-多线程(第二种方式的好处).avi (11:51)
	实现Runnable接口的好处：
		1，将线程的任务从线程的子类中分离出来，进行了单独的封装。
		   按照面向对象的思想将任务的封装成对象。
		2，避免了java单继承的局限性。
	所以，创建线程的第二种方式较为常用。

 TicketDemo.java & 售票内存图.bmp
12-多线程(卖票示例).avi (27:26)
	eg1: TicketDemo line 6--30
		it use the static number to share data with four different objects.
		while the problem is still happening when add line 39
		"for (long i = -99999999; i < 99999999; i++);"
		This app needs more than one command to finish its job.
		So the -1,-2 ticket is coming .
	eg2:TicketDemo line 30--60
		If the ticket object has the relevant with the number,(kinds of tickets)
		so it should not be static.
		This way use the runnable interface ,do not use the static key words.

13-多线程(线程安全问题的现象).avi (14:42) --210
	eg: way1 & way2 both has the problem

14-多线程(线程安全问题产生的原因).avi ( 6:21)
	线程安全问题产生的原因：
		1，多个线程在操作共享的数据。
		2，操作共享数据的线程代码有多条。
		3，当一个线程在执行操作共享数据的多条代码过程中，其他线程参与了运算，就会导致线程安全问题。
	eg:多线程出错.gif

SynFunctionLockDemo.java
15-多线程(同步代码块).avi ( 9:43)
	解决思路；
		就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候，其他不可以参与运算.
		必须要当前线程把这些代码都执行完毕后，其他线程才可以参与运算。

		在java中，用同步代码块就可以解决这个问题。
		格式：
			synchronized(对象):“对象”是个锁，有对象进入同步块，则加锁，别人进不去。直到它出来，才解锁。
			{
				需要被同步的代码 ；
			}
	eg:eg2: TicketDemo line 60--90

16-多线程(同步的好处和弊端).avi (11:55)
	1同步的机制：synchronized(对象):“对象”是个锁，有对象进入同步块，则加锁，别人进不去。直到它出来，才解锁。
	2同步的好处：解决了线程的安全问题。
	3同步的弊端：相对降低了效率，因为同步外的线程的都会判断同步锁。

17-多线程(同步的前提).avi ( 6:34)
	同步的前提：同步中必须有多个线程并使用同一个锁。

18-多线程(同步函数).avi (15: 9)
	在函数上加个关键字“synchronized”，就可以变成同步函数了。
	eg:BankDemo.java

19-多线程(验证同步函数的锁).avi (20:52)
	同步函数的使用的锁是this；
	同步函数和同步代码块的区别：
		同步函数的锁是固定的this。
		同步代码块的锁是任意的对象。
	tips:建议使用同步代码块。
	eg:SynFunctionLockDemo.java

StaticSynFunctionLockDemo.java
20-多线程(验证静态同步函数的锁).avi (10:27)
	静态的同步函数使用的锁是  该函数所属字节码文件对象
	Two ways to get it :
		1 可以用 getClass方法获取，
		2 也可以用当前  类名.class 表示。
	eg:StaticSynFunctionLockDemo.java


21-多线程(单例模式涉及的多线程问题).avi (12:13)--300
SingleDemo.java
	1 饿汉式，没有安全问题
	2 SingleDemo line 39--41//懒汉式
		//加入同步为了解决多线程安全问题。
		//加入双重判断是为了解决效率问题。


22-多线程(死锁示例).avi (18:38)
DeadLockDemo.java
	1 死锁：常见情景之一：同步的嵌套。
			eg:DeadLockDemo.java
		   常见情景之二：while（flag）wait，no notify()。
		   	eg:ProducerConsumerDemo.java line 36.while + notify()
DeadLockTest.java
	remember one Lock, easy one .
郁闷答疑图解.bmp


//BK --day14 Multithreading Thread
23-多线程(线程间通信-示例).avi (37: 4)
ResourceDemo.java

24-多线程(线程间通信-等待唤醒机制).avi (34:23)
ResourceDemo2.java
wait-notify应用.gif
	1 等待/唤醒机制，涉及的方法：
		1，wait(): 让线程处于冻结状态，被wait的线程会被存储到线程池中。
		2，notify():唤醒线程池中一个线程(任意).
		3，notifyAll():唤醒线程池中的所有线程。
		tips：
			这些方法都必须定义在同步中，因为这些方法是用于操作线程状态的方法。
			必须要明确到底操作的是哪个锁上的线程。

	2 为什么操作线程的方法wait notify notifyAll定义在了Object类中？
		因为这些方法是监视器的方法，监视器其实就是锁。
		锁可以是任意的对象，任意的对象调用的方式一定定义在Object类中。

25-多线程(线程间通信-等待唤醒机制-代码优化).avi ( 6:48)
ResourceDemo3.java

26-多线程(线程间通信-多生产者多消费者问题).avi (34: 3)
ProducerConsumerDemo.java

27-多线程(线程间通信-多生产者多消费者问题解决).avi (13:23)
ProducerConsumerDemo2.java
多生产多消费.bmp
	My own practices:
		ProducerConsumerDemoMy.java
		ProducerConsumerDemoMyOne.java-- one Pro one Consumer

28-多线程(线程间通信-多生产者多消费者问题-JDK1.5新特性-Lock).avi (18:41)
ProducerConsumerDemo2.java -- line 33
Lock升级原因.gif

29-多线程(线程间通信-多生产者多消费者问题-JDK1.5新特性-Condition).avi (16:11)
ProducerConsumerDemo2.java -- line 38

30-多线程(线程间通信-多生产者多消费者问题-JDK1.5解决办法).avi ( 9: 6)
ProducerConsumerDemo2.java -- line 82
分开不用的conditions.gif
 	tips：两个监视器，分别件事消费者和生产者

31-多线程(线程间通信-多生产者多消费者问题-JDK1.5解决办法-范例).avi (14:48)--506
BoundedBuffer.java
范例.gif
	jdk1.5以后将同步和锁封装成了对象。
	并将操作锁的隐式方式定义到了该对象中，
	将隐式动作变成了显示动作。

	Lock接口： 出现替代了同步代码块或者同步函数。将同步的隐式锁操作变成现实锁操作。
	 		  同时更为灵活。可以一个锁上加上多组监视器。
		lock():获取锁。
		unlock():释放锁，通常需要定义finally代码块中。

	Condition接口：
		出现替代了Object中的wait notify notifyAll方法。
		将这些监视器方法单独进行了封装，变成Condition监视器对象，可以任意锁进行组合。
		await();
		signal();
		signalAll();

32-多线程(wait和sleep的区别).avi (12:33)
wait和sleep的区别.java
	1，wait可以指定时间也可以不指定。
	   sleep必须指定时间。
	2，在同步中时，对cpu的执行权和锁的处理不同。
		wait :释放执行权，释放锁。
		sleep:释放执行权，不释放锁。锁仅仅影响同步，其他同步外的仍然可以执行。

33-多线程(停止线程方式-定义标记).avi (11:44)
StopThreadDemo.java
	1，stop方法。
	2，run方法结束。
		怎么控制线程的任务结束呢?
		任务中都会有循环结构，只要控制住循环就可以结束任务。
		控制循环通常就用定义标记来完成。
		eg：line 68 -- st.setFlag();

34-多线程(停止线程方式-Interrupt).avi (15:38)
StopThreadDemo.java
	3 但是如果线程处于了冻结状态，无法读取标记。如何结束呢？
	  可以使用interrupt()方法将线程从冻结状态强制恢复到运行状态中来，让线程具备CPU的执行资格。
	  当时强制动作会发生了InterruptedException，记得要处理

35-多线程(守护线程-setDaemon).avi ( 5:58)
StopThreadDemo.java
	4 后台进程，line 60.必须先于start（）运行,而且不用控制结束。

36-多线程(其他方法-join等).avi (18:53)
JoinDemo.java
	join,setPriority(1-10,仅仅是概率),toString,threadGroup，yield

37-多线程(面试题).avi ( 8: 9) --575m
ThreadTest.java



多线程技术总结.java



1: 为什么不用run，而重新一个start了？
	run():  only a normal method of the sub Thread class,it is called by the
			Current thread. it can not created a new thread.
	start():JVM call this method,it will get another thread by the VM.
			Has two functions: 1 Create a new thread ; 2 run() on new thread

2：为什么实现个接口就可以启动线程了？？？
 	1 Thread also inherit the runnable interface
 	2 Thread has the constructor of runnable parameters
 	3 A class implement the Runnable interface,it is the son of it.
 	4 input the Class as Thread constructor
 	5 call the Thread's start.


//BK --day15 String
StringDemo.java
01-常用对象API(String类-特点).avi (23:42)
	1 特点：字符串对象一旦被初始化就不会被改变。
	2 字符串常量池--池中没有就建立，池中有，直接用。
		String s = "abc";
	3 new 出的对象在堆中。
	eg:StringDemo.java

StringConstructorDemo.java
	1 一共有15个constructors： 1+8+2+1+3 =15
	2 byte[]--> String
	3 char[]--> String
	eg: StringConstructorDemo

StringMethodDemo.java
	1 一共有65个methods：按照面向对象的思想对字符串进行功能分类。
	1,获取：
		1.1 获取字符串中字符的个数(长度).
				int length();
		1.2 根据位置获取字符。
				char charAt(int index);
		1.3 根据'字符'获取在字符串中的第一次出现的位置.
				int indexOf(int ch)
				int indexOf(int ch,int fromIndex):从指定位置进行ch的查找第一次出现位置
				int lastIndexOf(int ch)
				int lastIndexOf(int ch,int fromIndex):从指定位置进行ch的查找第一次出现位置
			根据'字符串'获取在字符串中的第一次出现的位置.
				int indexOf(String str);
				int indexOf(String str,int fromIndex);
				int lastIndexOf(String str);
				int lastIndexOf(String str,int fromIndex);
		1.4 获取字符串中一部分字符串。也叫子串.
				String substring(int beginIndex, int endIndex)//包含begin 不包含end 。
				String substring(int beginIndex);
	2，转换。
		2.1 将字符串变成字符串数组(字符串的切割)
			@Override
			@Override
			String[]  split(String regex):涉及到正则表达式.
		2.2 将字符串变成字符数组。
			char[] toCharArray();
		2.3 将字符串变成字节数组。
			byte[] getBytes();
		2.4 将字符串中的字母转成大小写。
			String toUpperCase():大写
			String toLowerCase():小写
		2.5 将字符串中的内容进行替换
			String replace(char oldch,char newch);
			String replace(String s1,String s2);
		2.6 将字符串两端的空格去除。
			String trim();
		2.7 将字符串进行连接 。
			String concat(string);
		2.8 静态函数，把别得值变为字符串
			String.valueOf(4)--> 4 --> 字符串
	3，判断
		3.1 两个字符串内容是否相同啊？
			boolean equals(Object obj);
			boolean equalsIgnoreCase(string str);忽略大写比较字符串内容。
		3.2 字符串中是否包含指定字符串？
			boolean contains(string str);
		3.3 字符串是否以指定字符串开头。是否以指定字符串结尾。
			boolean startsWith(string);
			boolean endsWith(string);
	4，比较。
		4.1 "abc".compareTo("aqz")

StringObjectDemo.java
	//intern():对字符串池进行操作的,把堆中数据，放入常量池中

StringTest.java
StringTest_1.java
	1，给定一个字符串数组。按照字典顺序进行从小到大的排序。
		{"nba","abc","cba","zz","qq","haha"}
StringTest_2.java
	2，一个子串在整串中出现的次数。
 		"nbaernbatynbauinbaopnba"
StringTest_3.java
 	3，两个字符串中最大相同的子串。
 		"qwerabcdtyuiop"
  		"xcabcdvbn"
StringTest_4.java
 	4，模拟一个trim功能一致的方法。去除字符串两端的空白


//BK --day15 StringBuffer
StringBufferDemo.java
	StringBuffer:就是字符串缓冲区,用于存储数据的容器。
	1 特点：
		1，长度的可变的。
		2，可以存储不同类型数据。
		3，最终要转成字符串进行使用。
		4，可以对字符串进行修改。
	2 构造器 -- 4
		StringBuffer()
		StringBuffer(CharSequence seq)
		StringBuffer(int capacity)
		StringBuffer(String str)
	3 功能 -- 50
	  既然是一个容器对象。应该具备什么功能呢？
	  CURD --增删改查  C(create)U(update)R(read)D(delete)
		1，添加：
				StringBuffer append(data); --14
				StringBuffer insert(index,data); --12
				sb.append(x) 和 sb.insert(sb.length(), x) 具有相同的效果。
		2，删除：
				StringBuffer delete(start,end):包含头，不包含尾。 -1
				StringBuffer deleteCharAt(int index):删除指定位置的元素 -1
		3，查找：
				char charAt(index);
				int indexOf(string);
				int lastIndexOf(string);
		4，修改：
				StringBuffer replace(start,end,string);
				void setCharAt(index,char);
//BK --day15 StringBuilder
StringBuilderDemo.java
	jdk1.5以后出现了功能和StringBuffer一模一样的对象。就是StringBuilder
	不同的是：
		StringBuffer是线程同步的。通常用于多线程。
		StringBuilder是线程不同步的。通常用于单线程。 它的出现提高效率。

StringBuilderTest.java
 	将一个int[]数组变成字符串。
	 	eg1：用String会浪费空间，每次都会产生新的String在常量池中。
	 	eg2：用StringBuffer可以提高效率。
	如果你保存的数据要以字符串的形式来使用则用stringbuffer 和stringbuilder的形式。
	一旦进入他们取出的就只有字符串了数组，存入和取出的格式一样的。

JDK升级
	1，简化书写。
	2，提高效率。
	3，增加安全性。

StringBuilderTest.java
	形式参数的变化
	stringbuilder练习.bmp
	string内存图.bmp

//BK --day16 8种基本数据包装类--------------------------------------
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

//BK --day16 Collection--------------------------------------
Collection --15 methods
	|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
	|--Set ：无序，元素不能重复。
集合框架_1.txt
	1 集合类的由来：
		对象用于封装特有数据，对象多了需要存储，如果对象的个数不确定，就使用集合容器进行存储。
	2 集合特点：
		1，用于存储对象的容器。
		2，集合的长度是可变的。
		3，集合中不可以存储基本数据类型值。
		tips:数组和集合类同是容器，有何不同？
			数组虽然也可以存储对象，但长度是固定的；
			集合长度是可变，切存入元素页可以变。
			数组中可以存储基本数据类型，集合只能存储对象。

集合框架.bmp
	3 集合框架:集合容器因为内部的数据结构不同，有多种具体容器，不断的向上抽取，就形成了集合框架。

CollectionDemo.java
	4 框架的顶层Collection接口 --16 methods
		1)，增 Creat。 --2
			boolean add(Object obj):
			boolean addAll(Collection coll):
		2)，删 Delete。--3
			boolean remove(object obj):
			boolean removeAll(Collection coll);
			void clear();
		3)，判断：--3
			boolean contains(object obj):
			boolean containsAll(Colllection coll);
			boolean isEmpty():判断集合中是否有元素。
		4)，取：--2
			int size():
			Iterator iterator():取出元素的方式：迭代器。
			该对象必须依赖于具体容器，因为每一个容器的数据结构都不同。
			所以该迭代器对象是在容器中进行内部实现的。
			对于使用容器者而言，具体的实现不重要，只要通过容器获取到该实现的迭代器的对象即可，
			也就是iterator方法。

			Iterator接口就是对所有的Collection容器进行元素取出的公共接口。
			其实就是抓娃娃游戏机中的夹子！
		5)，其他：--2
			boolean retainAll(Collection coll);取交集。
			Object[] toArray():将集合转成数组。
IteratorDemo.java
	5 the iterator -- 3 methods
		1) difference with Enumeration --2
			 remove elements
			 Method names improved
		2) three methods
			 boolean hasNext()
			 E next()
			 void remove()

//BK --day16 List----------------------------------------------------------
List:
	|--Vector    :内部是数组数据结构，是同步的。 增删，查询都很慢！          --4 constructions  42 methods
	|--ArrayList :内部是数组数据结构，是不同步的。替代了Vector。查询的速度快! --3 constructions  20 methods
	|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。		   --2 constructions  39 methods
	//TODO 3 数组和链表的结构
		http://www.cnblogs.com/smyhvae/p/4761593.html
		https://book.douban.com/reading/10711140/
		http://blog.csdn.net/fightforyourdream/article/details/16353519
		https://zh.wikipedia.org/wiki/链表
		http://cmsblogs.com/?p=155
		http://wiki.jikexueyuan.com/project/java-enhancement/java-twenty.html

ListDemo.java
	1 List -- 25(=15+10 ,15 collection's methods)特有的常见方法：共性特点--可以操作角标。
		1)，添加
			void add(index,element);
			void add(index,collection);
		2)，删除；
			Object remove(index):
		3)，修改：
			Object set(index,element);
		4)，获取：
			Object get(index);
			int indexOf(object);
			int lastIndexOf(object);
			List subList(from,to);
ListDemo2.java
	2 listIterator -- 9 methods (3 Iterator +6 增加功能)
		add(E e) ，  hasPrevious() ， nextIndex()
		previous() ，previousIndex(), set(E e)
		tips: listIterator集合是可以完成对元素的增删改查。

LinkedListSlow.gif
	3 the slow reason for LinkedList.

Test16.txt
	4 作业：
		1，自己去查文档演示Vector中的elements()方法。
		2，LinkedList中的，addFirst addLast getFirst，getLast  removeFirst removeLast。
		3，既然集合是存储对象的，请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
		   并取出。将姓名和年龄打印出来。

//BK --day17 List------------------------------------------------------------------------------------
VectorDemo.java
	5 Vector 有element的都是特有方法。
	有自己的迭代器：Enumeration en = v.elements();

LinkedListDemo.java
	6 LinkedList
		1，增加
			addFirst();
			addLast():
			jdk1.6
			offerFirst();
			offerLast();
		2，获取
			getFirst();.//获取但不移除，如果链表为空，抛出NoSuchElementException.
			getLast();
			jdk1.6
			peekFirst();//获取但不移除，如果链表为空，返回null.
			peekLast():
		3，删除
			removeFirst();//获取并移除，如果链表为空，抛出NoSuchElementException.
			removeLast();
			jdk1.6
			pollFirst();//获取并移除，如果链表为空，返回null.
			pollLast();
DuiLie.java
LinkedTest.java
	7 两个模拟题
		 请使用LinkedList来模拟一个堆栈或者队列数据结构。
		 堆栈：先进后出 First In Last Out  FILO
		 队列：先进先出 First In First Out FIFO
		 我们应该描述这样一个容器，给使用提供一个容器对象完成这两种结构中的一种。

ArrayListTest.java & Person.java
	8 ArrayList
	请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
	并取出。将姓名和年龄打印出来。
ArrayListTest2.java  --20-常用对象API(集合框架练习).avi (17:35)
	定义功能去除ArrayList中的重复元素。
	tips: contains, remove 等的判断也用到了equals，方法，所以要overwrite.

//BK --day17 Set------------------------------------------------------------------------------------
Set:元素不可以重复，是无序。
	Set接口和Collection一致。--15 methods
HashSetDemo.java
	|--HashSet: 内部数据结构是哈希表 ，是不同步的。 --4Con + 8Meds
哈希表.bmp
		1 如何保证该集合的元素唯一性呢？哈希表确定元素是否相同
			1)，hashCode的方法
			  	判断的是两个元素的哈希值是否相同-hashcode
			  	如果相同，在判断两个对象的内容是否相同-equals
			2)，equals方法
				判断内容相同，用的是equals方法。
			tips：如果哈希值不同，是不需要判断equals。
		2 原则：
			如果元素要存储到HashSet集合中，必须覆盖hashCode方法和equals方法。
			一般情况下，如果定义的类会产生很多对象，比如人，学生，书，通常都需要覆盖equals，hashCode方法。
			建立对象判断是否相同的依据。
HashSetTest.java
		3 Test ：
			往hashSet集合中存储Person对象。如果姓名和年龄相同，视为同一个人。视为相同元素。
LinkedHashSetDemo.java
		4 LinkedHashSet:有序  --4Con+0 Med

	|--TreeSet:可以对Set集合中的元素进行排序。是不同步的。 --4Con + 26Meds
TreeSetDemo.java
		1 判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。
		2 TreeSet对元素进行排序的方式一：
			让元素自身具备比较功能，元就需要实现Comparable接口,覆盖compareTo方法。
ComparatorByLength.java
ComparatorByName.java
		3 TreeSet集合第二种排序方式二：(如果不要按照对象中具备的自然顺序进行排序。如果对象中不具备自然顺序。怎么办？)
			让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。
			将该类对象作为参数传递给TreeSet集合的构造函数。
二叉树.bmp //TODO 3 二叉树 数据结构
TreeSetTest.java
	对字符串进行长度排序。

//BK --day18 Generics-------------------------------------
GenericDemo.java
	1 泛型：
		jdk1.5出现的安全机制，只能引用类型。
	2 好处：
		1，将运行时期的问题ClassCastException转到了编译时期。
		2，避免了强制转换的麻烦。
	3 <>:什么时候用？
		1 当操作的引用数据类型不确定的时候。就使用<>。将要操作的引用数据类型传入即可.
	      其实<>就是一个用于接收具体引用数据类型的参数范围。
	    2 集合存入需要泛型 && 迭代器也得指定。
	    3 就当使用数组，类型必须先确定。
	4 tips -擦除-补偿
		1 在程序中，只要用到了带有<>的类或者接口，就要明确传入的具体引用数据类型 。
		2 泛型技术是给编译器使用的技术,用于编译时期。确保了类型的安全。
		3 运行时，会将泛型去掉，生成的class文件中是不带泛型的,这个称为泛型的擦除。
		  为什么擦除呢？因为为了兼容运行的类加载器。以前的类加载器没有此功能。
		4 泛型的补偿：在运行时，通过获取元素的类型（object.getClass().getName()）进行转换动作,不用使用者在强制转换了。
GenericDemo2.java--泛型应用与接口
Tool.java
GenericDefineDemo3.java --泛型类--04-常用对象API(集合框架-泛型-泛型类).avi (14:14)
	5 泛型类。
		eg:class Tool<QQ>{}
GenericDefineDemo4.java --泛型方法--05-常用对象API(集合框架-泛型-泛型方法).avi (12:42)
	6 将泛方法。
		eg1 general :
			public <W> void show(W a){}
		eg2 static :当方法静态时，不能访问类上定义的泛型。如果静态方法使用泛型，只能将泛型定义在方法上。
			public static <Y> void method(Y obj){}
GenericDefineDemo5.java --泛型接口--06-常用对象API(集合框架-泛型-泛型接口).avi ( 4:19)
	7 泛型接口
		eg1:interface Inter<T>{}
			可以在实现它的类中写出泛型， line37
			也可以在实现具体对象时，写出泛型 line30

GenericAdvanceDemo.java
	8 泛型的通配符：? 未知类型,用于泛型的限定：
GenericAdvanceDemo2.java
		1 <? extends E>: 接收E类型或者E的子类型对象。上限
		一般存储对象的时候用。比如 添加元素 addAll.

		2 <? super E>: 接收E类型或者E的父类型对象。 下限。
		一般取出对象的时候用。比如比较器。
	9 应用
GenericAdvanceDemo3.java
		1） 一般在存储元素的时候都是用上限，因为这样取出都是按照上限类型来运算的。不会出现类型安全隐患。
			eg: addAll(Collection<? extends E> c)

GenericAdvanceDemo4.java
		2）什么时候用下限呢？通常对集合中的元素进行取出操作时，可以是用下限。
			eg: Tree(Comparator<? super Worker> comp);
			精华在：line 22 ,GenericAdvanceDemo4.java
				TreeSet<Student> a = new TreeSet<Student>(new CompByStuName());     // 学生可以传入自己的比较器
				TreeSet<Student> a = new TreeSet<Student>(new CompByName());        // 学生可以传入自己的爹的比较器
			Wrong:TreeSet<Student> a = new TreeSet<Student>(new CompByWorkerName());//学生可以传入自己的儿子的比较器

GenericAdvanceDemo5.java
		3）?单独使用
		containsAll(Collection<?> c)


//BK --day18 Collections Summary 12-常用对象API(集合框架-集合查阅的技巧).avi ( 8:10)-----------------------------------
集合的一些技巧：
1 唯一吗？
	需要：Set
		需要制定顺序：
				需要： TreeSet
				不需要：HashSet
				但是想要一个和存储一致的顺序(有序):LinkedHashSet
	不需要：List
		需要频繁增删吗？
			需要：LinkedList
			不需要：ArrayList
2 如何记录每一个容器的结构和所属体系呢？--看名字！
	List
		|--ArrayList
		|--LinkedList
	Set
		|--HashSet
		|--TreeSet
	后缀名就是该集合所属的体系。
	前缀名就是该集合的数据结构。

3 Summary：
	看到array：就要想到数组，  就要想到查询快， 有角标.
	看到link： 就要想到链表，  就要想到增删快， 就要想要 add get remove+frist last的方法
	看到hash： 就要想到哈希表，就要想到唯一性， 就要想到元素需要覆盖hashcode方法和equals方法。
	看到tree： 就要想到二叉树，就要想要排序，   就要想到两个接口Comparable，Comparator 。

4 通常这些常用的集合容器都是不同步的。

//BK --day18 Map------------------------------------------
//TODO 1 如何理解一个map，它怎么存储，怎么使用？Test18.txt
  		http://www.importnew.com/10620.html
  		http://java.freesion.com/article/31342852080/
  		http://www.iteye.com/topic/838030
  		http://blog.csdn.net/csfreebird/article/details/7347026

	1 Map：--0 Cons+ 14 Methods
		一次添加一对元素。Collection 一次添加一个元素。
		Map也称为双列集合，Collection集合称为单列集合。
		其实map集合中存储的就是键值对。
		map集合中必须保证键的唯一性。
MapDemo.java
	2 常用方法：
		1，添加。
			value put(key,value):返回前一个和key关联的值，如果没有返回null.
		2，删除。
			void  clear():清空map集合。
			value remove(key):根据指定的key翻出这个键值对。
		3，判断。
			boolean containsKey(key):
			boolean containsValue(value):
			boolean isEmpty();
		4，获取。
			1)value get(key):通过键获取值，如果没有该键返回null。
							当然可以通过返回null，来判断是否包含指定键。
			2)int size(): 获取键值对的个数。
KeySet图解.bmp & MapDemo.java
			3)通过Map转成set就可以迭代:keySet()
			eg:    Set<K>	keySet()
entrySet图解.bmp	& MapDemo.java
			4)另一个方法:entrySet。
				该方法将键和值的映射关系作为对象存储到了Set集合中，而这个映射关系的类型就是Map.Entry类型(结婚证)
				见 代码“ class MyDemo implements MyMap.MyEntry {}” 自己定了了接口中的接口.为什么用内部类？
					因为entry是key-value 的关系对象，只有现有map才会有key-value。
					内部类static 暴露，能让外部直接用到。
			5) map.values(); 返回一个collections

	3 Map常用的子类：
		|--Hashtable :内部结构是哈希表，是同步的。不允许null作为键，null作为值。
			|--Properties：用来存储键值对型的配置文件的信息，可以和IO技术相结合。
HashMapDemo.java --	将学生对象和学生的归属地通过键与值存储到map集合中。
		|--HashMap : 内部结构是哈希表，不是同步的。允许null作为键，null作为值。
TreeMapDemo.java
		|--TreeMap : 内部结构是二叉树，不是同步的。可以对Map集合中的键进行排序。
LinkedHashMapDemo.java --有序的map
	4 Test
MapTest.java
	"fdgavcbsacdfs" 获取该字符串中，每一个字母出现的次数。
MapTest2.java
	查表法

//BK --day19 Collections Arrays------------------------------------------
CollectionsDemo.java
ComparatorByLength.java
	Collections --52 static methods
		13-常用对象API(集合框架-工具类-Collections-排序).avi (25: 4)
		14-常用对象API(集合框架-工具类-Collections-折半&最值).avi ( 5:30)
		15-常用对象API(集合框架-工具类-Collections-逆序&替换).avi (11:58)
		16-常用对象API(集合框架-工具类-Collections-其他方法&将非同步集合转成同步集合的方法).avi (15:34)

ArraysDemo.java--17-常用对象API(集合框架-工具类-Arrays-方法介绍).avi (11:32)
	Arrays--105 static methods
	1 array --> list --18-常用对象API(集合框架-工具类-Arrays-asList方法).avi (15:16)
		1) 重点：List asList(数组)将数组转成集合。
		   好处：其实可以使用集合的方法操作数组中的元素。
		   注意：数组的长度是固定的，所以对于集合的增删方法是不可以使用的,否则会发生UnsupportedOperationException
		2) 如果数组中的元素是对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行集合存储。
		   如果数组中的元素是基本类型数值，那么会将该数组作为集合中的元素进行存储。
ToArray.java
	2 Collections -- Array --19-常用对象API(集合框架-工具类-Collection-toArray方法).avi (11:49)
	 	1)使用的就是Collection接口中的toArray方法。
		  集合转成数组：可以对集合中的元素操作的方法进行限定。不允许对其进行增删。
		2)toArray方法需要传入一个指定类型的数组。
		  长度该如何定义呢？
		  如果长度小于集合的size，那么该方法会创建一个同类型并和集合相同size的数组。
		  如果长度大于集合的size，那么该方法就会使用指定的数组，存储集合中的元素，其他位置默认为null。
		  所以建议，最后长度就指定为，集合的size。


//BK --day19 JDK5.0------------------------------------------
ForEachDemo.java
 	foreach语句：
		1 格式：
			for(类型  变量   ：Collection集合|数组){}
		2 传统for和高级for的区别？
		   1) 传统for可以完成对语句执行很多次，因为可以定义控制循环的增量和条件。
		   2) 高级for是一种简化形式。
		  它必须有被遍历的目标。该目标要是数组，要么是Collection单列集合。
		   3) 对数数组的遍历如果仅仅是获取数组中的元素，可以使用高级for。
		  如果要对数组的角标进行操作建议使用传统for。
		3 应用于Map
		   可以使用高级for遍历map集合吗？不能直接用，但是可以将map转成单列的set，就可以用了。
ParamterDemo.java
	函数的可变参数。 其实就是一个数组，但是接收的是数组的元素。 自动将这些元素封装成数组。简化了调用者的书写。
		注意：可变参数类型，必须定义在参数列表的结尾。
		eg：public static int newAdd(int a, int... arr) {
StaticImportDemo.java
	import static java.util.Collections.*;  //静态导入，其实到入的是类中的静态成员。
	import static java.util.Collections.max;//静态导入，其实到入的是类中的静态成员。

//BK --day20 OtherAPI-------------------------------------------
SystemDemo.java & 系统信息.txt --0Cons+26Meds
	1 获取当前时间的毫秒值
		long l2 = System.currentTimeMillis();
	2 获取系统的属性信息，并存储到了Properties集合中。
		properties集合中存储都是String类型的键和值,最好使用它自己的存储和取出的方法来完成元素的操作。
		Properties properties = System.getProperties();
	  	Set<Entry<Object, Object>> entrySet = this.properties.entrySet();
	3 定义常量
		private static final String LINE_SEPARATOR = System.getProperty("line.separator");
		private static final String PATH           = System.getProperty("user.dir");
	4 给系统设置一些属性信息。这些信息是全局，其他程序都可以使用。
		System.setProperty("myclasspath", "c:\myclass");

RuntimeDemo.java
MathDemo.java
DateDemo.java
CalendarDemo.java

//BK --day20 IO-------------------------------------------
--day20 IO-1字符字节-----------------
1 Basic
 	1)输入流和输出流相对于内存设备而言.
		输入:将外设中的数据读取到内存中.
		输出:将内存的数写入到外设中.
	2)字节流和字符流
		字节流-- 电脑识别的都是二进制文件。
		字符流-- 字节流+编码表
			字节流读取文字字节数据后，不直接操作而是先查指定的编码表。
			获取对应的文字，在对这个文字进行操作。简单说：字节流+编码表
			eg: Ascall码表，让计算机识别生活中的文字。a-97,A-67.把字母对应到了人可以识别的文字。
				Unicode，世界通用的编码。因为各个国家的编码不同，同一个字母a，对应不同的编码。所以出生了Unicode
2 BaseClass
	字节流的两个顶层父类：
		InputStream
		OutputStream.
	字符流的两个顶层父类：
		Reader -- 2Cons+10Meds
		Writer -- 2Cons+10Meds
	Tips：这些体系的子类都以父类名作为后缀，而且子类名的前缀就是该对象的功能。
		eg:BufferedWriter, CharArrayWriter, FilterWriter,

FileWriterDemo.java
3 Write
	需求：将一些文字存储到硬盘一个文件中。
	思路：记住；如果要操作文字数据，建议优先考虑字符流。
		 而且要将数据从内存写到硬盘上，要使用字符流中的输出流	    -->Writer
   		 硬盘的数据基本体现是文件。 希望找到一个可以操作文件的Writer-->找到了FileWriter
   	实现：
   		1 字符串写入文件。
   		2 换行 LINE_SEPARATOR = System.getProperty("line.separator");
   		3 续写 如果构造函数中加入true，可以实现对文件进行续写！
   			eg:FileWriter fw = new FileWriter(表示.PATH+"/demo.txt", true);
IOExceptionDemo.java
4 Exception
	1 写入三步都要异常处理
	2 Close().必须有，放在finally
	3 先判断文件是否存在，在close();

5 Read
	需求：读取一个文本文件。将读取到的字符打印到控制台.
	思路：同上，找到了FileReader
FileReaderDemo.java
	返回单个字符
FileReaderDemo2.java
	返回字符数组 读取原理：ReadArrays.gif

--day21
6 Test:将c盘的一个文本文件复制到d盘。
	分析：复制原理：
		读取c盘文件中的数据，
		将这些数据写入到d盘当中。
		连读带写。
CopyTextTest.java
	单个字符的复制
CopyTextTest_2.java
	字符数组的复制
复制文本文件图解.bmp

//BK --day20 IO-2字符流缓冲区-----------------
	BufferedWriter
		：newLine();
	BufferedReader:
		: readLine();
BufferedWriterDemo.java
	创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联
BufferedReaderDemo.java
	读取字符从文件，通过buffer
readLine方法原理.bmp
	二级缓存，一级缓存的数据用回车符分割成二级数据。
CopyTextByBufTest.java
	使用缓冲区复制一个文本文件。
MyBufferedReader.java & MyBufferedReaderDemo.java
	自定义的读取缓冲区。其实就是模拟一个BufferedReader.


//BK --day21 IO-3装饰设计模式----------
PersonDemo.java
	对一组对象的功能进行增强时，就可以使用该模式进行问题的解决。

	装饰和继承都能实现一样的特点：进行功能的扩展增强。
	有什么区别呢？

	首先有一个继承体系。
	Writer
		|--TextWriter:用于操作文本
		|--MediaWriter：用于操作媒体。
	想要对操作的动作进行效率的提高。
	按照面向对象，可以通过继承对具体的进行功能的扩展。
	效率提高需要加入缓冲技术。

	Writer
		|--TextWriter:用于操作文本
			|--BufferTextWriter:加入了缓冲技术的操作文本的对象。
		|--MediaWriter：用于操作媒体。
			|--BufferMediaWriter:
	到这里就哦了。但是这样做好像并不理想。
	如果这个体系进行功能扩展，有多了流对象。
	那么这个流要提高效率，是不是也要产生子类呢？是。这时就会发现只为提高功能，进行的继承，
	导致继承体系越来越臃肿。不够灵活。

	重新思考这个问题？
	既然加入的都是同一种技术--缓冲。
	前一种是让缓冲和具体的对象相结合。
	可不可以将缓冲进行单独的封装，哪个对象需要缓冲就将哪个对象和缓冲关联。

	class Buffer{
		Buffer(TextWriter w)
		{}

		Buffer(MediaWirter w)
		{

		}
	}
	class BufferWriter extends Writer{
		BufferWriter(Writer w)
		{
		}
	}
	Writer
		|--TextWriter:用于操作文本
		|--MediaWriter：用于操作媒体。
		|--BufferWriter:用于提高效率。

	装饰比继承灵活。
	特点：装饰类和被装饰类都必须所属同一个接口或者父类。
LineNumberReaderDemo.java
	lnr.getLineNumber()可以得道行号
ByteStreamDemo.java
	字节流输入输出
CopyMp3Test.java
	复制mp3

//BK --day22
ReadKey.java
	1） 读取一个键盘录入的数据，并打印在控制台上。
		键盘本身就是一个标准的输入设备。
		对于java而言，对于这种输入设备都有对应的对象。
		int ch = in.read();//阻塞式方法。
	2） 获取用户键盘录入的数据，
		并将数据变成大写显示在控制台上，
		如果用户输入的是over，结束键盘录入。

//BK --day22 转换流桥梁------------------------------------
TransStreamDemo.java
转换流桥梁.bmp
//TODO JavaStopHere-- 8:51:56 AM

TransStreamDemo2.java
TransStreamDemo3.java

FileDemo.java
FileListDemo.java
FileMethodDemo.java

FilterByHidden.java
FilterByJava.java
SuffixFilter.java

---------
字符流：
FileReader
FileWriter

BufferedReader
BufferedWriter

字节流：
InputStream OutputStream。

操作文件的字节流对象。
FileOutputStream
FileInputStream
BufferedOutputStream
BufferedInputStream


字符流和字节流之间的转换动作。


----------

转换流：

InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"gbk");
FileReader fr = new FileReader("a.txt");


FileWriter fw = new FileWriter("b.txt");
OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));
OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"),"gbk");

转换流：字节流+编码表。
转换流的子类：FileReader，FileWriter：字节流+本地默认码表(GBK)。

如果操作文本文件使用的本地默认编码表完成编码。可以使用FileReader，或者FileWriter。因为这样写简便。
如果对操作的文本文件需要使用指定编码表进行编解码操作，这时必须使用转换流来完成。


-----------------------------


IO流的操作规律总结：

1，明确体系：
	数据源：InputStream ，Reader
	数据汇：OutputStream，Writer

2，明确数据：因为数据分两种：字节，字符。
	数据源：是否是纯文本数据呢？
		是：Reader
		否：InputStream

	数据汇：
		是：Writer
		否：OutputStream
到这里就可以明确具体要使用哪一个体系了。
剩下的就是要明确使用这个体系中的哪个对象。

3，明确设备：
	数据源：
		键盘：System.in
		硬盘：FileXXX
		内存：数组。
		网络：socket  socket.getInputStream();

	数据汇：
		控制台：System.out
		硬盘：FileXXX
		内存：数组
		网络：socket socket.getOutputStream();

4，明确额外功能：
	1，需要转换？是，使用转换流。InputStreamReader OutputStreamWriter
	2，需要高效？是，使用缓冲区。Buffered
	3，需要其他？

--------------------

1，复制一个文本文件。

	1，明确体系：
		源：InputStream ，Reader
		目的：OutputStream ，Writer
	2，明确数据：
		源：是纯文本吗？是 Reader
		目的；是纯文本吗？是 Writer
	3，明确设备：
		源：硬盘上的一个文件。	FileReader
		目的：硬盘上的一个文件。FileWriter
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");
	4，需要额外功能吗？
		需要，高效，使用buffer
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));


2，读取键盘录入，将数据存储到一个文件中。
	1，明确体系：
		源：InputStream ，Reader
		目的：OutputStream ，Writer
	2，明确数据：
		源：是纯文本吗？是 Reader
		目的；是纯文本吗？是 Writer
	3，明确设备：
		源：键盘，System.in
		目的：硬盘，FileWriter
		InputStream in = System.in;
		FileWriter fw = new FileWriter("a.txt");
	4，需要额外功能吗？
		需要，因为源明确的体系时Reader。可是源的设备是System.in。
		所以为了方便于操作文本数据，将源转成字符流。需要转换流。InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw  = new FileWriter("a.txt");
		需要高效不?需要。Buffer
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("a.txt"));


3，读取一个文本文件，将数据展现在控制台上。
		1，明确体系：
			源：InputStream ，Reader
			目的：OutputStream ，Writer
		2，明确数据：
			源：是纯文本吗？是 Reader
			目的；是纯文本吗？是 Writer
		3，明确设备：
			源：硬盘文件，FileReader。
			目的：控制台：System.out。
			FileReader fr = new FileReader("a.txt");
			OutputStream out = System.out;
		4，需要额外功能？
			因为源是文本数据，确定是Writer体系。所以为了方便操作字符数据，
			需要使用字符流，但是目的又是一个字节输出流。
			需要一个转换流，OutputStreamWriter
			FileReader fr = new FileReader("a.txt");
			OutputStreamWriter osw = new OutputStreamWriter(System.out);

			需要高效吗？需要。
			BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
			BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

4，读取键盘录入，将数据展现在控制台上。
		1，明确体系：
			源：InputStream ，Reader
			目的：OutputStream ，Writer
		2，明确数据：
			源：是纯文本吗？是 Reader
			目的；是纯文本吗？是 Writer
		3，明确设备：
			源：键盘：System.in
			目的：控制台：System.out
			InputStream in = System.in;
			OutputStream out = System.out;
		4，需要额外功能吗？
			因为处理的数据是文本数据，同时确定是字符流体系。
			为方便操作字符数据的可以将源和目的都转成字符流。使用转换流。
			为了提高效率，使用Buffer
			BufferedReader bufr  =new BufferedReader(new InputStreamReader(Systme.in));
			BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

5，读取一个文本文件，将文件按照指定的编码表UTF-8进行存储，保存到另一个文件中。
		1，明确体系：
			源：InputStream ，Reader
			目的：OutputStream ，Writer
		2，明确数据：
			源：是纯文本吗？是 Reader
			目的；是纯文本吗？是 Writer

		3，明确设备：
			源：硬盘：FileReader.
			目的：硬盘：FileWriter

			FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("b.txt");
		4，额外功能：
			注意：目的中虽然是一个文件，但是需要指定编码表。
			而直接操作文本文件的FileWriter本身内置的是本地默认码表。无法明确具体指定码表。
			这时就需要转换功能。OutputStreamWriter,而这个转换流需要接受一个字节输出流，而且
			对应的目的是一个文件。这时就使用字节输出流中的操作文件的流对象。FileOutputStream.
			FileReader fr = new FileReader("a.txt");
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"),"UTF-8");

			需要高效吗？
			BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));
			BufferedWriter bufw =
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b.txt"),"UTF-8"));

目前为止，10个流对象重点掌握。
字符流：
FileReader
FileWriter

BufferedReader
BufferedWriter

InputStreamReader
OutputStreamWrier
字节流：

FileInputStream
FileOutputStream

BufferedInputStream
BufferedOutputStream


//TODO --stop java here

//BK --day22File类 4 Cons+ 49 Mends -----------------------------
31-IO流(File对象-构造函数&字段).avi (14:45)
FileDemo.java
	4 Fields and 4 Constructions


32-IO流(File对象-常见功能-获取).avi (19:40)     FileMethodDemo.java
33-IO流(File对象-常见功能-创建和删除).avi (16:35) FileMethodDemo.java
34-IO流(File对象-常见功能-判断).avi ( 6:55)     FileMethodDemo.java
35-IO流(File对象-常见功能-重命名).avi ( 4:40)    FileMethodDemo.java

36-IO流(File对象-常见功能-系统根目录和容量获取).avi ( 7:46)
FileListDemo.java
	获取当前目录下的文件以及文件夹的名称，包含隐藏文件。
	调用list方法的File对象中封装的必须是目录。
	否则会发生NullPointerException
	如果访问的系统级目录也会发生空指针异常。

	如果目录存在但是没有内容，会返回一个数组，但是长度为0.


37-IO流(File对象-常见功能-获取目录内容).avi ( 6:26)
FileListDemo.java


38-IO流(File对象-常见功能-过滤器).avi (19: 3)

File类：
	用于将文件和文件夹封装成对象。
	1，创建。
		boolean createNewFile():如果该文件不存在，会创建，如果已存在，则不创建。不会像输出流一样会覆盖。
		boolean mkdir();
		boolean mkdirs();
	2，删除。
		boolean delete();
		void deleteOnExit();
	3，获取：
		String getAbsolutePath();
		String getPath();
		String getParent();
		String getName();
		long length();
		long lastModified();
	4，判断：
		boolean exists();
		boolean isFile();
		boolean isDirectory();
	5，



//BK --day23 IO-6 Others--------------------
IO中的其他功能流对象：

1,打印流：
	PrintStream：字节打印流。
		特点：
		1，构造函数接收File对象，字符串路径，字节输出流。意味着打印目的可以有很多。
		2，该对象具备特有的方法 打印方法 print println,可以打印任何类型的数据。
		3，特有的print方法可以保持任意类型数据表现形式的原样性，将数据输出到目的地。
			对于OutputStream父类中的write，是将数据的最低字节写出去。

	PrintWriter：字符打印流。
		特点：
		1，当操作的数据是字符时，可以选择PrintWriter，比PrintStream要方便。
		2，它的构造函数可以接收 File对象，字符串路径，字节输出流，字符输出流。
		3，构造函数中，如果参数是输出流，那么可以通过指定另一个参数true完成自动刷新，该true对println方法有效。

什么时候用？
当需要保证数据表现的原样性时，就可以使用打印流的打印方法来完成，这样更为方便。
保证原样性的原理：其实就是将数据变成字符串，在进行写入操作。



SequenceInputStream:
	特点：
	1，将多个字节读取流和并成一个读取流，将多个源合并成一个源，操作起来方便。
	2，需要的枚举接口可以通过Collections.enumeration(collection);



ObjectInputStream 和 ObjectOutputStream

对象的序列化和反序列化。

writeObject  readObject

Serializable标记接口

关键字：transient


RandomAccessFile:
	特点：
	1，即可读取，又可以写入。
	2，内部维护了一个大型的byte数组，通过对数组的操作完成读取和写入。
	3，通过getFilePointer方法获取指针的位置，还可以通过seek方法设置指针的位置。
	4，该对象的内容应该封装了字节输入流和字节输出流。
	5，该对象只能操作文件。

	通过seek方法操作指针，可以从这个数组中的任意位置上进行读和写
	可以完成对数据的修改。
	但是要注意：数据必须有规律。



管道流：需要和多线程技术相结合的流对象。
PipedOutputStream
PipedInputStream




用操作基本数据类型值的对象。
	DataInputStream
	DataOutputStream



设备是内存的流对象。
ByteArrayInputStream ByteArrayOutputStream
CharArrayReader  CharArrayWriter
--------------------

IO流体系：

字符流：
Reader
	|--BufferedReader:
		|--LineNumberReader
	|--CharArrayReader
	|--StringReader
	|--InputStreamReaer
		|--FileReader


Writer
	|--BufferedWriter
	|--CharArrayWriter
	|--StringWriter
	|--OutputStreamWriter
		|--FileWriter
	|--PrintWriter



字节流：
InputStream
	|--FileInputStream:
	|--FilterInputStream
		|--BufferedInputStream
		|--DataInputStream
	|--ByteArrayInputStream
	|--ObjectInputStream
	|--SequenceInputStream
	|--PipedInputStream


OutputStream
	|--FileOutputStream
	|--FilterOutputStream
		|--BufferedOutputStream
		|--DataOutputStream
	|--ByteArrayOutputStream
	|--ObjectOutputStream
	|--PipedOutputStream
	|--PrintStream

RandomAccessFile:

//BK --day36 Debug Tricks
http://langgufu.iteye.com/blog/1168366
9.我们常说的断点(breakpoints)是指line breakpoints,除了line breakpoints,还有其他的断点类型：field(watchpoint)breakpoint,method breakpoint ,exception breakpoint.
10.field breakpoint 也叫watchpoint(监视点) 当成员变量被读取或修改时暂挂
11.添加method breakpoint 进入/离开此方法时暂挂(Run-method breakpoint)
12.添加Exception breakpoint 捕抓到Execption时暂挂(待续...)









 *
 *
</pre>
 * @author zhanghongwei
 *
 */
package bk;

import java.io.IOException;
import java.io.InputStream;

class BK
{
	public static void main(String[] args) throws IOException
	{
		// BK --day03 2while 两重while嵌套
		BK.readMyKey();
	}

	/**
	 * <pre>
	 * 1 read value from system.in and package it to a string.
	 *
	 * 2 while value is over , stop
	 *
	 * 3 while not over, loop get new value
	 * </pre>
	 *
	 * @throws IOException
	 */
	final private static StringBuilder stringBuilder = new StringBuilder();
	final private static InputStream inputValue = System.in;

	private static void readMyKey() throws IOException
	{
		String finalValue = BK.stringBuilder.toString().toUpperCase();
		int read;
		while (true)
		{
			if ("OVER".equals(finalValue))
			{
				break;
			}

			read = BK.inputValue.read();
			while (true)
			{
				if (read == '\n')
				{
					break;
				}
				BK.stringBuilder.append((char) read);
				read = BK.inputValue.read();
			}
			finalValue = BK.stringBuilder.toString().toUpperCase();
			System.out.println(finalValue);
			BK.stringBuilder.delete(0, BK.stringBuilder.length());
		}
	}
}
