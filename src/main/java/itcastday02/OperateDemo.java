package itcastday02;

//算术运算符。 +  -  *  /  %(取余，模运算)  +(连接符) 
// ++(自增：就在原有数据基础上+1，在赋给原有数据) 

class OperateDemo 
{
	public static void main(String[] args) 
	{
		//integer divide will lose the accuracy
		int x = 6370;
		x = x / 1000 * 1000;
		System.out.println(x);

		// test the % function
		System.out.println(5%2);   //+1
		System.out.println(5%-2);  //+1
		System.out.println(-5%-2); //-1
		System.out.println(-5%2);  //-1
		
		// test the "+" function in String 
		System.out.println(3+"2");
		//  "+"   String connections
		System.out.println("5+5="+5+5);//"5+5=5"+5 "5+5=55"
		//  "+"  used in String ,output many variable
		int a = 4,b = 5;
		System.out.println("a="+a+",b="+b);//a=4,b=5;
		
		// ++ test 1
		a = 3; 
		System.out.println(a++); //  3;
		// ++ test 2
		a=3;
		b=0;
		b = (a++)+(++a)+(a++)+a;
			// 3 + 5 +  5 + 6 = 19 --() value
		    // 4   5    6     6    -- a value
		System.out.println("a="+a+",b="+b);
		// ++ test 3
		int i = 3;
		i = i++;// temp = i; i=i+1; i = temp;
		System.out.println("i="+i); // i=3

		
	}
}
