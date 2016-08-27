package itcastday10;

public class UsbKeybord implements USB
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
