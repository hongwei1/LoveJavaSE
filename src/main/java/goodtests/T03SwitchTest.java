package goodtests;

public class T03SwitchTest 
{
	public static void main(String[] args) 
	{

		
		/*
		用户输入的数据对应的出星期。
		*/
		int week = -1;
		
		switch(week){
		case 1:
			System.out.println(week +" is Monday");
			break;
		case 2:
			System.out.println(week +" is Tuesday");
			break;
		case 3:
			System.out.println(week +" is Wednesday");
			break;
		case 4:
			System.out.println(week +" is Thursday");
			break;
		case 5:
			System.out.println(week +" is Friday");
			break;
		case 6:
			System.out.println(week +" is Saturday");
			break;
		case 7:
			System.out.println(week +" is Sunday");
			break;
		default:
			System.out.println(week + " is not week");
			break;
		}
		
		
		//Lecture
		switch(week)
		{
			default:
				break;
			case 1:
				System.out.println(week+"对应的是星期一");
				break;
			case 2:
				System.out.println(week+"对应的是星期二");
				//break;
				//...以此类推。 
		}
		/*
		季节的示例。 
		春季：3 4 5
		夏季：6 7 8
		秋季：9 10 11
		冬季：12 1 2 
		*/

		int month = 13;
		//mine
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("it is Spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("it is Summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("it is Autumn");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("it is Winter");
				break;
			default:
				System.out.println("it is Wrong number!!");
				break;
		}
		
		//lecture
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(month+"月对应的是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"月对应的是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"月对应的是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month+"月对应的是冬季");
				break;
			default:
				System.out.println(month+"月没有对应的季节");
				//break;
		}

//		System.out.println("Hello World!");
	}
}
