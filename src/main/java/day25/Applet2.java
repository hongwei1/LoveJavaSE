package day25;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;

public class Applet2 extends Applet
{
	private static final long serialVersionUID = 1L;
	Button button1 = new Button("Butten1");
	Button button2 = new Button("Butten2");

	@Override
	public void init()
	{
		add(button1);
		add(button2);
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean action(Event evt, Object what)
	{
		if (evt.target.equals(button1))
		{
			showStatus("button1");
		}
		else if (evt.target.equals(button2))
		{
			showStatus("button2");
		}
		else
		{
			return super.action(evt, what);
		}
		return true;

	}
}
