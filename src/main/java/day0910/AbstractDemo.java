package day0910;

abstract class È®¿Æ
{
	static String name;

	È®¿Æ()
	{
		È®¿Æ.name = "Hongwei";
	}

	abstract void ºð½Ð();

	static void ºð½Ð1()
	{
		System.out.println("wuwu " + È®¿Æ.name);
	}
}

class ¹· extends È®¿Æ
{

	@Override
	void ºð½Ð()
	{
		System.out.println("ÍôÍô " + È®¿Æ.name);
	}
}

class ÀÇ extends È®¿Æ
{
	@Override
	void ºð½Ð()
	{
		System.out.println("à»à» " + È®¿Æ.name);
	}
}

public class AbstractDemo
{
	public static void main(String[] args)
	{
		ÀÇ ÀÇ = new ÀÇ();
		ÀÇ.ºð½Ð();
		È®¿Æ.ºð½Ð1();
		System.out.println(È®¿Æ.name);
	}

}
