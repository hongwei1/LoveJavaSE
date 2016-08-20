package itcastday04;

class FunctionDemo3 
{
	public static void main(String[] args) 
	{
		draw(4,6);
		drawMine(4,6);
		draw(7,9);
		drawMine(7,9);
		print99();	
		print99Mine();	

		System.out.println(getScoreLevel(-10));
		
	}
	/*
	 * 1*1=1
	 * 1*2=2 2*2=4
	 * 1*3=3 2*3=6 3*3=9
	 * */
	private static void print99Mine() {
		for (int row = 0; row <=9; row++) {
			for (int column = 1; column <=row; column++)
				System.out.print(column+"*"+row+"="+column*row+"\t");
			System.out.println();
		}
	}

	private static void drawMine(int i, int j) {
		for(int row=0;row<i;row++){
			for(int column=0;column <j;column++)
				System.out.print("*");
			System.out.println();
		}
	}

	/*
	需求2： 定义一个功能，完成两个整数的和的获取。
	思路：既然定义功能，就是可以用函数来体现。
		如何定义一个函数呢？
		通过两个明确来完成。
	明确一：这个功能的结果是什么？
		是和。是功能的结果，所以该功能的返回值类型是int 。
		其实就是在明确函数的返回值类型。

			
	明确二：这个功能实现过程中是否需要未知内容参与运算？
		有，加数和被加数。这就是函数的参数列表(参数的个数，参数的类型)
		其实就是在明确参数列表。

	注意：返回值类型和参数类型没有直接关系。

	*/
	public static int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}

	/*
	需求3： 定义一个功能，画一个矩形在控制台。
	明确一：这个功能的结果是什么？
		没有结果，因为直接打印到了，控制台，并未返回给调用者。
		用void表示。
	明确二：这个功能实现过程中是否需要未知内容参与运算？
		有，行和列不确定。两个。整数 int.
	*/
	public static void draw(int row,int col)
	{
		for (int x=1; x<=row ;x++ )
		{
			for (int y=1;y<=col ; y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		return ;//可以省略不写。
	}


	/*
	需求4： 定义一个功能，比较两个数是否相等。
	明确一：这个功能的结果是什么？
			有，boolean.
	明确二：这个功能实现过程中是否需要未知内容参与运算？
			有，两个整数。

	*/
	public static boolean equals (double a,double b)
	{
		return a==b?true:false;
	}
	public static boolean equals(int a,int b)
	{
		/*
		if(a==b)
			return true;
		else
			return false;


		boolean x ;
		if(a==b)
			x = true;
		else
			x = false;
		return x;

		*/
//		return (a==b)?true:false;

		return a==b;
		
	}

	/*
	需求5： 定义一个功能，获取两个整数中较大的那个数。
	明确一：这个功能的结果是什么？
			有，其中一个数。 int
	明确二：这个功能实现过程中是否需要未知内容参与运算？
			有，参与比较的两个整数 int
	*/
	public static double getMax(double a,double b)
	{
		return a>b?a:b;
		
	}
	public static int getMax(int a,int b)
	{
		/*
		if(a>b)
			return a;
		else
			return b;
		*/

		return a>b?a:b;
	}

	/*
	定义功6，打印99乘法表。

	*/

	public static void print99()
	{
		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	/*
	 * 需求7 
	根据考试成绩获取学生分数对应的等级
	90~100		A
	80~89		B
	70~79		C
	60~69		D
	60以下		E

	结果：等级，字符，char
	参数：分数 ，int.
	*/

	public static char getScoreLevel(int scores) {
		char studentLevel = 0;
		if (scores <= 100 && scores >= 90) {
			studentLevel = 'A';
		} else if (scores < 90 && scores >= 80) {
			studentLevel = 'B';
		} else if (scores < 80 && scores >= 70) {
			studentLevel = 'C';
		} else if (scores < 70 && scores >= 60) {
			studentLevel = 'D';
		} else if (scores < 60 && scores >= 0) {
			studentLevel = 'E';
		} else {
			System.out.println("Wrong number");
		}
		return studentLevel;
	}
	
	public static char getLevel(int num)
	{
		char level ;
		if(num>=90 && num<=100)
			level = 'A';
		else if(num>=80 && num<=89)
			level =  'B';
		else if(num>=70 && num<=79)
			level =  'C';
		else if(num>=60 && num<=69)
			level =  'D';
		else 
			level =  'E';

		return level;
	}


}
