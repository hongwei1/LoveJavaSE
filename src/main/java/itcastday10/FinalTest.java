package itcastday10;

/**/
class Single {
	private static Single s = new Single();

	Single() {
	}

	public static Single getInstance() {
		s = new Single();
		return s;
	}
}

class Single2 {
	private static Single2 s = null;

	private Single2() {
	}

	public static Single2 getInstance() {
		if (s == null)
			s = new Single2();
		return s;
	}
}

class FuFinal1 {
	 protected FuFinal1() {
	}
}

class ZiFinal1 extends FuFinal1 {

}

public class FinalTest {
	public FinalTest() {
	}
	protected void finalProetctMethod(){
		System.out.println("I got finalProetctMethod !!!");
	}
	public void finalPublicMethod(){
		System.out.println("I got finalPublicMethod !!!");
	}
	public static void main(String[] args) {
		new ZiFinal1();
	}
}
