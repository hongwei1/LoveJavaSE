/**
<pre>
//BK --day01 概述-JVM 环境变量
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

//BK --day02 1Keywords-53个
0 Note02.java 		5t -- p1--P19   I took the notes by going though the PPT.
51+2个保留字(const,goto)=53个关键字(java的关键字都是小写的) http://flycatdeng.iteye.com/blog/1180264
	strictfp的意思是FP-strict，也就是说精确浮点的意思。在Java虚拟机进行浮点运算时，如果没有指定strictfp关键字时，
	Java的编译器以及运行环境在对浮点运算的表达式是采取一种近似于我行我素的行为来完成这些操作，以致于得到的结果往往无法
	令你满意。而一旦使用了strictfp来声明一个类、接口或者方法时，那么所声明的范围内Java的编译器以及运行环境会完全依照
	浮点规范IEEE-754来执行。因此如果你想让你的浮点运算更加精确，而且不会因为不同的硬件平台所执行的结果不一致的话，那就
	请用关键字strictfp。

	如果用transient声明一个实例变量，当对象存储时，它的值不需要维持。例如：
	Java代码  收藏代码
	class T {
	   transient int a;  //不需要维持
	   int b;  //需要维持
	}

	volatile修饰符告诉编译器被volatile修饰的变量可以被程序的其他部分改变。在多线程程序中，有时两个或更多的线程共享
	一个相同的实例变量。考虑效率问题，每个线程可以自己保存该共享变量的私有拷贝。实际的变量副本在不同的时候更新，如当进入
	synchronized方法时。

//BK --day02 2Identifiers-38个
26(个英文字母大小写)+10(0-9)+2 (_ $)= 38 identier

//BK --day02 3Comments-3种
//BK --day02 4Variables 1void+8primative
VarDemo.java       -- P10--P15  10-Java语言基础(变量的基本演示).avi
	八种基本类型：
		数值型--整数类型(byte-8bits, short-16bits, int-32bits, long-64bits)
		     --浮点类型(float-32bits, double-64bits)
		字符型(char-[0～65535])
		布尔型（boolean）
	三种引用：
		类(class)-String ,int []a,
		接口(interface)
		数组( [ ] )
	所占空间:
		基本型别	大小  	最小值	    最大值
		boolean	-----	-----	    ------
		char	16-bit	Unicode 0	Unicode 2^16-1
		byte	8-bit	-128	    +127
		short	16-bit	-2^15	    +2^15-1
		int		32-bit	-2^31	    +2^31-1
		long	64-bit	-2^63	    +2^63-1
		float	32-bit	IEEE754	    IEEE754
		double	64-bit	IEEE754	    IEEE754
		void

//BK --day02 4Variables 2进制转换
HexOctalDecimal.java
	十六,十,八进制的显示(Hex,Octal,Decimal):
		Integer.toBinaryString(i)
		Integer.toOctalString(i)
		Integer.toHexString(i)

//BK --day02 4Variables 3类型提升
VarDemo2.java      -- P15       11-Java语言基础(类型提升&强制转换).avi

//BK --day02 5Operators 28种operators
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
OperateDemo.java   -- P17-P18   arithmetic operator eg: ++
OperateDemo2.java  -- P19       assignment operator
Note03.java
OperateDemo3.java -- P20 compare and logic operator
OperateDemo4.java -- P23 Bit operator
OperateDemo5.java -- P26 07-Java语言基础(三元运算符).avi

//BK --day03 6语句 1if&swich
2.6 程序流程控制
IfDemo.java  -- P28
IfDemo2.java -- P28
IfDemo3.java -- P28
IfTest.java
IfTest2.java

SwitchDemo.java
SwitchTest.java
if和switch的应用：
	if:
		1,对具体的值进行判断。
		2,对区间判断。
		3,对运算结果是Boolean类型的表达式进行判断。
	switch:
		1,对具体的值进行判断。
		2,值的个数通常是固定的。
	summary:
		对于几个固定的值判断，建议使用switch语句，因为switch语句会将具体的答案都加载进内存。
		效率相对高一点。

//BK --day03 6语句 2While
WhileDemo.java
DoWhileDemo.java

//BK --day04 6语句 3For
ForDemo.java -- P33  22-Java语言基础(语句-for).avi

for和while的特点：
			1,for和while可以互换。
			2,格式上的不同，在使用上有点小区别。 如果需要通过变量来对循环进行控制，该变量只作为循环增量存在时，区别就体现出来了。
			3,they are mostly the same ,just make a difference for the people to read.

BreakContinueDemo.java
06-Java语言基础(语句-break&continue).avi
	break:跳出。
		break作用的范围：要么是switch语句，要么是循环语句。
		记住：当break语句单独存在时，下面不要定义其他语句，因为执行不到。
			break跳出所在的当前循环。
			如果出现了循环嵌套，break想要跳出指定的循环，可以通过标号来完成。
	continue:继续。
		作用的范围：循环结构。
		continue：结束本次循环，继续下次循环。
		如果continue单独存在时，下面不要有任何语句，因为执行不到。

//BK --day04 7Functions
FunctionDemo.java
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

	 重载。
	 	1，同一个类，
	 	2，同名。
	 	3，参数个数不同。or 参数类型不同。
	 	4，函数重载和返回值类型无关。
	 	5，java是严谨性语言，如果函数出现的调用的不确定性，会编译失败。

//BK --day04 8Array
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
	3，局部代码块:限定局部变量的生命周期。

ArrayDemo2.java //BK --day04 8Array 1Exceptions
	4，数组异常 -2 all RuntimeExceptions
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
	8 数组的算法
		冒泡排序.bmp
		选择排序.bmp
		选择排序2.bmp
		折半查找.bmp
	9 面试题
		给定一个有序的数组，如果往该数组中存储一个元素，并保证这个数组还是有序的，
		那么个元素的存储的角标为如何获取。
		{13,15,19,28,33,45,78,106};
	10 反转
		给定一个数组，对其进行反转。
		{3,1,6,5,8,2} -->
		{2,8,5,6,1,3};
		其实就是头尾元素的位置置换。
	11 查表法
		什么时候使用数组呢？ 如果数据出现了对应关系，而且对应关系的一方是有序的数字编号。并作为角标使用。 这时就必须要想到数组的使用。
		就可以将这些数据存储到数组中。 根据运算的结果作为角标直接去查数组中对应的元素即可。

//BK --day06 8Array 3DimensionalArray
Array2Demo.java
二维数组图解.bmp

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

	成员变量和局部变量的区别：//BK --day06 class 1成员变量和局部变量的区别
		1， 成员变量定义在类中，整个类中都可以访问。
		   局部变量定义在函数，语句，局部代码块中，只在所属的区域有效。
		2， 成员变量存在于堆内存的对象中。
			局部变量存在于栈内存的方法中。
		3， 成员变量随着对象的创建而存在，随着对象的消失而消失。
			局部变量随着所属区域的执行而存在，随着所属区域的结束而释放。
		4， 成员变量都有默认初始化值。
			局部变量没有默认初始化值。

对象的内存图.bmp
Demo06.java //BK --day06 Class 2基本参数&引用参数
基本和引用类型参数传递图解.bmp


PersonDemo06.java  //BK --day06 Class 4Encapsulation
14-面向对象(封装-代码示例).avi (15:40)
15-面向对象(封装-思想).avi (14:55)


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
			注意：2.1只能定义在构造函数的第一行,因为初始化动作要先执行。
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

//BK --day07 Class 4Encapsulation 3Static 2使用注意事项
	3 静态使用的注意事项：
		1，静态方法只能访问静态成员。(非静态方法既可以访问静态，又可以访问非静态)
		2，静态方法中不可以使用this或者super关键字。
		3，主函数是静态的。

MainDemo.java
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
itcastday10.InnerClassDemo3
static 可以修饰成员，当成员是类时，也可以用static修饰 --//BK --day07 Class 4Encapsulation 3Static 5Static修饰内部类


//
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
ExtendsDemo08.java
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
继承弊端：打破了封装性。
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
					void show1(){}
					void show2(){}
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
InterfaceDemo2.java //BK --day09 Class 7Interface 2抽象类和接口的异同点
	7 抽象类和接口的异同点
		相同点：
			都是不断向上抽取而来的。
		不同点：
			1，抽象类需要被继承，而且只能单继承。
			   接口需要被实现，而且可以多实现。
			2，抽象类中可以定义抽象方法和非抽象方法，子类继承后，可以直接使用非抽象方法。可以定义构造。
			   接口中只能定义抽象方法，必须由子类去实现。不可以定义构造函数。
			3，抽象类的继承，是is  a 关系，在定义该体系的基本共性内容。
			   接口的实现,  是has a 关系，在定义体系额外功能。
		eg:犬按功能分：有导盲犬，搜爆犬- 他们是犬，具有导盲，搜爆的功能。

Laptop.java  //BK --day10 Class 7Interface 3PC-USB
USB.bmp

----------------//BK --day10 Class 8Polymorphism
DuoTaiDemo.java
	1 Definition  对象的多态性:父类型引用指向了子类对象。
		class 动物{}
		class 猫 extends 动物{}
		class 狗 extends 动物{}
		猫 x = new 猫();
		动物 x = new 猫();//一个对象，两种形态。

		猫这类事物即具备者猫的形态，又具备着动物的形态。
		这就是对象的多态性。
		简单说：就是一个对象对应着不同类型.

		多态在代码中的体现：
			父类或者接口的引用指向其子类的对象。

	2 多态的好处：//BK --day10 Class 8Polymorphism 1好处弊端前提
		提高了代码的扩展性，前期定义的代码可以使用后期的内容。
		eg:void method(Animal a)//Animal a = new Dog();  only design a method.

	3 多态的弊端：
		前期定义的内容不能使用(调用)后期子类的特有内容。
		eg:a.catchMouse(); // a is animal ,but catMouse is belong to cat. it can not use there.

	4 多态的前提：
		1，类间必须有关系：继承 or 实现。
		2，要有覆盖。

	5 转型//BK --day10 Class 8Polymorphism 2向上向下转型
		1 向上转型
			Animal a = new Cat();
			自动类型提升，猫对象提升了动物类型。
			但是特有功能无法访问作用就是限制对特有功能的访问。c.catchMouse(); is wrong!
			专业讲：向上转型。将子类型隐藏。就不能使用子类的特有方法。
		2 向下转型
			//如果还想用具体动物猫的特有功能,你可以将该对象进行向下转型。
			Cat c = (Cat)a; //向下转型的目的是为了使用子类中的特有方法。
			c.eat();
			c.catchMouse();
		3 注意：
			1 对于转型，自始自终都是子类对象在做着类型的变化。
			2 会抛出异常：
				Animal a1 = new Dog();
				Cat c1 = (Cat)a1; //ClassCastException

DuoTaiDemo2.java
		4 eg:毕老师和毕姥爷的故事。
			毕姥爷 x= 毕老师();  dress up as father.No his own functions.

			毕老师 y= (毕老师)x;  turn into himself, has many own features.

	6 if(a instanceof Cat)
			instanceof：用于判断对象的具体类型,只能用于引用数据类型判断
			通常在向下转型前用于健壮性的判断。

DuoTaiDemo3.java //BK --day10 Class 8Polymorphism 4变量函数
	7 成员的特点：
		1，成员变量。
			编译时：参考引用型变量所属的类中的是否有调用的成员变量，有，编译通过，没有，编译失败。
			运行时：参考引用型变量所属的类中的是否有调用的成员变量，并运行该所属类中的成员变量。
			简单说：编译和运行都参考等号的左边。哦了。
			eg: only care about in the Fu class
				Fu f = new Zi();
				f.show();
成员函数-动态绑定.png
		2，成员函数(非静态)。
			编译时：参考引用型变量所属的类中的是否有调用的函数。有，编译通过，没有，编译失败。
			运行时：参考的是对象所属的类中是否有调用的函数。
			简单说：编译看左边，运行看右边。

			tips: why is it different from variables?
				  因为成员函数存在覆盖特性，动态绑定。
			eg  : Fu f = new Zi();
				  f.show();
静态成员函数-静态的方法区绑定类名
		3，静态函数。
			编译时：参考引用型变量所属的类中的是否有调用的静态方法。
			运行时：参考引用型变量所属的类中的是否有调用的静态方法。
			简单说，编译和运行都看左边。

			tips: 其实对于静态方法，是不需要对象的。直接用类名调用即可。
			eg :f.staticMethod();

动态绑定.png  //BK --day10 Class 8Polymorphism 4变量函数 4Eg
动态绑定遇到private,相当于final,静态绑定了.png


----------------//BK --day10 Class 9Inner class
InnerClassDemo.java
	1 Definition
		将一个类定义在另一个类的里面，对里面那个类就称为内部类（内置类，嵌套类）。

	2 内部类访问特点：
		1，内部类可以直接访问外部类中的成员。 		--即使private 也可以访问
		2，外部类要访问内部类，必须建立内部类的对象，即使内部类private，也可以创建。

	3 一般用于类的设计：
		分析事物时，发现该事物描述中还有事物，而且这个事物还在访问被描述事物的内容。
		这时就是还有的事物定义成内部类来描述。
		eg: I have heart. The heart is inner class, it use lots of my body resource.

	4  Three call ways
		1  直接访问外部类中的内部类中的成员。
		// Outer.Inner in = new Outer().new Inner();
		// in.show();

		2  如果内部类是静态的。 相当于一个外部类
		// Outer.Inner in = new Outer.Inner();
		// in.show();

		3  如果内部类是静态的，成员是静态的。
		// Outer.Inner.function();
		tips:if Inner method is static,  the inner class must be static.

InnerClassDemo2.java
	5 为什么内部类能直接访问外部类中成员呢？
		那是因为内部类持有了外部类的引用。  "外部类名.this"
		eg: System.out.println(Outer2.this.num);

// BK --day10 Class 9Inner class 4注意事项
InnerClassDemo3.java
	6 内部类可以存放在局部位置上。
		内部类在局部位置上只能访问局部中被final修饰的局部变量。JDK1.8 支持了？？

----------------//BK --day10 Class 9Inner class 3匿名内部类
InnerClassDemo4.java
	1 Definition:
		前提：
			匿名内部类必须继承或者实现一个外部类或者接口。
		本质：其实就是一个匿名子类，就是内部类的简写格式。

	2 格式：new 父类or接口(){子类内容}

// BK --day10 Class 9Inner class 3匿名内部类 使用场景
InnerClassDemo5.java
	3  通常的使用场景：
		当函数参数是接口类型时，而且接口中的方法不超过三个。
		可以用匿名内部类作为实际参数进行传递
		eg:show(new Inter()

InnerClassDemo6.java
	4 一道面试题：
		Object obj = new Object()
		{
			public void show()
			{
				System.out.println("show run");
			}

		};
		obj.show();//因为匿名内部类这个子类对象被向上转型为了Object类型。
				  //这样就不能在使用子类特有的方法了。


//BK --day10 Class 终极类初始化
构造代码块初始化过程.bmp
FinalConstructions.java
FinalConstructions2.java
先初始化父类的静态代码-->初始化子类的静态代码-->
     (创建实例)-->父类默认初始化-->父类显示初始化-->父类构造代码块-->子类默认初始化
             -->初始化父类构造函数-->子类显示初始化-->子类构造代码块-->初始化子类构造函

//BK --day11 Exception
ExceptionDemo.java
异常抛出过程.bmp
	1 definition：
		异常:是在运行时期发生的不正常情况。在java中用类的形式对不正常情况进行了描述和封装对象。
			描述不正常的情况的类，就称为异常类。
			其实异常就是java通过面向对象的思想将问题封装成了对象,用异常类对其进行描述。

		以前:正常流程代码和问题处理代码相结合. 			 eg:public static void sleep2(int time)
		现在:将正常流程代码和问题处理代码分离。提高阅读性. eg:public static void sleep(int time)

	2 体系 System
		不同的问题用不同的类进行具体的描述。 比如角标越界,空指针等等,问题很多，意味着描述的类也很多，将其共性进行向上抽取，形成了异常体系。

		1 最终问题（不正常情况）就分成了两大类。
			|--1，一般不可处理的。Error
				特点：是由JVM抛出的严重性的问题,这种问题发生一般不针对性处理,直接修改程序
				     eg:int[] arr = new int[1024*1024*800];
				     //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
			|--2，可以处理的。Exception
				eg: int [] arr =null; sop(arr[0]);
				//Exception in thread "main" java.lang.NullPointerException

		2 Throwable:无论是error，还是exception，问题发生就应该可以抛出，让调用者知道并处理。
			该体系的特点就在于Throwable及其所有的子类都具有可抛性。

		3 可抛性到底指的是什么呢？怎么体现可抛性呢？
			其实是通过两个关键字来体现的。
			throws & throw ,凡是可以被这两个关键字所操作的类和对象都具备可抛性.

		4 该体系的特点：
			子类的后缀名都是用其父类名作为后缀，阅读性很强。

ExceptionDemo2.java
	3 运行原理 ( running principle )
		1 As the information said, the exception will be throwered level by level.
		  Until to the main and to JVM, if no one resolve it.

			Exception in thread "main" java.lang.NullPointerException
			at itcastday11.Demo2.method(ExceptionDemo2.java:15)
			at itcastday11.ExceptionDemo2.main(ExceptionDemo2.java:39)
		2 the sentences under the exception will not be executed.
			eg: System.out.println("over");
		3 When I know how the exception work by default, I can initialize my own exceptions.
			eg: throw new NullPointerException("数组的引用不能为空！");

ExceptionDemo3.java
	异常处理trycatch.bmp
	4 自定义异常
		如果让一个类称为异常类，必须要继承异常体系，因为只有称为异常体系的子类才有资格具备可抛性。
		才可以被两个关键字所操作，throws & throw
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
		1 // return ; 					 -- finally 执行
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

ExceptionDemo6.java //BK --day11 Exception 子类注意
	10 异常的注意事项：
		1，子类在覆盖父类方法时，父类的方法如果抛出了异常，
			那么子类的方法只能抛出父类的异常或者该异常的子类。
		2，如果父类抛出多个异常，那么子类只能抛出父类异常的子集。

		简单说：子类覆盖父类只能抛出父类的异常或者子类或者子集。

		注意：如果父类的方法没有抛出异常，那么子类覆盖时绝对不能抛，就只能try .


//BK --day11 Object
ObjectDemo.java --1Cons (JVM调用不能显示调用)+9public methods+2protected (clone,finalize)+1native (registerNatives)
	Object:所有类的根类，Object是不断抽取而来，具备着所有对象都具备的共性内容。
	1 Object构造函数： --1 by JVM, can not control
	    static {
	        registerNatives();
	    }
	    随着类的加载而加载，调用本地方法，加载到方法区。
	01-面向对象(Object类-equals方法).avi (15:13)
		Default：
			1 比较对象地址
			2 默认形式：boolean equals(Object obj)，可以任意两个对象比较。
			eg: public boolean equals(Person obj) (没overwrite equals, input must be Object )
	02-面向对象(Object类-equals方法覆盖).avi (15:22)
		1 Overwrite：
			根据对象的特有内容，建立判断对象是否相同的依据，传入参数还必须是Object。
			If write like this "equals(Person obj)"--It is not overwrite
		2 instanceof
			取到实例进行比较 : "Hello" instanceof String
		eg: public boolean equals(Object obj) (overwrite equals)
	03-面向对象(Object类-hashCode方法).avi ( 8:17)
		default: 调用系统的方法。
	04-面向对象(Object类-getClass方法).avi (13:10)
		类对象.gif
	05-面向对象(Object类-toString方法).avi ( 4:30)

//BK --day12 A包管理
              public		protected		default		  private
同一类中        ok             ok              ok           ok
同一包中        ok             ok              ok
不同包的子类中   ok             ok
不同包不在子类   ok

PackageDemo.java //BK --day12 A包管理 1Java命令行
02-面向对象(包-包之间访问-protected).avi
	Basic Java Commands:
		javac -d . DemoB.java   -- 编译文件会自动加路劲，产生文件夹
		java itcastday12.DemoB  -- 执行生成的字节码文件，要加包的路径
DemoA.java --子类
DemoB.java --父类//BK --day12 A包管理 2Protected

03-面向对象(包-导入import).avi
//import packa.DemoA; //导入了packa包中的DemoA类
import packa.*;       //导入了packa包中所有的类
import packa.abc.*;   //并不导入所有目录下的包,需要自己写包路劲，自己导入

packa\DemoA.class
packa\abc\DemoAbc.class

//导包的原则：用到哪个类，就导入哪个类。
//import 干嘛用的啊？为了简化类名书写。

//BK --day12 A包管理 3jar
04-面向对象(Jar包).avi
JarDemo.java
haha.jar --相当于class 文件夹，只要设定classpath就可以运行其中类了：
eg: set classpath = ./haha.jar
    java pack.JarDemo -->Helo Jar

//BK --day12 M-Thread
ThreadDemo.java
	1:Definition
		进程：正在进行中的程序(直译). 只分配开应用程序的应用空间
		线程：就是进程中一个负责程序执行的控制单元(执行路径)；一个进程中可以多执行路径，称之为多线程。
			 每一个线程都有自己运行的内容。这个内容可以称为线程要执行的任务。
		关系：一个进程中至少要有一个线程，开启多个线程是为了同时运行多部分代码。

	2：Pros and cons
		好处：解决了多部分同时运行的问题。
		弊端：线程太多会降低效率，其实应用程序的执行都是在做着快速的切换完成的。这个切换是随机的。
		eg:  I/O例子：点对点的聊天工具，需要在我们编写信息的同时能够接受并打印出来对方说的话。
		     如果将信息的发送和接受放在一个线程里，发送和接受两者不能兼顾。

	3: JVM M-Thread
		JVM启动时就启动了多个线程，至少有两个线程可以分析的出来。
			1，执行main函数的线程--该线程的任务代码都定义在main函数中。
			2，负责垃圾回收的线程。
		eg: ThreadDemo 中有main和多个匿名对象。匿名对象一创建就是垃圾，就等着被回收的。
		tips:垃圾回收还没结束，虚拟机就可能直接关闭，就不等垃圾回收了，所有有时只输出一个或两个值（ ThreadDemo 中的结果）

ThreadDemo2.java
05-多线程(多线程创建的方式一-继承Thread类).avi (25:27)
	4：Main Threading Example
	5: Multithread
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

	6: Thread name and methods -- 06-多线程(Thread类中的方法&线程名称).avi (10:33)
		//BK --day12 M-Thread 01Thread 8Cons+42Meds
		1 methods:
			1 getName() --Returns this thread's name.
			2 Thread.currentThread() -- Returns a reference to the currently executing thread object.
			3 Thread.currentThread().getName() -- Returns this running thread's name.
		2 可以通过Thread的getName获取线程的名称 Thread-编号(从0开始)
		  主线程的名字就是main.

ThreadDemo3.java
07-多线程(多线程运行图解).avi (15:30)
多线程运行图.bmp
	7: Memory using
		different threads use different stack memory, and they are independent.
		If main thread meet errors ,the other threads can work properly.
08-多线程(线程的状态).avi (22:40)
线程4状态.png
	8 :	MutiThread states //BK --day12 M-Thread 03FourStates
			1 concepts
			    CPU执行权 : 现在做(Yes1);
			    执行资格   ：在排队(Yes2)
				四个状态：被创建--> 执行   -->冻结   -->临时阻塞  -->消亡
				        No,No-->Yes,Yes-->No,No -->No,Yes  --> No,No
			 tips: only one thread has the execute right ,all others are in the block or freeze.

ThreadDemo13.java
09-多线程(创建线程的第二种方式—实现Runnable接口).avi (22:56)
		二:实现Runnable接口。
			1，定义类实现Runnable接口。
			2，覆盖接口中的run方法，将线程的任务代码封装到run方法中。
			3，通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数传递。
				为什么？因为线程的任务都封装在Runnable接口子类对象的run方法中。
				所以要在线程对象创建时就必须明确要运行的任务。
			4，调用线程对象的start方法开启线程。

10-多线程(第二种方式的细节).avi ( 7:41)
	传入接口的实现细节：Thread内部有Thread（Runnable Target)构造函数，
		class Thread
		{
			private Runnable r;

			Thread(){}

			Thread(Runnable r)
			{
				this.r = r;
			}

			public void run()
			{
				if (this.r != null)
				{
					this.r.run();
				}
			}

			public void start()
			{
				this.run();
			}
		}

11-多线程(第二种方式的好处).avi (11:51)
Runnable实现的思想.png
		实现Runnable接口的好处：
			1，将线程的任务从线程的子类中分离出来，进行了单独的封装。
			   按照面向对象的思想将任务的封装成对象。
			2，避免了java单继承的局限性。
		所以，创建线程的第二种方式较为常用。

//BK --day13 M-Thread 05Model-单任务多线程
TicketDemo3.java -- three different ways. finally use the syn-block
售票内存图.bmp
12-多线程(卖票示例).avi (27:26)

13-多线程(线程安全问题的现象).avi (14:42) --210
	eg: way1 & way2 both has the problem


14-多线程(线程安全问题产生的原因).avi ( 6:21)
多线程出错.gif
	线程安全问题产生的原因：
		1，多个线程在操作共享的数据。
		2，操作共享数据的线程代码有多条。
		3，当一个线程在执行操作共享数据的多条代码过程中，其他线程参与了运算，就会导致线程安全问题。

//BK --day13 M-Thread 06同步代码块和同步函数
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
16-多线程(同步的好处和弊端).avi (11:55)
	1同步的机制：synchronized(对象):“对象”是个锁，有对象进入同步块，则加锁，别人进不去。直到它出来，才解锁。
	2同步的好处：解决了线程的安全问题。
	3同步的弊端：相对降低了效率，因为同步外的线程的都会判断同步锁。

17-多线程(同步的前提).avi ( 6:34)
	同步的前提：同步中必须有多个线程并使用同一个锁。

18-多线程(同步函数).avi (15: 9)
BankDemo.java
	在函数上加个关键字“synchronized”，就可以变成同步函数了。

SynFunctionLockDemo.java
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

SingleDemo.java //BK --day13 M-Thread 07单例
21-多线程(单例模式涉及的多线程问题).avi (12:13)--300
		1 饿汉式，没有安全问题
		2 SingleDemo line 39--41//懒汉式
			//加入同步为了解决多线程安全问题。
			//加入双重判断是为了解决效率问题。


DeadLockDemo.java //BK --day13 M-Thread 08死锁
DeadLockTest.java --remember one Lock, easy one .
22-多线程(死锁示例).avi (18:38)
	1 死锁：常见情景之一：同步的嵌套。
			eg:DeadLockDemo.java
		   常见情景之二：while（flag）wait，no notify()。
		   	eg:ProducerConsumerDemo.java line 36.while + notify()

郁闷答疑图解.bmp
郁闷答疑.avi
--讲了同步锁必须相同，会同步锁错乱


//BK --day14 M-Thread 09多线程通信
23-多线程(线程间通信-示例).avi (37: 4)
ResourceDemo.java

24-多线程(线程间通信-等待唤醒机制).avi (34:23)
ResourceDemo2.java
wait-notify应用.gif
	1 等待/唤醒机制，涉及的方法：
		1，wait(): 释放执行权和执行资格，让线程处于冻结状态，被wait的线程会被存储到线程池中。
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

//BK --day14 M-Thread 10Model-多生产者多消费者
26-多线程(线程间通信-多生产者多消费者问题).avi (34: 3)
ProducerConsumerDemo01.java
	if判断标记，只有一次，会导致不该运行的线程运行了。出现了数据错误的情况。
	while判断标记，解决了线程获取执行权后，是否要运行！

ProducerConsumerDemo02.java
	notify:只能唤醒一个线程，如果本方唤醒了本方，没有意义。而且while判断标记+notify会导致死锁。
	notifyAll解决了本方线程一定会唤醒对方线程的问题。

27-多线程(线程间通信-多生产者多消费者问题解决).avi (13:23)
ProducerConsumerDemo.java //BK --day14 M-Thread 10Model-多生产者多消费者 final
T11ManyProduceManyBuyers.java -- My own practice on it without any issues
多生产多消费.bmp
	多生产者，多消费者的问题，完美解决方案


//BK --day14 M-Thread 11JDK1.5 New
28-多线程(线程间通信-多生产者多消费者问题-JDK1.5新特性-Lock).avi (18:41)
ProducerConsumerDemo2.java -- line 33
Lock升级原因.gif

	jdk1.5以后将同步和锁封装成了对象。
	并将操作锁的隐式方式定义到了该对象中，
	将隐式动作变成了显示动作。

	Lock接口： 出现替代了同步代码块或者同步函数。将同步的隐式锁操作变成现实锁操作。
	同时更为灵活。可以一个锁上加上多组监视器。
	lock():获取锁。
	unlock():释放锁，通常需要定义finally代码块中。

29-多线程(线程间通信-多生产者多消费者问题-JDK1.5新特性-Condition).avi (16:11)
ProducerConsumerDemo2.java -- line 38
	Condition接口：出现替代了Object中的wait notify notifyAll方法。
				将这些监视器方法单独进行了封装，变成Condition监视器对象。
				可以任意锁进行组合。
	await();
	signal();
	signalAll();

30-多线程(线程间通信-多生产者多消费者问题-JDK1.5解决办法).avi ( 9: 6)
ProducerConsumerDemo2.java -- line 82
分开不用的conditions.gif
 	tips：两个监视器，分别件事消费者和生产者

31-多线程(线程间通信-多生产者多消费者问题-JDK1.5解决办法-范例).avi (14:48)--506
BoundedBuffer.java
范例.gif

//BK --day14 M-Thread 12 Other Methods
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
StopThreadDemo.java --t2.setDaemon(true);
	4 后台进程，line 60.必须先于start()运行,而且不用控制结束。
	运行和普通进程一模一样，仅仅是不用控制结束。当前台进程结束后，它自动结束，看方法说明。

36-多线程(其他方法-join等).avi (18:53)
JoinDemo.java
	join,setPriority(1-10,仅仅是概率),toString,threadGroup，yield

//BK --day14 M-Thread 13Test
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
StringDemo.java //BK --day15 String 1特点
01-常用对象API(String类-特点).avi (23:42)
	1 特点：字符串对象一旦被初始化就不会被改变。
	2 字符串常量池--池中没有就建立，池中有，直接用。
		String s = "abc";
	3 new 出的对象在堆中。
		String s = new String("abc");

StringConstructorDemo.java
	1 一共有15个constructors： 1+8+2+1+3 =15
	2 byte[]--> String ： 8个，涉及到了字节到字符集的转化
	3 char[]--> String ： 2个

StringMethodDemo.java //BK --day15 String 2功能:获取,转换,判断,比较
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

StringObjectDemo.java //BK --day15 String 3常量池操作
	//intern():对字符串池进行操作的,把堆中数据，放入常量池中

//BK --day15 String 4Examples ???you can take more practice here!
StringTest.java
	0, String 当形式参数传参数
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
				StringBuffer append(data); --14 //BK --day15 StringBuffer have look on how append work
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
		5, others:
				public StringBuffer reverse() ;

//BK --day15 StringBuilder
StringBuilderDemo.java
	jdk1.5以后出现了功能和StringBuffer一模一样的类，就是StringBuilder
	不同的是：
		StringBuffer是线程同步的。通常用于多线程。
		StringBuilder是线程不同步的。通常用于单线程。 它的出现提高效率。

StringBuilderTest.java
 	将一个int[]数组变成字符串。
	 	eg1：用String会浪费空间，每次都会产生新的String在常量池中。
	 	eg2：用StringBuffer可以提高效率。
	如果你保存的数据要以字符串的形式来使用则用stringbuffer 和stringbuilder的形式。
	一旦进入他们取出的就只有字符串了数组，存入和取出的格式一样的。

//BK --day16 0StringBuilder 1形式参数
StringBuilderTest16.java
	形式参数的变化
	stringbuilder练习.bmp
	string内存图.bmp

//BK --day16 8种包装类
WrapperDemo16.java
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
		1.基本类型--->字符串 --2
			1,基本类型数值+""
			2,用String类中的静态方法valueOf(基本类型数值);
		2.字符串--->基本类型 --2
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

WrapperDemo2.java //BK --day16 8种包装类 自动拆箱装箱
	5 自动拆箱装箱
		jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
WrapperTest.java

//BK --day16 Collection
Collection --15 methods
	|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
		|--Vector    :内部是数组数据结构，是同步的。 增删，查询都很慢！          --4 constructions  42 methods
		|--ArrayList :内部是数组数据结构，是不同步的。替代了Vector。查询的速度快! --3 constructions  20 methods
		|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。		   --2 constructions  39 methods
	|--Set ：无序，元素不能重复。
		|--HashSet：内部数据结构是哈希表，是不同步的。        --4Con + 8Meds
		|--TreeSet：可以对Set集合中的元素进行排序,是不同步的。 --4Con + 26Meds
CollectionDemo.java //BK --day16 Collection 1-16methods
	1 集合类的由来：
		对象用于封装特有数据，对象多了需要存储，如果对象的个数不确定，就使用集合容器进行存储。
	2 集合特点：
		1，用于存储对象的容器。
		2，集合的长度是可变的。
		3，集合中不可以存储基本数据类型值。
		tips:数组和集合类同是容器，有何不同？
			数组虽然也可以存储对象，但长度是固定的；
			集合长度是可变，切存入元素也可以变。
			数组中可以存储基本数据类型，集合只能存储对象。
集合框架.bmp
	3 集合框架:
		集合容器因为内部的数据结构不同，有多种具体容器，不断的向上抽取，就形成了集合框架。
	4 框架的顶层Collection接口 --16 methods
		1)，增 Create --2
			boolean add(Object obj):
			boolean addAll(Collection coll):
		2)，删 Delete--3
			boolean remove(object obj):
			boolean removeAll(Collection coll);
			void clear();
		3)，判断：--3
			boolean contains(object obj):
			boolean containsAll(Colllection coll);
			boolean isEmpty():判断集合中是否有元素。
		4)，查：--2
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
CollectionDemo.java// BK --day16 Collection 2Iterator
	5  Iterator -- 3 methods
		1) difference with Enumeration --2
			 1Iterator增加： remove elements
			 2Method names improved
		2) three methods
			 boolean hasNext()
			 E next()
			 void remove()

//BK --day16 Collection 3List
|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
		|--Vector    :内部是数组数据结构，是同步的。 增删，查询都很慢！          --4 constructions  42 methods
		|--ArrayList :内部是数组数据结构，是不同步的。替代了Vector。查询的速度快! --3 constructions  20 methods
		|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。		   --2 constructions  39 methods
List:
	//TODO 3 数组和链表的结构
		http://www.cnblogs.com/smyhvae/p/4761593.html
		https://book.douban.com/reading/10711140/
		http://blog.csdn.net/fightforyourdream/article/details/16353519
		https://zh.wikipedia.org/wiki/链表
		http://cmsblogs.com/?p=155
		http://wiki.jikexueyuan.com/project/java-enhancement/java-twenty.html

ListDemo.java //BK --day16 Collection 3List 1特有的常见方法--可以操作角标
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

ListDemo2.java // BK --day16 Collection 3List 4ArrayList 1特有ListIterator
	2 listIterator -- 9 methods (3 Iterator +6 增加功能)
		add(E e) ，  hasPrevious() ， nextIndex()
		previous() ，previousIndex(), set(E e)
		tips: listIterator可以实现在迭代过程中完成对元素的增删改查。
		      只有list集合具备该迭代功能.

10-常用对象API(集合框架-List常用子类的特点).avi (19:18)
Collection --15 methods
	|--List：有序(存入和取出的顺序一致),元素都有索引(角标)，元素可以重复。
		|--Vector    :内部是数组数据结构，是同步的。 增删，查询都很慢！          --4 constructions  42 methods
		|--ArrayList :内部是数组数据结构，是不同步的。替代了Vector。查询的速度快! --3 constructions  20 methods
		|--LinkedList:内部是链表数据结构，是不同步的。增删元素的速度很快。		   --2 constructions  39 methods
	|--Set ：无序，元素不能重复。

VectorDemo.java //BK --day17 Collection 3List 5Vector
	5 Vector 有element的都是特有方法。
	有自己的迭代器：Enumeration en = v.elements();

12-常用对象API(集合框架-Vector集合).avi
		1) difference with Enumeration --2
			 1Iterator增加： remove elements
			 2Method names improved
		2) three methods
			 boolean hasNext()
			 E next()
			 void remove()

LinkedListDemo.java  //BK --day17 Collection 3List 6LinkedList 1特有的常见方法
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
//BK --day17 Collection 3List 6LinkedList 2模拟队列和栈
LinkedTest.java
DuiLie.java
Stack.java
	7 两个模拟题
		 请使用LinkedList来模拟一个堆栈或者队列数据结构。
		 堆栈：先进后出 First In Last Out  FILO
		 队列：先进先出 First In First Out FIFO
		 我们应该描述这样一个容器，给使用提供一个容器对象完成这两种结构中的一种。

ArrayListTest.java //BK --day17 Collection 3List 7ArrayList 1常见方法
Person.java
	8 ArrayList
	请定义ArryaList集合，并存储Person对象。如new Person("lisi",20);
	并取出。将姓名和年龄打印出来。
ArrayListTest2.java  --20-常用对象API(集合框架练习).avi (17:35)
	定义功能去除ArrayList中的重复元素。
	tips: contains, remove 等的判断也用到了equals，方法，所以要overwrite.

//BK --day17 Collection 4Set
Set ：无序，元素不能重复。 Set接口和Collection一致。--16 methods
	|--HashSet ：内部数据结构是哈希表 ，是不同步的。        --4Con + 8Meds
	|--TreeSet ：可以对Set集合中的元素进行排序。是不同步的。 --4Con + 26Meds

HashSetDemo.java  //BK --day17 Collection 4Set 1HashSet
	|--HashSet: 内部数据结构是哈希表 ，是不同步的。 --4Con + 8Meds (all from set)
哈希表.bmp
		1 如何保证该集合的元素唯一性呢？哈希表确定元素是否相同
			1)，hashCode的方法
			  	判断的是两个元素的哈希值是否相同-hashCode
			  	如果相同，在判断两个对象的内容是否相同-equals
			2)，equals方法
				判断内容相同，用的是equals方法。
			tips：如果哈希值不同，是不需要判断equals。
		2 原则：
			如果元素要存储到HashSet集合中，必须覆盖hashCode方法和equals方法。
			一般情况下，如果定义的类会产生很多对象，比如人，学生，书，通常都需要覆盖equals，hashCode方法。
			建立对象判断是否相同的依据。
		3 Test ：
			往hashSet集合中存储Person对象。如果姓名和年龄相同，视为同一个人。视为相同元素。
ArrayListTest2.java
			定义功能去除ArrayList中的重复元素。
				o.contains(e) 只用到o.equals(e) 方法。
				o.remove(e)，只用到了o.equals(e)判断

LinkedHashSetDemo.java  //BK --day17 Collection 4Set 1HashSet 1LinkedHashSet
		4 LinkedHashSet:有序  --4Con+0 Med

TreeSetDemo.java //BK --day17 Collection 4Set 2TreeSet
	|--TreeSet:可以对Set集合中的元素进行排序。是不同步的。 --4Con + 26Meds
		1 判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。
itcastday17.p.bean.Person.java //BK --day17 Collection 4Set 2TreeSet 1比较器1
		2 TreeSet对元素进行排序的方式一：
			让元素自身具备比较功能，Person类实现Comparable接口,覆盖compareTo方法。
ComparatorByLength.java //BK --day17 Collection 4Set 2TreeSet 1比较器2
ComparatorByName.java
		3 TreeSet集合第二种排序方式二：
			让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。
			将该类对象作为参数传递给TreeSet集合的构造函数。
二叉树.bmp //TODO 3 二叉树 数据结构
TreeSetTest.java
	对字符串进行长度排序。

//BK --day18 Generic
GenericDemo.java
01-常用对象API(集合框架-泛型-概述).avi (23: 7)
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

02-常用对象API(集合框架-泛型-擦除&补偿).avi (12:43)
	4 Tips -擦除-补偿
		1 在程序中，只要用到了带有<>的类或者接口，就要明确传入的具体引用数据类型。
		2 泛型技术是给编译器使用的技术,用于编译时期,确保类型的安全。
		3 运行时，会将泛型去掉，生成的class文件中是不带泛型的,这个称为泛型的擦除。
		  为什么擦除呢？因为为了兼容运行的类加载器。以前的类加载器没有此功能。
		4 泛型的补偿：在运行时，通过获取元素的类型（object.getClass().getName()）进行转换动作,不用使用者在强制转换了。

03-常用对象API(集合框架-泛型-在集合中的应用).avi (21:11)
GenericDemo2.java

04-常用对象API(集合框架-泛型-泛型类).avi (14:14)
GenericDefineDemo3.java --泛型类
Tool.java //BK --day18 Generic 1类
	5 泛型类。
		eg:class Tool<QQ>{}

05-常用对象API(集合框架-泛型-泛型方法).avi (12:42)
GenericDefineDemo4.java --泛型方法
Tool.java //BK --day18 Generic 2方法
	6 将泛方法。
		eg1 general :
			public <W> void show(W a){}
		eg2 static :当方法静态时，不能访问类上定义的泛型。如果静态方法使用泛型，只能将泛型定义在方法上。
			public static <Y> void method(Y obj){}

06-常用对象API(集合框架-泛型-泛型接口).avi ( 4:19)
GenericDefineDemo5.java --泛型接口 //BK --day18 Generic 3接口
	7 泛型接口
		eg1:interface Inter<T>{}
			可以在实现它的类中写出泛型 ：class InterImpl2<Q> implements Inter<Q>
			也可以在实现具体对象时，写出泛型 ： class InterImpl implements Inter<String>

07-常用对象API(集合框架-泛型-泛型限定(上限)).avi (25:45)
08-常用对象API(集合框架-泛型-泛型限定(下限)).avi ( 5:53)
09-常用对象API(集合框架-泛型-泛型限定(上限的体现)).avi (11:42)
10-常用对象API(集合框架-泛型-泛型限定(下限的体现)).avi (18: 1)
11-常用对象API(集合框架-泛型-泛型限定(通配符的体现)).avi ( 8:16)
GenericAdvanceDemo.java//BK --day18 Generic 4通配符1
	8 泛型的通配符：? 未知类型,用于泛型的限定：
		eg: public static void printCollection(Collection<?> al)
GenericAdvanceDemo4.java //BK --day18 Generic 4通配符2
		3）?单独使用：equals，containsAll，removeAll比较的是任意对象，可以不写，为了约束就写？
		containsAll(Collection<?> c)

GenericAdvanceDemo2.java //BK --day18 Generic 5上限
		1 <? extends E>: 接收E类型或者E的子类型对象。上限
		一般存储对象的时候用。比如 添加元素 addAll.
			eg: java.util.ArrayList.addAll(Collection<? extends E>)

GenericAdvanceDemo3.java //BK --day18 Generic 5下限
		2 <? super E>: 接收E类型或者E的父类型对象。 下限。
		一般取出对象的时候用。比如比较器:
			java.util.TreeSet.TreeSet<Worker>(Comparator<? super Worker> comparator)
			2）什么时候用下限呢？通常对集合中的元素进行取出操作时，可以是用下限。
				eg: Tree(Comparator<? super Worker> comp);
				精华在：line 22 ,GenericAdvanceDemo4.java
					TreeSet<Student> a = new TreeSet<Student>(new CompByStuName());     // 学生可以传入自己的比较器
					TreeSet<Student> a = new TreeSet<Student>(new CompByName());        // 学生可以传入自己的爹的比较器
				Wrong:TreeSet<Student> a = new TreeSet<Student>(new CompByWorkerName());//学生可以传入自己的儿子的比较器


//BK --day18 Collection 6Summary
12-常用对象API(集合框架-集合查阅的技巧).avi ( 8:10)
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

//BK --day18 Collection 5Map
	 |--Hashtable :内部结构是哈希表，是同步的。不允许null作为键，null作为值。
		 |--Properties：用来存储键值对型的配置文件的信息，可以和IO技术相结合。
Map--|--HashMap : 内部结构是哈希表，不是同步的。允许null作为键，null作为值。
		 |--LinkedHashMap: 内部有哈希表和双向链表
	 |--TreeMap : 内部结构是二叉树，不是同步的。可以对Map集合中的键进行排序。

//TODO 1 如何理解一个map，它怎么存储，怎么使用？Test18.txt
  		http://www.importnew.com/10620.html
  		http://java.freesion.com/article/31342852080/
  		http://www.iteye.com/topic/838030
  		http://blog.csdn.net/csfreebird/article/details/7347026
//BK --day18 Collection 5Map 1-14 Methods
MapDemo.java
	1 Map：--0 Cons+ 14 Methods
		一次添加一对元素。Collection 一次添加一个元素。
		Map也称为双列集合，Collection集合称为单列集合。
		其实map集合中存储的就是键值对。
		map集合中必须保证键的唯一性。
	2 常用方法：
		1，增。
			value put(key,value):返回前一个和key关联的值，如果没有返回null.
		2，删。
			void  clear():清空map集合。
			value remove(key):根据指定的key翻出这个键值对。
		3，改。
			No-Only has put
			迭代器里面有：setValue(V value)
		4，查。
			boolean containsKey(key):
			boolean containsValue(value):
			boolean isEmpty();

			1)value get(key):通过键获取值，如果没有该键返回null。
							 当然可以通过返回null，来判断是否包含指定键。
			2)int size(): 获取键值对的个数。

KeySet图解.bmp
			3)通过Map转成set就可以迭代:keySet()
			eg:    Set<K>	keySet()

entrySet图解.bmp
			4)另一个方法:entrySet。
				该方法将键和值的映射关系作为对象存储到了Set集合中，而这个映射关系的类型就是Map.Entry类型(结婚证)
				见 代码“ class MyDemo implements MyMap.MyEntry {}” 自己定了了接口中的接口.为什么用内部类？
					因为entry是key-value 的关系对象，只有现有map才会有key-value。
					内部类static 暴露，能让外部直接用到。
			5) map.values(); 返回一个collections


//BK --day18 Collection 5Map 2常用子类
	3 Map常用的子类：
		|--Hashtable :内部结构是哈希表，是同步的。不允许null作为键，null作为值。
			|--Properties：用来存储键值对型的配置文件的信息，可以和IO技术相结合。
HashMapDemo.java  //BK --day18 Collection 5Map 2常用子类 1HashMap
		|--HashMap : 内部结构是哈希表，不是同步的。允许null作为键，null作为值。
LinkedHashMapDemo.java --有序的map //BK --day18 Collection 5Map 2常用子类 3LinkedHashMap
			|--LinkedHashMap: 内部有哈希表和双向链表
TreeMapDemo.java //BK --day18 Collection 5Map 2常用子类 2TreeMap
		|--TreeMap : 内部结构是二叉树，不是同步的。可以对Map集合中的键进行排序。


	4 Test
MapTest.java
	"fdgavcbsacdfs" 获取该字符串中，每一个字母出现的次数。
MapTest2.java
	查表法

//BK --day19 1Collections
CollectionsDemo.java
ComparatorByLength.java
	Collections --52 static methods
		13-常用对象API(集合框架-工具类-Collections-排序).avi (25: 4)
		14-常用对象API(集合框架-工具类-Collections-折半&最值).avi ( 5:30)
		15-常用对象API(集合框架-工具类-Collections-逆序&替换).avi (11:58)
		16-常用对象API(集合框架-工具类-Collections-其他方法&将非同步集合转成同步集合的方法).avi (15:34)

//BK --day19 2Arrays
ArraysDemo.java
17-常用对象API(集合框架-工具类-Arrays-方法介绍).avi (11:32)
	Arrays--105 static methods
	1> Array --> list
18-常用对象API(集合框架-工具类-Arrays-asList方法).avi (15:16)
		1) 重点：List asList(数组)将数组转成集合。
		   好处：其实可以使用集合的方法操作数组中的元素,对列表的更改会“直接写”到数组。
		   注意：数组的长度是固定的，所以对于集合的增删方法是不可以使用的,否则会发生UnsupportedOperationException
		2) 如果数组中的元素是对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行集合存储。
		   如果数组中的元素是基本类型数值，那么会将该数组作为集合中的元素进行存储。

ToArray.java
	2> Collections --> Array
19-常用对象API(集合框架-工具类-Collections-toArray方法).avi (11:49)
	 	1)使用的就是Collection接口中的toArray方法。
		  集合转成数组：可以对集合中的元素操作的方法进行限定,不允许对其进行增删。
		2)toArray方法需要传入一个指定类型的数组。
		  长度该如何定义呢？
		  如果长度小于集合的size，那么该方法会创建一个同类型并和集合相同size的数组。
		  如果长度大于集合的size，那么该方法就会使用指定的数组，存储集合中的元素，其他位置默认为null。
		  所以建议，最后长度就指定为，集合的size。

//BK --day19 JDK5
JDK升级
	1，简化书写。
	2，提高效率。
	3，增加安全性。
ForEachDemo.java//BK --day19 JDK5 1ForEach
 	Foreach语句：
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


ParamterDemo.java //BK --day19 JDK5 2ParameterFunction
	函数的可变参数。 其实就是一个数组，但是接收的是数组的元素。 自动将这些元素封装成数组。简化了调用者的书写。
		注意：可变参数类型，必须定义在参数列表的结尾。
		eg：public static int newAdd(int a, int... arr) {


StaticImportDemo.java  //BK --day19 JDK5 3StaticImport
	import static java.util.Collections.*;  //静态导入，其实到入的是类中的静态成员。
	import static java.util.Collections.max;//静态导入，其实到入的是类中的静态成员。

//BK --day20 0OtherAPI
SystemDemo.java & 系统信息.txt --0Cons+26Meds //BK --day20 0OtherAPI 1System
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

RuntimeDemo.java  //BK --day20 0OtherAPI 2Runtime
	Runtime:没有构造方法摘要，说明该类不可以创建对象。
	又发现还有非静态的方法。说明该类应该提供静态的返回该类对象的方法。
	而且只有一个，说明Runtime类使用了单例设计模式。

MathDemo.java
DateDemo.java
CalendarDemo.java

//BK --day20 IO
01-IO流(输入流&输出流).avi ( 9:53)
1 Basic
 	1)输入流和输出流相对于内存设备而言.
		输入:将外设中的数据读取到内存中.
		输出:将内存的数写入到外设中.

02-IO流(字节流&字符流).avi (10:31)
	2)字节流和字符流
		字节流-- 电脑识别的都是二进制文件。
		字符流-- 字节流+编码表
			字节流读取文字字节数据后，不直接操作而是先查指定的编码表。
			获取对应的文字，在对这个文字进行操作。简单说：字节流+编码表
			eg: Ascall码表，让计算机识别生活中的文字。a-97,A-67.把字母对应到了人可以识别的文字。
				Unicode，世界通用的编码。因为各个国家的编码不同，同一个字母a，对应不同的编码。所以出生了Unicode

03-IO流(字符流-FileWriter).avi (26:55)
04-IO流(字符流-FileWriter-细节(换行和续写)).avi ( 6:45)
FileWriterDemo.java //BK --day20 IO 1写字符到文件
	2 BaseClass
		字节流的两个顶层父类：
			InputStream
			OutputStream.
		字符流的两个顶层父类：
			Reader -- 2Cons+10Meds
			Writer -- 2Cons+10Meds
		Tips：这些体系的子类都以父类名作为后缀，而且子类名的前缀就是该对象的功能。
			eg:BufferedWriter, CharArrayWriter, FilterWriter,
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


05-IO流(字符流-FileWriter-IO异常处理).avi ( 8:24)
IOExceptionDemo.java  //BK --day20 IO 1写字符到文件 1异常处理
	4 Exception
		1 写入三步都要异常处理
		2 close().必须有，放在finally
		3 先判断文件是否存在，在close();

FileReaderDemo.java  //BK --day20 IO 2读文件到字符 1单个字符
FileReaderDemo2.java //BK --day20 IO 2读文件到字符 2字符数组
	5 Read
		需求：读取一个文本文件。将读取到的字符打印到控制台.
		思路：同上，找到了FileReader

//BK --day21
CopyTextTest.java  //BK --day21 IO 3复制文件1
CopyTextTest_2.java //BK --day21 IO 3复制文件2
复制文本文件图解.bmp
	6 Test:将c盘的一个文本文件复制到d盘。
		分析：复制原理：
			读取c盘文件中的数据，
			将这些数据写入到d盘当中。
			连读带写。

	BufferedWriter
		：newLine();
	BufferedReader:
		: readLine();

BufferedWriterDemo.java //BK --day21 IO-4缓冲1写
	创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联

BufferedReaderDemo.java //BK --day21 IO-4缓冲2读
	读取字符从文件，通过buffer
readLine方法原理.bmp
	二级缓存，一级缓存的数据用回车符分割成二级数据。

CopyTextByBufTest.java //BK --day21 IO-4缓冲3Copy
	使用缓冲区复制一个文本文件。

MyBufferedReader.java //BK --day21 IO-4缓冲4DIY
MyBufferedReaderDemo.java
	自定义的读取缓冲区。其实就是模拟一个BufferedReader.


PersonDemo21.java //BK --day21 IO-3装饰设计模式
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
	但是这样做并不理想。
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


ByteStreamDemo.java //BK --day21 IO-5字节流
ByteStreamDemoTest.java

	字节流输入输出
CopyMp3Test.java //BK --day21 IO-5字节流 1copyMp3 4ways
	复制mp3

//BK --day22
ReadKey.java  //BK --day22 IO-5键盘
	1） 读取一个键盘录入的数据，并打印在控制台上。
		键盘本身就是一个标准的输入设备。
		对于java而言，对于这种输入设备都有对应的对象。
		int ch = in.read();//阻塞式方法。
	2） 获取用户键盘录入的数据，
		并将数据变成大写显示在控制台上，
		如果用户输入的是over，结束键盘录入。
字节流：
    InputStream
    OutputStream
        FileInputStream
        FileOutputStream
        BufferedInputStream
        BufferedOutputStream
字符流：
    Writer
    Reader
        FileReader
        FileWriter
        BufferedReader
        BufferedWriter


//BK --day22 IO-6流桥梁
TransStreamDemo.java
转换流桥梁.bmp
TransStreamDemo2.java --简化版

============================================================
TransStreamDemo3.java
	转换流：
	InputStreamReader ：字节到字符的桥梁。解码。
	OutputStreamWriter：字符到字节的桥梁。编码。

	流的操作规律：
	之所以要弄清楚这个规律，是因为流对象太多，开发时不知道用哪个对象合适。

	想要知道开发时用到哪些对象。只要通过四个明确即可。

	1，明确源和目的(汇)
		源：InputStream  Reader
		目的：OutputStream  Writer

	2，明确数据是否是纯文本数据。
		源：是纯文本：Reader
			否：InputStream
		目的：是纯文本 Writer
			否：OutputStream

		到这里，就可以明确需求中具体要使用哪个体系。

	3，明确具体的设备。
		源设备：
			硬盘：File
			键盘：System.in
			内存：数组
			网络：Socket流

		目的设备：
			硬盘：File
			控制台：System.out
			内存：数组
			网络：Socket流

	4，是否需要其他额外功能。
		1，是否需要高效(缓冲区);
			是，就加上buffer.
		2，转换。


	什么时候使用转换流呢？

		1，源或者目的对应的设备是字节流，但是操作的却是文本数据，可以使用转换作为桥梁。
			提高对文本操作的便捷。
		2，一旦操作文本涉及到具体的指定编码表时，必须使用转换流 。



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

//BK --day22 IO-7File类 4 Cons+ 49 Mends -----------------------------
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



//BK --day23 IO-8Others
IO中的其他功能流对象：
//BK --day24 IO-8O-1PrintStream
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
//BK --day24 IO-8O-2PrintStream
SequenceInputStream:
	特点：
	1，将多个字节读取流和并成一个读取流，将多个源合并成一个源，操作起来方便。
	2，需要的枚举接口可以通过Collections.enumeration(collection);


//BK --day24 IO-8O-3ObjectInputStream
ObjectInputStream 和 ObjectOutputStream

对象的序列化和反序列化。

writeObject  readObject

Serializable标记接口

关键字：transient

RandomAccessFileDemo
RandomAccessFile:
	特点：
		1，即可读取，又可以写入。
		2，内部维护了一个大型的byte数组，通过对数组的操作完成读取和写入。
		3，通过getFilePointer方法获取指针的位置，还可以通过seek方法设置指针的位置。
		4，该对象的内容应该封装了字节输入流和字节输出流。
		5，该对象只能操作文件。
		6, Random 指seek 可以指定任意位置,任意位置开始读写.
		7, 可以用于多线程同时写入

	通过seek方法操作指针，可以从这个数组中的任意位置上进行读和写
	可以完成对数据的修改。
	但是要注意：数据必须有规律,随机才会有意义!


//BK --day24 IO-8O-5PipedOutputStream
管道流：需要和多线程技术相结合的流对象。
PipedOutputStream
PipedInputStream



//BK --day24 IO-8O-6DataInputStream
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

//BK --day25 GUI
//BK --day25 GUI 1Applet
Basic Labels
	Applet1--Graphics
	Applet2--button awt event bad!
	Applet3--text Field
Layout:
	FlowLayout1.java
	BorderLayout1.java
	GridLayout1.java

//BK --day25 GUI 2事件机制
Applet2   --Older One
FrameDemo --New One
事件监听机制.bmp
MouseAndKeyDemo.java -eg

//BK --day25 GUI Jigloo
MySwing.java--07-GUI(Swing演示&装插件).avi (17:47)
MyWindow.java--08-GUI(练习-列出目录内容).avi (11:50)
MyMenu.java--09-GUI(菜单).avi (10:50)->10-GUI(练习).avi (22:48)
NewJFrame.java
DebugDemo.java

//BK --day28 Reflection
01-反射机制(概述&应用场景).avi
Class类.bmp
反射机制.bmp
ReflectDemo.java
	JAVA反射机制是在运行状态中，对于任意一个类 (class文件)，都能够知道这个类的所有属性和方法；
	对于任意一个对象，都能够调用它的任意一个方法和属性；
	这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。

	动态获取类中信息，就是java反射 。
	可以理解为对类的解剖。

	要想要对字节码文件进行解剖，必须要有字节码文件对象.
	如何获取字节码文件对象呢？

02-反射机制(细节&Class对象).avi
反射机制.bmp
03-反射机制(获取Class对象的三种方式).avi

04-反射机制(获取Class中的构造函数).avi
ReflectDemo2.java  // BK --day28 Reflection 2Get Constructor


05-反射机制(获取Class中的字段).avi
ReflectDemo3.java  // BK --day28 Reflection 3Get Field


06-反射机制(获取Class中的方法).avi
ReflectDemo4.java  // BK --day28 Reflection 4Get Method


07-反射机制(反射练习).avi
RunComputer.java// BK --day28 Reflection 4Practice


// BK --day28 Regex
RegexDemo.java
	java.util.regex--package
	Pattern --8Methods
	Matcher --34Methods
	正则表达式。
		正则表达式用于操作字符串数据,通过一些特定的符号来体现的。
		所以我们为了掌握正则表达式，必须要学习一些符号。
		虽然简化了，但是阅读性差。
RegexDemo2.java // BK --day28 Regex 1匹配切割替换获取
	正则表达式对字符串的常见操作:
		1, 匹配。 其实使用的就是String类中的matches方法。
		2，切割。 其实使用的就是String类中的split方法。
		3，替换。 其实使用的就是String类中的replaceAll()方法。
		4，获取。

RegexTest.java
	1，治疗口吃:我我...我我...我我我要...要要要要...要要要要..学学学学学...学学编编...编编编编..编..程程...程程...程程程
	2，对ip地址排序。
	3，对邮件地址校验。

RegexTest2.java
 	网页爬虫：其实就一个程序用于在互联网中获取符合指定规则的数据。
 	爬取邮箱地址。
// BK --day28 Regex ???主要得写正则表达式,和理解Master的各种方法.
//BK --day29-30 HTML CSS

//BK --day36 Debug Tricks
http://langgufu.iteye.com/blog/1168366
9.我们常说的断点(breakpoints)是指line breakpoints,除了line breakpoints,
还有其他的断点类型：field(watchpoint)breakpoint,method breakpoint ,exception breakpoint.
10.field breakpoint 也叫watchpoint(监视点) 当成员变量被读取或修改时暂挂
11.添加method breakpoint 进入/离开此方法时暂挂(Run-method breakpoint)
12.添加Exception breakpoint 捕抓到Execption时暂挂(待续...)
13 Drop to Frame：
	1.不能drop到已经执行过的方法栈中的方法中。
	2.drop到stack frame中时，不会改变全局数据原有的值，比如，一个包含元素的vertor并不会被清空。
	3,但是在执行过程中也会产生一些副作用，比如插入到数据库里面的数据是无法删除的！
14 Display View ：
	可以使用这个视图，输入或者演算一些新的代码。这些代码在当前的调试位置的上下文环境中被执行，这意味着，你可以使用
	所有变量甚至是内容助手。要执行你的代码的话，只需标记它，并使用右键菜单或者CTRL+U(执行)或者 CTRL+SHIFT+I (检查).


//BK --day37 Think
2-Object
HelloDate.java
ShowProperties.java

文档注释:
Documentation1.java
Documentation2.java
Documentation3.java


//BK --day37 Think 03Operate
HelloDate.java --static import
Precedence.java--P72
Assignment.java--P73
PassObject.java--P73
MathOps.java--P74
AutoInc.java--P76
Equivalence.java--P76
EqualsMethod.java--P76
EqualsMethod2.java--P77
Bool.java--P78
ShortCircuit.java--P79
Literals.java--P80
Exponents.java--P81
URShift.java--P83
BitManipulation.java--P84
TernaryIfElse.java--P86
StringOperators.java--P86
Casting.java--P88
CastingNumbers.java--P88
RoundingNumbers.java--P88
AllOps.java--P89
Overflow.java--P96

//BK --day37 Think 04Controlls
IfElse.java--P94
WhileTest.java--P98
ListCharacters.java--P99
CommaOperator.java--P100
ForEachFloat.java--P100
ForEachString.java--P101
ForEachInt.java--P101
IfElse2.java--P102
BreakAndContinue.java --P103
LabeledFor.java --P104
LabeledWhile.java --P105
VowelsAndConsonants.java --P107

//BK --day37 Think 05Initialization
SimpleConstructor.java --P109
SimpleConstructor2.java --P110
Overloading.java--P111
OverloadingOrder.java --P112
PrimitiveOverloading.java

Demotion.java--P114
DefaultConstructor.java--P116
NoSynthesis.java--P116
BananaPeel.java--P117
Apricot.java
Leaf.java

PassingThis.java--P118

Flower.java--P118
TerminationCondition.java --P122

InitialValues.java --P125
InitialValues2.java
Measurement.java --P126
MethodInit.java
MethodInit2.java
MethodInit3.java

Counter.java--P127
OrderOfInitialization.java--P127
StaticInitialization.java--P128
Spoon.java--P130
ExplicitStatic.java
Mugs.java

ArraysOfPrimitives.java--P132
ArrayNew.java
ArrayClassObj.java
ArrayInit.java
DynamicArray.java

OverloadingVarargs.java --P137
OverloadingVarargs2.java
OverloadingVarargs3.java

VarArgs.java--P135
NewVarArgs.java
VarargType.java

SimpleEnumUse.java --P139 枚举
Spiciness.java
EnumOrder.java
Burrito.java

AutoboxingVarargs.java
OptionalTrailingArguments.java


//BK --day37 Think 06Access
FullQualification.java --P142
SingleImport.java


Cake.java
ChocolateChip.java
ChocolateChip2.java
Dinner.java

IceCream.java
ImportedMyClass.java
LibTest.java
Lunch.java
OrganizedByAccess.java
Pie.java
PrintTest.java
QualifiedMyClass.java

//BK --day37 Think 07Resusing

SprinklerSystem.java
Bath.java
Detergent.java
Cartoon.java --P162
Chess.java

SpaceShipControls.java
SpaceShip.java
SpaceShipDelegation.java

Hide.java
PlaceSetting.java
CADSystem.java--P166
Car.java

Orc.java
Wind.java--P172


FinalData.java--P173
FinalArguments.java


FinalOverridingIllusion.java--P173
BlankFinal.java
Jurassic.java

Beetle.java--P179


Lisa.java


//BK --day37 Think 08Polymorphism
Note.java--P181
Instrument.java
Music.java
Music2.java
Wind.java

Shapes.java--P185
Circle.java
RandomShapeGenerator.java
Shape.java
Square.java
Triangle.java

Music3.java--P188
PrivateOverride.java
FieldAccess.java
StaticPolymorphism.java--P189

Sandwich.java--P191
Frog.java
ReferenceCounting.java

PolyConstructors.java--P196
CovariantReturn.java--P197
Transmogrify.java--P198
RTTI.java

//BK --day37 Think 09Interfaces-202
AdaptedRandomDoubles.java--P216
Adventure.java
Months.java
Factories.java
Games.java
HorrorShow.java
InterfaceCollision.java
RandomDoubles.java
RandomWords.java
RandVals.java
TestRandVals.java

//BK --day37 Think 10Inner Classes-223
AnonymousConstructor.java
BigEgg.java
BigEgg2.java
Callbacks.java
ClassInInterface.java
Contents.java
Destination.java
DotNew.java
DotThis.java
Factories.java
Games.java
GreenhouseController.java
GreenhouseControls.java
InheritInner.java
LocalInnerClass.java
MultiImplementation.java
MultiInterfaces.java
MultiNestingAccess.java
Parcel1.java
Parcel10.java
Parcel11.java
Parcel2.java
Parcel3.java
Parcel5.java
Parcel6.java
Parcel7.java
Parcel7b.java
Parcel8.java
Parcel9.java
Sequence.java
TestBed.java
TestParcel.java
Wrapping.java


//BK --day37 Think 11Holding Objects-249 =32
//BK --day37 Think 12Error Handling-281 =35
//BK --day37 Think 13Strings-316 =30
//BK --day37 Think 14Type Information-346 =39
//BK --day37 Think 15Generics-385 =81
//BK --day37 Think 16Arrays-466 =26
//BK --day37 Think 17Containers in Depth-492 = 66
//BK --day37 Think 18I/O-558 =74
//BK --day37 Think 19Enumerated Types-632 =21
//BK --day37 Think 20Annotations-653 =30
 *
 *
//BK --day37 Think 21Concurrency-683 =206
//BK --day37 Think 22GUI-801-889 = 88




//BK --day38 DataStructure
//BK --day38 DataStructure-Algorithm Introduction
InsertSort --P39-English


//BK --day39 Junit
//BK --day39 Junit 1Parameterized Test
https://www.tutorialspoint.com/junit/junit_parameterized_test.htm
A1TwoSumTest.java

//BK --day39 Junit 2Mockito
http://www.tutorialspoint.com/mockito/mockito_quick_guide.htm
 1 First Example
	 Portfolio
	 PortfolioTester
	 Stock
	 StockService
 
 
 
//BK --day40 JVM
Jvm1


//BK --day41 JAVA8
Java8
JavaImportnew.java


//BK --day41 JAVA8 1对接口的改变
	1) 增加了default方法和static方法.
	2) default属于实例,static属于类(接口)
	3) 静态方法不会被继承,静态变量会被继承
	4) 如果一个类实现多个接口,并且接口互相之间没有继承关系,同时存在相同的默认方法,会报错.
	5) 若有遇到多个继承,并且有相同的默认方法,实现类可以通过特殊语法指定要访问那个接口的方法.在实现类中
	   重写默认方法,在方法里面写:
	   	<接口>.super.<方法名>([参数]);
	6)如果一个接口有且只有一个抽象方法(包括继承的),该接口是一个函数式接口.
	     函数式接口, 可以使用Lambda表达式实现
	7) 若接口你们使用FunctionalInterface注解限定接口里面只能有一个抽象方法.

//BK --day41 JAVA8 2Lambda
LambdaMethods
只能应用于函数式接口
	(): 表示参数列表,不需要指定参数的类型,会自动推断
	->: 连接符
	{}: 表示方法体

	基本语法:
		([参数名称列表]) ->{
			//执行语句,方法体
		}
	最简化: 若方法体只有一句话
		()->执行语句

	引用方法
		引用类方法  : <类名>::<类方法>  , 会自动把参数全部传递给类方法.
		引用实例方法:  <实例>::<实例方法>,
		通过类引用实例方法 <类名>::<实例方法>,
		  把函数式接口的第一个参数,作为类的一个实例.
		  接口方法的参数中,第一个参数必须是::前面的类名的一个实例.

	引用构造器:<Class>::new;
		只能用于无参数构造器


//BK --day41 JAVA8 3对接口的改变
 
//BK --day41 JAVA8 4 Some pointsl 

 //1 java 双冒号是什么操作符? 
 作者：hongjiang
 链接：https://www.zhihu.com/question/28565691/answer/41325917
 来源：知乎

 eta-conversion 支持lambda表达式的语言大多都支持eta转换，scala和 haskell 里的 
 eta转换写法比较简洁： x => abs(x) 经过 eta转换可以写为 abs 
 举个例子：scala> def hf(i:Int, f: Int=>Int) = f(i)
 hf: (i: Int, f: Int => Int)Int
 scala> hf(-99, x=>Math.abs(x))
 res3: Int = 99上面对高阶函数 
 hf 传递的第二个参数 x=>Math.abs(x) 是一段lambda表达式，这个lambda经过eta转换之后可以直接写为  
 Math.abs，下面是等价的写法：scala> hf(-99, Math.abs)res2: Int = 99 上面传递的第二个参数 Math.abs 
 看上去只是一个函数名称，实际上是一段lambda的缩写。在java里同样也支持 eta 转换，
 但java对 eta转换 在风格上不同于 scala/haskell ，而是必须通过:: 来表示的，比如：number -> Math.abs(number) 
 经过eta转换后是 Math::abs 为什么Java要用:: 来表示eta转换，猜测可能是设计者考虑到java广大用户并不那么熟悉函数式风格，
 直接用一个函数名表达转换后的lambda 容易在理解上有歧义，就像上面 Math.abs 可能被新手把abs误解为Math里的一个静态常量而非方法，
 所以写成 Math::abs 就不容易误解了。

</pre>
 * @author zhanghongwei
 */
package bk;

import java.util.Arrays;

import org.junit.Test;

public class Bk
{

	@Test
	public final void testMain()
	{

		int num = 6;
		int base = 7;
		int offset = 3;

		char[] arr = new char[32];
		int pos = arr.length;

		// 定义一个对应关系表。
		char[] chs = { //
				'0', '1', '2', '3', //
				'4', '5', '6', '7', //
				'8', '9', 'A', 'B', //
				'C', 'D', 'E', 'F' };//
		// Table Method get the result
		// 1 binary 0,1
		// eg:6->110dt
		// 6 /2

		while (num != 0)
		{
			int temp = num & base;// base =1111 num=ff
			arr[--pos] = chs[temp];// pos = arr.length;
			num = num >>> offset;
		}
		System.out.println(Arrays.toString(arr));
	}
}
