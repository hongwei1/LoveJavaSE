package day02;

//¸³ÖµÔËËã·û¡£=  += -= *= /= %=
class OperateDemo2 {
	public static void main(String[] args) {
		// = use in many variables
		int a, b, c;
		a = b = c = 4;

		a += 2;// a = a + 2;

		short s = 3;
		s += 4;
		s = (short) (s + 4);// must force cast the value
	}
}
