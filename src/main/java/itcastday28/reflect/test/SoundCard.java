package itcastday28.reflect.test;

public class SoundCard implements PciInterface
{
	@Override
	public void open()
	{
		System.out.println("sound open");
	}

	@Override
	public void close()
	{
		System.out.println("sound close");
	}

}
