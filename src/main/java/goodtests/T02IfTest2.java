package goodtests;

public class T02IfTest2 
{
	public static void main(String[] args) 
	{

		/*
		一年有四季。
		春季：3 4 5
		夏季：6 7 8
		秋季：9 10 11
		冬季：12 1 2 
		根据用户输入的月份，给出对应的季节。
		*/
		
		//t1
		int inputData = 100;
		if(inputData==12||(inputData>=1&inputData<=2))
			System.out.println("month "+inputData + " is Winter");
		else if(inputData>=3 & inputData<=5)
			System.out.println("month "+inputData + " is Spring");
		else if(inputData>=6 & inputData<=8)
			System.out.println("month "+inputData + " is Summer");
		else if(inputData>=9 & inputData<=11)		
			System.out.println("month "+inputData + " is Autumn");
		else {
			System.out.println("There is no "+inputData+" month");
		}
		
		//t2
		if(inputData ==12||inputData ==1||inputData ==2)
			System.out.println("month "+inputData + " is Winter");
		else if(inputData ==3||inputData ==4||inputData ==5)
			System.out.println("month "+inputData + " is Spring");
		else if(inputData ==6||inputData ==7||inputData ==8)
			System.out.println("month "+inputData + " is Summer");
		else if(inputData ==9||inputData ==10||inputData ==11)
			System.out.println("month "+inputData + " is Autumn");
		else {
			System.out.println("There is no "+inputData+" month");
		}
		
		
		int month = 8;
		
		if(month<1 || month>12)
			System.out.println(month+"月没有对应的季节");
		else if(month>=3 && month<=5)
			System.out.println(month+"月是春季");
		else if(month>=6 && month<=8)
			System.out.println(month+"月是夏季");
		else if(month>=9 && month<=11)
			System.out.println(month+"月是秋季");
		else 
			System.out.println(month+"月是冬季");



		/*
		if(month==3 || month==4 || month==5)
			System.out.println(month+"月是春季");
		else if(month==6 || month==7 || month==8)
			System.out.println(month+"月是夏季");
		else if(month==9 || month==10 || month==11)
			System.out.println(month+"月是秋季");
		else if(month==12 || month==1 || month==2)
			System.out.println(month+"月是冬季");
		else
			System.out.println(month+"月没有对应的季节");
			*/
			
	}
}
