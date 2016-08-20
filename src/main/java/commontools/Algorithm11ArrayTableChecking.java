package commontools;

public class Algorithm11ArrayTableChecking {
	public static void main(String[] args) {	
		String week = getWeek(72);
		System.out.println(week);
	}

	private static String getWeek(int i) {
		if(i<1 || i>7)
			return "wrong day!!!";
		
		String [] days= {"Monday","Tunesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		return days[i-1];
	}
	
}
