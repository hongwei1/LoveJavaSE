package day18.p4.generic.define.demo;

import day18.p2.bean.Father;
import day18.p2.bean.Son;

public class GenericDefineDemo3
{
	public static void main(String[] args)
	{

		Tool<Father> tool = new Tool<Father>();

		tool.setObject(new Son());
		tool.setObject(new Father());

		Father stu = tool.getObject();

		Tool tool2 = new Tool();
		tool2.setObject(new Son());
		tool2.setObject(new Father());
		tool2.setObject(new Object());
		Father stu2 = tool.getObject();
		Tool.method(new Son());

	}

}
