package itcastday28.reflect.test;

public class Mainboard
{
	public void run()
	{
		System.out.println("main board run....");
	}

	public void usePCI(PciInterface p)
	{// PCI p = new SouncCard();
		if (p != null)
		{
			p.open();
			p.close();
		}
	}
}
