package itcastday28.reflect.test;

public class NetCard implements PciInterface
{

	@Override
	public void open()
	{
		System.out.println("net open");
	}

	@Override
	public void close()
	{
		System.out.println("net close");
	}

}
