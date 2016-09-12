//: typeinfo/packageaccess/HiddenC.java
package ThinkingInJava4.typeinfo.packageaccess;

import static ThinkingInJava4.net.mindview.util.Print.print;

import ThinkingInJava4.typeinfo.interfacea.A;

class C implements A
{
	@Override
	public void f()
	{
		print("public C.f()");
	}

	public void g()
	{
		print("public C.g()");
	}

	void u()
	{
		print("package C.u()");
	}

	protected void v()
	{
		print("protected C.v()");
	}

	private void w()
	{
		print("private C.w()");
	}
}

public class HiddenC
{
	public static A makeA()
	{
		return new C();
	}
} /// :~
