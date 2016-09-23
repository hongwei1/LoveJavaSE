package day0910;

import day11.MyException;

/*
	笔记本电脑使用。
	为了扩展笔记本的功能，但日后出现什么功能设备不知道。

	定义一个规则，只要日后出现的设备都符合这个规则就可以了。
	规则在Java中就是接口。

*/
interface USB // 暴露的规则。
{
	public void insert();

	public void eject();
}

class UPan implements USB// 一年前
{
	@Override
	public void insert()
	{
		System.out.println("upan open");
	}

	@Override
	public void eject()
	{
		System.out.println("upan close");
	}

}

public class Laptop
{
	public void run() throws MyException
	{
		useUSB(new UPan());
		useUSB(new UsbMouse());// 功能扩展1
		useUSB(new UsbKeybord());// 功能扩展2
	}

	// 使用规则。
	private void useUSB(USB u) throws MyException// 接口类型的引用，用于接收(指向)接口的子类对象。//USB u= new UPan();
	{
		if (u == null)
		{
			throw new MyException("USB Equipment is not working");
		}
		else
		{
			u.insert();
			u.eject();
		}
	}
}

// 一年后。------------------------------
// 实现规则。

// 这些设备和电脑的耦合性降低了。
class UsbKeybord implements USB // 一年后,实现接口
{

	@Override
	public void insert()
	{
		System.out.println("USB Keyboard is inserting !");
	}

	@Override
	public void eject()
	{
		System.out.println("USB Keyboard is ejecting !");
	}

}

class UsbMouse implements USB
{
	@Override
	public void insert()
	{
		System.out.println("UsbMouse open");
	}

	@Override
	public void eject()
	{
		System.out.println("UsbMouse close");
	}

}
